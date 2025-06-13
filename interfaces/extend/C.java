package interfaces.extend;

public class C implements A{
    @Override
    public void fun() {
        System.out.println("function fun");
    }

    @Override
    public void greet() {
        System.out.println("function greet");

    }

    @Override
    public void hello() {
        System.out.println("function hello");

    }

    @Override
    public void bye() {
        System.out.println("function bye");

    }
}
