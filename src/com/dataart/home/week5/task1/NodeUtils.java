package com.dataart.home.week5.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 07.02.16.
 */
public class NodeUtils {
    static List<Node> templist = new ArrayList<>();

    public static Node addToHead(Node newNode, Node chainHead) {
        newNode.next = chainHead;
        return newNode;
    }


    public static void addToTail(Node newNode, Node chainHead) {
        if (chainHead.next != null) addToTail(newNode, chainHead.next);
        if (chainHead.next == null) chainHead.next = newNode;
    }

    public static String toString(Node chain) {
        if (chain.next == null) return ((Integer) chain.value).toString();
        return ((Integer) chain.value).toString() + "; " + toString(chain.next);
    }

    public static Node[] toArray(Node chain) {
        if (chain.next == null) {
            templist.add(chain);
            Node list2[] = new Node[templist.size()];
            templist.toArray(list2);
            templist.clear();
            return list2;

        }
        templist.add(chain);
        return toArray(chain.next);
    }


    public static Node insertByIndex(int index, Node newNode, Node chain) {

        if (index > 0) insertByIndex(index - 1, newNode, chain.next);
        if (index == 0) {

            return addToHead(newNode, chain);
        }
        if (index == 1) chain.next = newNode;


        return chain;
    }

    public static Node remove(int index, Node chain) {
        if (index == 0) return chain.next;
        if (index > 0) remove(index - 1, chain.next);
        if (index == 1) chain.next = chain.next.next;
        return chain;
    }

    // use equals method
    public static int indexOf(Object target, Node chain) {
        if (chain.equals(target)) return 0;
        return 1 + indexOf(target, chain.next);
    }

    // 1,2,3,4,5 - 5,4,3,2,1
    // create new
    // use existed, one loop
    // advanced *
    static Node revert;

    public static Node reverse(Node chain) {
        reverse(chain, chain);
        chain.next = null;
        return revert;
    }

    private static void reverse(Node chain, Node previous) {
        if (chain.next != null) reverse(chain.next, chain);
        if (chain.next == null) revert = chain;
        if (previous != null) chain.next = previous;
    }

}
