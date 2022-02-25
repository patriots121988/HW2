package edu.monmouth.assignment2;

public class Node
{
    /* change this attribute to store a reference to a Book */
    private String info;
    private Node next;
    Book book;

    @Override
    public String toString() {
        return "Node{" +
                "info='" + info + '\'' +
                ", next=" + next +
                ", book=" + book +
                '}';
    }

    /* change this constructor so it accepts a reference to a Book */
    public Node(Book book) {
        this.book = book;
        next = null;
    }

    /* change this method so it accepts a reference to  Book */
    public void setInfo(Book book) {
        this.book = book;
    }

    /* change this method so it returns a reference to a Book */
    public String getInfo() {
        return book.name();
    }

    public void setNext(Node link) {
        this.next = link;
    }

    public Node getNext() {
        return next;
    }

}
