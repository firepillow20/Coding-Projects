package com.company;
import java.util.*;

public class LinkedList {
    public static MyNode head;

    public static class MyNode {
        int data;
        MyNode next;

        MyNode(int d) {
            data = d;
            next = null;
        }
    }
}