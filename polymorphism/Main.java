package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes sp = new Shapes();
        Circle cs = new Circle();
        Shapes square = new Square();
        sp.area();
        cs.area();
        square.area();
    }
}
