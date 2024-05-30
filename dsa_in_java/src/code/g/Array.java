package code.g;

import java.util.Arrays;

public class Array {
    private int[] items;
    private int count;

    public Array(int lenght) {
        items = new int[lenght];

    }

    public void insert(int item) {
        // when size is full
        if (items.length == count) {
            // create a new array of double size
            int[] newItems = new int[count * 2];
            // copy the previous array
            for (int i = 0; i < count; i++)
                newItems[i] = items[i];

            // set items to newItems
            items = newItems;
        }
        // add at the end of the array
        items[count++] = item;
    }

    public void removeAt(int index){
        //validate the index
        if (index <0 || index >=count)
            throw new IllegalArgumentException();

        // shift all the elements to left
        for (int i=index ; i<count;i++)
            items[i] = items[i+1];
        count--;
    }

    public int indexOf(int item){
        for (int i = 0; i<count;i++)
            if (items[i] == item)
                return i;

        return -1;
    }

    public void print() {
        //System.out.println(Arrays.toString(items));
        for (int i = 0; i<count;i++)
            System.out.println(items[i]);
    }
}
