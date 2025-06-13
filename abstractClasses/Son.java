package abstractClasses;

public class Son extends Parent {

    private final String name;
    private final int age;
    private final String career;
    private final String language;

    public Son(String name, int age, String career, String language){
        this.name = name;
        this.age = age;
        this.career = career;
        this.language = language;
    }

    @Override
    void career() {
        System.out.println("i want to be a " + career);
    }

    @Override
    void language() {
        System.out.println("i know " + language);
    }

    @Override
    void name(){
        System.out.println("name -> " + this.name);
    }

    @Override
    void age(){
        System.out.println("age -> " + this.age);
    }

    @Override
    public String toString(){
        return "{\n" + "name:" + name + "\nage:" + age + "\ncareer:" + career + "\nlanguage:" + language + "\n}";
    }
}
