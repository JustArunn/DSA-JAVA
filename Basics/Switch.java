package Basics;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a day : ");
        int day = in.nextInt();
        in.close();

        System.out.println("\n ....................Normal Swith case.................");
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Whensday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Firday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter a valid day");
                break;
        }

        System.out.println("\n ....................Cleaner Swith case.................");
        switch (day) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Whensday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Firday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter a valid day");
        }
    }
}
