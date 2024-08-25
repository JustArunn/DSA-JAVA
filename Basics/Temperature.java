package Basics;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius : ");
        float tempC = in.nextFloat();
        in.close();
        float tempF = (tempC * 9/5)+32;
        System.out.print("temperature in Fahrenheit : " + tempF);
    }
}