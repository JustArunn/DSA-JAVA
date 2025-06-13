package staticVariables;

public class InnerClasses {
    static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        // override the toString method to print the valriab (name) of Test class instead of random value(hashcode)
        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test obj = new Test("Arun");
        Test obj2 = new Test("Varun");
        System.out.println("name -> " + obj.name);
        System.out.println("name -> " + obj2.name);
        System.out.println(obj);
    }
}