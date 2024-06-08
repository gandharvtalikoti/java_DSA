package code.g;

import java.util.NoSuchElementException;

public class LinkedList {
    private static class Node {
        // members of a NODE
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    // members of linkedlist
    private Node first;
    private Node last;
    private int size;

    //addFirst
    public void addFirst(int item) {
        var n = new Node(item);
        if (first == null)
            first = last = n;
        else {
            n.next = first;
            first = n;
        }
        size++;
    }

    //addLast
    public void addLast(int item) {
        var node = new Node(item);
        if (first == null) // if there are no elements in list
            last = first = node;
        else {
            last.next = node;
            last = node;
        }
        size++;
    }

    public boolean isEmpty() {
        return first == null;
    }

    //deleteFirst
    public void removeFirst() {
        //[1  2->3->4]
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            first = last = null;
            return;
        }
        else {
        var second = first.next; // have a track of the second address
            first.next = null; // remove link
            first = second;
        }
        size--;
    }

    //getPrevious node
    private Node getPrevious(Node node) {
        var curr = first;
        while (curr != null) {
            if (curr == node)
                break;
            curr = curr.next;
        }
        return curr;
    }

    //deleteLast
    public void removeLast() {
        if (isEmpty())
            throw new NoSuchElementException();

        if (first==last){
            first = last = null;
        }else{
        var previous = getPrevious(last);
            last = previous;
            last.next = null;
        }
        //[1->2->3->4]
        size--;
    }

    //contains
    public boolean contains(int key) {
        return indexOf(key) != -1;
    }

    //indexOf
    public int indexOf(int item) {
        var curr = first;
        int index = 0;
        while (curr != null) {
            if (curr.value == item)
                return index;
            curr = curr.next;
            index++;
        }
        return -1; // not found
    }

    //getSize O(1)
    public int size() {
        return size;
    }


}
