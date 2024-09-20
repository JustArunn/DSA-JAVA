package Basics;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);

        list.add(7);
        list.add(8);
        list.add(9);

        list.add(10);
        list.add(11);
        list.add(11);
        System.out.println(list);

        for (int i = 0; i < 8; i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
