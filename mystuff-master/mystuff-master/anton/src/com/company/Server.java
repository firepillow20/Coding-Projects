import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class Server {
    private Map<UUID, DataOutputStream> clients;
    private ServerSocket serverSocket;
    private Thread acceptingThread;
    private Set<String> logMessages;

    public Server() throws IOException {
        serverSocket = new ServerSocket(6800);
        clients = new ConcurrentHashMap<>();
        logMessages = new HashSet<>();
        acceptingThread = new Thread(() -> {
            while (true) {
                try {
                    Socket client = serverSocket.accept();
                    UUID newId = UUID.randomUUID();
                    clients.put(newId, new DataOutputStream(client.getOutputStream()));
                    System.out.println("Accepted client with id " + newId);
                    Thread thread = new ClientListeningThread(newId, client);
                    thread.start();
                    System.out.println("Started thread for client " + newId);

                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    logMessages.add(e.getMessage());
                }
            }
        });
        acceptingThread.run();
        serverSocket.close();
    }

    private class ClientListeningThread extends Thread {
        private Socket clientSocket;
        private BufferedReader clientIn;
        private UUID clientId;

        public ClientListeningThread(UUID clientId, Socket clientSocket) throws IOException {
            this.clientId = clientId;
            this.clientSocket = clientSocket;
            this.clientIn =
                    new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        }

        public void run() {
            while (true) {
                String input;
                try {
                    input = clientIn.readLine();
                    if (input == null) {
                        logMessages.add("Client disconnected, id : " + clientId);
                        break;
                    }
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                    logMessages.add(e.getMessage());
                    break;
                }
                for (Map.Entry<UUID, DataOutputStream> clientOut : clients.entrySet()) {
                    if (!clientOut.getKey().equals(clientId)) {
                        try {
                            clientOut.getValue().writeBytes(input + "\n");
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                            logMessages.add(e.getMessage());
                        }
                    }
                }
            }
            try {
                clientIn.close();
                clientSocket.close();
                clients.get(clientId).close();
                clients.remove(clientId);
            } catch (IOException e) {
                System.out.println(e.getMessage());
                logMessages.add(e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Server server = new Server();
    }
//    public void accept(Client client) {
//
//    }
//
//    public void sendMessage(Client source, String content, UUID dest) {
//
//    }
//
//    public void disconnect(Client client) {
//
//    }
}
