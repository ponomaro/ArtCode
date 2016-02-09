package com.dataart.home.week5.task1;

import java.util.Arrays;

import static com.dataart.home.week5.task1.NodeUtils.*;

/**
 * Created by serhii on 07.02.16.
 */
public class TestNode {

    public static void main(String[] args) {
        Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));

        /*
                        positive testing
         */
        //test node add to head
        Node node1 = new Node(0, null);
        System.out.println("test add to head: " + NodeUtils.toString(addToHead(node1, head)).equals("0; 1; 2; 3; 4; 5"));
        // test nod add to tail
        Node node6 = new Node(6, null);
        addToTail(node6, head);
        System.out.println("test add to tail: " + NodeUtils.toString(head).equals("1; 2; 3; 4; 5; 6"));
        //array
        Node ar1[] = toArray(head);
        Arrays.toString(ar1);
        System.out.println("test to array: " + (ar1.length == 6));
        // insert by index
        Node node7 = new Node(7, null);
        System.out.println("test insert by index: " + NodeUtils.toString(insertByIndex(3, node7, head)).equals("1; 2; 3; 7; 4; 5; 6"));
        // remove
        System.out.println("test remove: " + NodeUtils.toString(remove(3, head)).equals("1; 2; 3; 4; 5; 6"));
        // equels
        Node node8 = new Node(7, node7);
        System.out.println("test equels: " + node7.equals(node8));
        // getIndexOf
        System.out.println("test getIndexOf: " + (indexOf(node6, head) == 5));
        // reverse
        System.out.println("test reverse: " + NodeUtils.toString(head = reverse(head)).equals("6; 5; 4; 3; 2; 1"));

        /*
                        negative testing
         */
        System.out.println("negative testing _____________________________________________________________________");
        //test node add to head
        System.out.println("test add to head: " + (addToHead(node1, null) == node1));
        //array
        Node ar2[] = toArray(null);
        System.out.println("test to array: " + (ar2.length == 0));
        // insert by index
        Node node11 = new Node(11, null);

        System.out.println("test insert by index: " + NodeUtils.toString(head = insertByIndex(11, node11, head)).equals("6; 5; 4; 3; 2; 1"));
        // remove
        System.out.println("test remove: " + NodeUtils.toString(remove(15, head)).equals("6; 5; 4; 3; 2; 1"));

        // getIndexOf
        System.out.println("test getIndexOf: " + (indexOf(node11, head) == -1));
        // reverse
        System.out.println("test reverse1: " + (reverse(null) == null));
        System.out.println("test reverse2: " + NodeUtils.toString(head = reverse(head)).equals("1; 2; 3; 4; 5; 6"));

    }


}
