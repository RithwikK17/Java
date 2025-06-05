//package com.list;
//
//// Node class
//class newNode {
//    int data;
//    newNode next;
//
//    newNode(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//// Linked List class with update, delete, reverse operations
//class Test8 {
//    newNode head;
//
//    public void updateAtIndex(int index, int newData) {
//        newNode current = head;
//        int count = 0;
//
//        while (current != null) {
//            if (count == index) {
//                current.data = newData;
//                return;
//            }
//            current = current.next;
//            count++;
//        }
//
//        System.out.println("Index out of bounds");
//    }
//
//    public void append(int data) {
//        newNode newNode = new newNode(data);
//
//        if (head == null) {
//            head = newNode;
//            return;
//        }
//
//        newNode current = head;
//        while (current.next != null)
//            current = current.next;
//
//        current.next = newNode;
//    }
//
//    public void printList() {
//        newNode current = head;
//        while (current != null) {
//            System.out.print(current.data + " -> ");
//            current = current.next;
//        }
//        System.out.println("null");
//    }
//
//    public void deleteAtIndex(int index) {
//        if (head == null) {
//            System.out.println("List is empty");
//            return;
//        }
//
//        if (index == 0) {
//            head = head.next;
//            return;
//        }
//
//        newNode current = head;
//        int count = 0;
//
//        while (current != null && current.next != null) {
//            if (count == index - 1) {
//                current.next = current.next.next;
//                return;
//            }
//            current = current.next;
//            count++;
//        }
//
//        System.out.println("Index out of bounds");
//    }
//
//    public void reverseList() {
//        newNode prev = null;
//        newNode current = head;
//        newNode nextNode;
//
//        while (current != null) {
//            nextNode = current.next; // store next
//            current.next = prev;     // reverse current node
//            prev = current;          // move prev to current
//            current = nextNode;      // move to next node
//        }
//
//        head = prev;
//    }
//
//
//// Main class with the main method
//    public static void main(String[] args) {
//        Test8 list = new Test8();
//
//        list.append(10);
//        list.append(20);
//        list.append(30);
//        list.append(40);
//
//        System.out.println("Initial List:");
//        list.printList();
//
//        list.updateAtIndex(2, 99);
//        System.out.println("After updating index 2:");
//        list.printList();
//
//        list.deleteAtIndex(1);
//        System.out.println("After deleting index 1:");
//        list.printList();
//
//        list.reverseList();
//        System.out.println("After reversing the list:");
//        list.printList();
//    }
//}
//}
