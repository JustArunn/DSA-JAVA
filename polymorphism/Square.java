package polymorphism;

public class Square extends Shapes{

    // @Override to check weather the method is being overridden or not
    @Override
    public void area(){
        System.out.println("Area of square");
    }
}
