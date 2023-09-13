package misc_projects;

import java.util.HashMap;
import java.util.Map;

public class findItinerary
{
	
    public static void main(String[] args) 
    { 
        Map<String, String> dataSet = new HashMap<String, String>(); 
        dataSet.put("Chennai", "Banglore"); 
        dataSet.put("Bombay", "Delhi"); 
        dataSet.put("Goa", "Chennai"); 
        dataSet.put("Delhi", "Goa"); 
        dataSet.put("Cairo", "Bombay");
        dataSet.put("Banglore", "Cairo");
        
        result(dataSet);
    }
    
    private static void result(Map<String, String> dataSet) 
    {
    	Map<String, String> reverse = new HashMap<String, String>();
    	
    	for (Map.Entry<String, String> entry: dataSet.entrySet())
    		reverse.put(entry.getValue(), entry.getKey()); 
    	
    	String startingPoint = null;
    	for (Map.Entry<String,String> entry: dataSet.entrySet()) 
        { 
            if (!reverse.containsKey(entry.getKey()))
            {
            	startingPoint = entry.getKey();
            	break;
            }
        }
        String to = dataSet.get(startingPoint); 
        while (to != null) 
        { 
            System.out.print(startingPoint +  " -> " + to + ", "); 
            startingPoint = to; 
            to = dataSet.get(to); 
        } 
		
    }
}