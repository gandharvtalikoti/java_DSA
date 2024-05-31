package code.g;

import java.util.NoSuchElementException;

public class LinkedList {
    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;

    //addFirst
    public void addFirst(int item) {
        var n = new Node(item);
        if (first == null)
            first = last = n;
        else {
            n.next = first;
            first = n;
        }

    }

    //addLast
    public void addLast(int item) {
        var node = new Node(item);
        if (first == null)
            last = first = node;
        else {
            last.next = node;
            last = node;
        }
    }

    public boolean isEmpty() {
        return first == null;
    }

    //deleteFirst
    public void deleteFirst() {
        //[1  2->3->4]
        if (isEmpty())
            throw new NoSuchElementException();
        if (first == last) {
            return;
        }
        var second = first.next;
        first.next = null; // remove link
        first = second;

    }


    //deleteLast
    public void deleteLast() {
        var curr = first;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        last = curr;
        curr.next = null;
    }

    //contains
    public boolean contains(int key) {
        var curr = first;
        while (curr != null) {
            if (curr.value == key)
                return true;
            curr = curr.next;
        }
        return false;
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

    //getSize
    public int getSize(){
        int c = 0;
        var curr = first;
        while (curr !=null){
            c++;
            curr = curr.next;
        }
        return c;
    }
}
