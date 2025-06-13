package staticVariables;
public class Main {
    public static void main(String[] args) {
        Human arun = new Human("arun",22, 1000.56f);
        Human varun = new Human("arun",22, 1000.56f);
        Human dvarun = new Human("arun",22, 1000.56f);
        Human fvarun = new Human("arun",22, 1000.56f);
        Human gvarun = new Human("arun",22, 1000.56f);

        System.out.println(Human.population);
    }
}
