package com.pps.nodeDemo;

public class Nodetest {
    public static void main(String[] args) {
        Node node = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        node.next = node2;
        node2.next = node3;
        node3.next = node4;

        Node temp = node;
        while (temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(10);
        System.out.println(node);
        LinkedList linkedList = new LinkedList<String>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        System.out.println(linkedList.size);
    }
}
