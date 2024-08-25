package Basics;

public class Loops {
    public static void printWhile(int x){
        if(x == 0)return;
        int i = 0;
        while (i <= x){
            System.out.print(i + " ");
            i++;
        }
    }

    public static void printFor(int x){
        if(x == 0)return;
        for(int i = 0; i <= x; i++){
            System.out.print(i + " ");
        }
    }

    public static void printDoWhile(int x){
        if(x < 0)return;
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        }while (i <= x);
    }

    public static void main(String[] args) {
        System.out.println("-----------------while loop---------------");
        printWhile(5);
        System.out.println("\n-----------for loop----------------");
        printFor(5);
        System.out.println("\n-----------do while loop----------------");
        printDoWhile(5);
    }
}
