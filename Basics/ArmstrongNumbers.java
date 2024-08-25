package Basics;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = in.nextInt();
        in.close();
        System.out.println("Ans : " + isArmstrong(n));
        getArmstrongNumbers();
    }

    static void getArmstrongNumbers(){
        System.out.println("\n Armstrong Numbers b/t 100 and 1000");
        for(int i = 100; i < 1000; i++){
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n){
        int original =n;
        int sum = 0;

        while (n > 0) {
            int m = n%10;
            n = n/10;
            int cube = m*m*m;
            sum = sum + cube; 
        }

        return sum == original;
    }
}
