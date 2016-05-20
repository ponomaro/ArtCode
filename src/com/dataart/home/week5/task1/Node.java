package com.dataart.home.week5.task1;

/**
 * Created by serhii on 07.02.16.
 */
public class Node {

    public Object value;
    public Node next;

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Node) {
            return value == ((Node) obj).value;
        }
        return false;
    }

    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }

    public Node(Object value) {
        this.value = value;
    }
}
