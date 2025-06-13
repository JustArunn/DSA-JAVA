package cloning;

public class Human implements Cloneable{
    private final String name;
    private final int age;
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Human(Human other){
        this.name = other.name;
        this.age = other.age;
    }

    @Override
    public String toString(){
        return "{ "+ "name : " + name + ", age : " + age + " }";
    }

    @Override
    public Object clone()throws CloneNotSupportedException{
        return super.clone();
    }
}
