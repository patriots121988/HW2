package edu.monmouth.hw2;

import edu.monmouth.book.Book;

public class ListNode {

        private Node head = null;

    public ListNode() {
            head = null;
        }

        public Node removeFirst () {
            Node first = head;
            if (first != null) {
            }
            return first;
        }

        public Node first () {
            return head;
        }

        public Node last () {
        return null;
            }

        public void insert (Book element){
            Node newNode = new Node(element);
            newNode.setNext(head);
            head = newNode;
        }

        public void insertEnd (Book element) {
            Node newNode = new Node(element);
            if(head == null){
                head = newNode;
            }else{
                Node node = head;
                while(node.getNext() !=null){
                    node = node.getNext();
                }
                node.setNext(newNode);
            }
        }

        public boolean isEmpty () {
             if (head == null);
            return true;
        }

        public int size () {
        int count = 0;
        Node currentNode = head;
        while (currentNode != null){
            count++;
            currentNode = currentNode.getNext();
            }
        return count;
        }

        public void clear () {
            head = null;
        }

        @Override
        public String toString () {
            StringBuilder logString = new StringBuilder();
            Node node;
            node = head;
            int count = 0;

            while (node != null) {
                count++;
                logString.append(count + " . " + node.getInfo() + "\n");
                node = node.getNext();
            }
            return logString.toString();
        }
    }


