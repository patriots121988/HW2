package edu.monmouth.hw2;
import edu.monmouth.book.*;

public class Node
{
    private Node next;
    private Book info;

    @Override
    public String toString() {
        return "Node{" +
                "info='" + info + '\'';
    }

    /* change this constructor so it accepts a reference to a Book */
    public Node(Book book) {
        this.info = book;
        next = null;
    }

    /* change this method so it accepts a reference to  Book */
    public void setInfo(Book book) {
        this.info = book;
    }

    /* change this method so it returns a reference to a Book */
    public Book getInfo() {
        return this.info;
    }

    public void setNext(Node link) {
        this.next = link;
    }

    public Node getNext() {
        return next;
    }

}
