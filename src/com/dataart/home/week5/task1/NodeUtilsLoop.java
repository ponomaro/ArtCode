package com.dataart.home.week5.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by serhii on 07.02.16.
 */
public class NodeUtilsLoop {


    public static Node addToHead(Node newNode, Node chainHead) {
        if (chainHead == null) return newNode;
        newNode.next = chainHead;
        return newNode;
    }


    public static void addToTail(Node newNode, Node chainHead) {

        if (chainHead == null) return;

        while (chainHead.next != null) {
            chainHead = chainHead.next;
        }
        chainHead.next = newNode;
    }

    public static String toString(Node chain) {
        if (chain == null) return "";
        if (chain.next == null) return ((Integer) chain.value).toString();
        StringBuilder sb = new StringBuilder();
        while (chain != null) {
            sb.append(((Integer) chain.value) + "; ");
            chain = chain.next;
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }

    public static Node[] toArray(Node chain) {
        List<Node> templist = new ArrayList<>();

        if (chain == null) {
            Node list2[] = new Node[templist.size()];
            return templist.toArray(list2);
        }

        while (chain != null) {
            templist.add(chain);
            chain = chain.next;
        }
        Node list2[] = new Node[templist.size()];
        return templist.toArray(list2);
    }


    public static Node insertByIndex(int index, Node newNode, Node chain) {
        if (chain == null || newNode == null || index < 0) return chain;
        if (index == 0) {
            return addToHead(newNode, chain);
        }
        Node previous = null, statchain = chain;
        while (chain != null) {
            if (chain.next == null && index > 0) {
                System.out.println("Unable to add no such index");
                return statchain;
            }
            if (index == 1) {
                previous = chain;
            }
            if (index == 0) {
                newNode.next = chain;
                break;
            }
            chain = chain.next;
            index--;
        }

        previous.next = newNode;
        return statchain;
    }

    public static Node remove(int index, Node chain) {
        if (chain == null) return null;
        if (index == 0) return chain.next;
        Node startnode = chain;
        while (index > 0) {
            if (chain.next == null) {
                System.out.println("unable to remove item id that is not in chain");
                return startnode;
            }
            if (index == 1) {
                chain.next = chain.next.next;
                break;
            }
            index--;
            chain = chain.next;
        }
        return startnode;
    }

    // use equals method
    public static int indexOf(Object target, Node chain) {
        if (chain == null) return -1;
        int index = 0;
        while (chain != null) {
            if (chain.equals(target)) return index;
            if (chain.next == null) return -1;
            index++;
            chain = chain.next;
        }
        return -1;
    }

    // 1,2,3,4,5 - 5,4,3,2,1
    // create new
    // use existed, one loop
    // advanced *


    public static Node reverse(Node chain) {
        if (chain == null || chain.next == null) return chain;
        Node previous = chain, tail = chain, next;
        while (chain != null) {
            if (chain.next == null) {
                chain.next = previous;
                tail.next = null;
                return chain;
            } else {
                next = chain.next;
                chain.next = previous;
                previous = chain;
            }
            chain = next;
        }
        return null;

    }


}
