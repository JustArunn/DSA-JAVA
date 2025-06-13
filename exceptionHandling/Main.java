package exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
            System.out.println(divide(a, b));
        } catch (MyException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finish");
        }
    }

    private static int divide(int a, int b) throws MyException {
        if (b == 0) {
            throw new MyException("can't divide by zero");
        } else {
            return a / b;
        }
    }
}
