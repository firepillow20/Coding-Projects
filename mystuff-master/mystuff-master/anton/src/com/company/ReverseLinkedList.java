package com.company;

public class ReverseLinkedList {
    public static void printLinkedList(LinkedList myList)
    {
        LinkedList.MyNode h = myList.head;
        while (myList.head != null) {
            System.out.print(myList.head.data + " ");
            myList.head = myList.head.next;
        }
        System.out.println();
        myList.head = h;
    }
    public static void revLinkedList(LinkedList myList){
        LinkedList.MyNode previous = null;
        LinkedList.MyNode current = myList.head;
        LinkedList.MyNode next;
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        myList.head = previous;
    };

    public static void main(String[] args)
    {
        LinkedList list = new LinkedList();
        list.head = new LinkedList.MyNode(85);
        list.head.next = new LinkedList.MyNode(15);
        list.head.next.next = new LinkedList.MyNode(4);
        list.head.next.next.next = new LinkedList.MyNode(20);
        printLinkedList(list);
        revLinkedList(list);
        printLinkedList(list);
    }
}
