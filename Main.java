import java.util.Scanner;

public class Main {

    static {
        System.out.println("Hello World !");
    }

    public static void main(String[] args) {
//        System.out.println("Hello, World!");
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter values of a and b : ");
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println("Enter values of Key : ");
//        int key = in.nextInt();
//        System.out.println("a + b => " + (a + b));
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        System.out.println("=> " + binarySearch(arr, key));
//
//        Student s = new Student("arun", 22, 2000.44f);
//        Student s1 = new Student();
//        s.getBalance();
//        System.out.println("name -> " + s.name);
//        System.out.println("age -> " + s.age);
//        s1.getBalance();
//        System.out.println("name -> " + s1.name);
//
//        System.out.println("Copy con");
//        Student s2 = new Student(s);
//
//        s2.getBalance();
        Student s = new Student("Arun", 22, 35000);
        System.out.println(s.toString());
    }

    static int binarySearch(int[] arr, int key) {
        int s = 0;
        int e = arr.length - 1;
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (arr[mid] == key) {
                return mid;
            } else if (arr[mid] < key) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
            mid = s + (e - s) / 2;
        }

        return -1;
    }

    static void bubbleSort(int[] arr) {

    }

}

class Student {
    String name;
    int age;
    float balance;

    Student() {
        // call another constructor inside a constructor
        this("bob", 20, 0);
    }

    Student(Student other) {
        this.name = other.name;
        this.age = other.age;
        this.balance = other.balance;
    }

    Student(String name, int age, float balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

    void getBalance() {
        System.out.println("balance -> " + balance);
    }

    @Override
    public String toString() {
        return "{\n name: " + name + ",\n age: " + age + ",\n balance: " + balance + "\n}";
    }
}