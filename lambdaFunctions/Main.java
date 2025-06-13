package lambdaFunctions;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    //    ArrayList<Integer>list = new ArrayList<>();
    //    list.add(1);
    //    list.add(2);
    //    list.add(3);
    //    list.add(4);
    //    list.add(5);
    //    list.forEach((a)-> System.out.print(a + " "));

        Operation sum = (a, b)->a+b;
        Operation sub = (a, b)->a-b;
        Operation multiply = (a, b)->a*b;

        Main m = new Main();
        System.out.println(m.calculate(70, 20, sum));
        System.out.println(m.calculate(70, 20, sub));
        System.out.println(m.calculate(70, 20, multiply));

    }

    private int calculate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}

interface Operation{
    int operation(int a, int b);
}
