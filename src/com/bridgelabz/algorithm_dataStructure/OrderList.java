package com.bridgelabz.algorithm_dataStructure;

public class OrderList {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
        return;
    }
    public void sortByNumber() {

        Node currNode = head, index = null;

        int temp;

        if (head == null) {
            return;
        } else {
            while (currNode != null) {
                index = currNode.next;

                while (index != null) {
                    if (currNode.data > index.data) {
                        temp = currNode.data;
                        currNode.data = index.data;
                        index.data = temp;
                    }

                    index = index.next;
                }
                currNode = currNode.next;
            }
        }
    }
    public void printList() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + "=>");
            currNode = currNode.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {

        OrderList list = new OrderList();
        list.addFirst(56);
        list.addFirst(40);
        list.addFirst(562);
        list.addFirst(4);
        list.addFirst(120);
        list.addFirst(78);
        System.out.println("Before The Sorting");
        list.printList();
        list.sortByNumber();
        System.out.println("After The Sorting");
        list.printList();

    }

}

