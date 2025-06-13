package cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human arun = new Human("Arun", 22);
        Human varun = new Human(arun);
        Human tarun = (Human) arun.clone();
        System.out.println(arun);
        System.out.println(varun);
        System.out.println(tarun);
    }
}
