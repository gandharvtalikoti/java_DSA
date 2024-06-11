package code.g;

import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        //int [] nums = new int[size];
//        int [] numbers = {10, 20, 30};
//        System.out.println(numbers.length);
//        System.out.println(Arrays.toString(numbers));
//
//        // Array class
//        System.out.println("\nArray class:");
//        Array nums = new Array(3);
//        nums.insert(4);
//        nums.insert(5);
//        nums.insert(4);
//        nums.insert(10);
//        nums.insert(89);
//        nums.removeAt(3);
//        nums.print();
//
//        // ArrayList
//        System.out.println("\nArray list=");
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(20);
//        list.add(30);
//        System.out.println(list);

        // LinkedList
        LinkedList list = new LinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        list.contains(3);
        list.reverse();
        System.out.println(Arrays.toString(list.toArray()));

    }
}