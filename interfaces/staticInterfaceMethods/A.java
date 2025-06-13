package interfaces.staticInterfaceMethods;

public interface A extends B{

    //static method can't be overridden and the body of the static method must be provided
    static void heyBabe(){
        System.out.println("this is the static Hey babe");
    }

    default void fun(){
        System.out.println("default function of interface A");
    }
    void greet();
}
