package com.dataart.home.week5.task1;

import java.util.Arrays;

import static com.dataart.home.week5.task1.NodeUtils.*;

/**
 * Created by serhii on 07.02.16.
 */
public class TestNode {

    public static void main(String[] args) {
        Node head = new Node(1, new Node(2, new Node(3, new Node(4, new Node(5, null)))));


        //test node add to head
        Node node1 = new Node(0, null);
        System.out.println("test add to head: "+ NodeUtils.toString(addToHead(node1, head)).equals("0; 1; 2; 3; 4; 5"));
        // test nod add to tail
        Node node6 = new Node(6, null);
        addToTail(node6, head);
        System.out.println("test add to tail: "+NodeUtils.toString(head).equals("1; 2; 3; 4; 5; 6"));
        //array
        Node ar1[] = toArray(head);
        Arrays.toString(ar1);
        System.out.println("test to array: "+(ar1.length==6));
        // insert by index
        Node node7 = new Node(7, null);
        System.out.println("test insert by index: "+NodeUtils.toString(insertByIndex(3, node7, head)).equals("1; 2; 3; 7; 4; 5; 6"));
        // remove
        System.out.println("test remove: "+NodeUtils.toString(remove(3, head)).equals("1; 2; 3; 4; 5; 6"));
        // equels
        Node node8 = new Node(7, node7);
        System.out.println("test equels: "+node7.equals(node8));
        // getIndexOf
        System.out.println("test getIndexOf: "+(indexOf(node6, head)==5));
        // reverse
        System.out.println("test reverse: "+NodeUtils.toString(reverse(head)).equals("6; 5; 4; 3; 2; 1"));
    }


}
