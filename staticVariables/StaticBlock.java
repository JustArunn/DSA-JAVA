package staticVariables;

public class StaticBlock {
    static int a = 4;
    static int b;

    // only run when first object is created or when  the class is loaded
    static {
        System.out.println("Static block executed");
        b = a*4;
    }

    public static void main(String[] args) {
        StaticBlock sb = new StaticBlock();
        System.out.println("value of a "+ StaticBlock.a);
        System.out.println("value of b "+ StaticBlock.b);

        StaticBlock sb2 = new StaticBlock();
        System.out.println("value of a "+ StaticBlock.a);
        System.out.println("value of b "+ StaticBlock.b);
    }
}
