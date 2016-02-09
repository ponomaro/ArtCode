package com.dataart.home.week5.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 07.02.16.
 */
public class NodeUtils {
    static List<Node> templist = new ArrayList<>();

    public static Node addToHead(Node newNode, Node chainHead) {
        if (chainHead == null) return newNode;
        newNode.next = chainHead;
        return newNode;
    }


    public static void addToTail(Node newNode, Node chainHead) {
        if (chainHead == null) return;
        if (chainHead.next != null) addToTail(newNode, chainHead.next);
        if (chainHead.next == null) chainHead.next = newNode;
    }

    public static String toString(Node chain) {
        if (chain == null) return "";
        if (chain.next == null) return ((Integer) chain.value).toString();
        return ((Integer) chain.value).toString() + "; " + toString(chain.next);
    }

    public static Node[] toArray(Node chain) {
        if (chain == null || chain.next == null) {
            if (chain != null) templist.add(chain);
            Node list2[] = new Node[templist.size()];
            templist.toArray(list2);
            templist.clear();
            return list2;

        }
        templist.add(chain);
        return toArray(chain.next);
    }


    public static Node insertByIndex(int index, Node newNode, Node chain) {
        if (chain == null || newNode == null || index < 0) return chain;
        if (chain.next == null && index > 0) {
            System.out.println("Unable to add no such index");
            return chain;
        }

        if (index > 0) insertByIndex(index - 1, newNode, chain.next);

        if (index == 0) {

            return addToHead(newNode, chain);
        }
        if (index == 1) chain.next = newNode;


        return chain;
    }

    public static Node remove(int index, Node chain) {
        if (chain == null) return null;
        if (index == 0) return chain.next;
        if (index > 0) {
            if (chain.next != null) {
                remove(index - 1, chain.next);
            } else {
                System.out.println("unable to remove item id that is not in chain");
                return chain;
            }
        }
        if (index == 1) chain.next = chain.next.next;
        return chain;
    }

    // use equals method
    public static int indexOf(Object target, Node chain) {
        if (chain == null) return -1;
        if (chain.equals(target)) return 0;
        if (chain.next == null) return -1;
        int t = indexOf(target, chain.next);
        if (t >= 0) return 1 + t;
        else return -1;

    }

    // 1,2,3,4,5 - 5,4,3,2,1
    // create new
    // use existed, one loop
    // advanced *

    static Node revert;

    public static Node reverse(Node chain) {
        if (chain == null || chain.next == null) return chain;
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
