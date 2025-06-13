package staticVariables;

public class Human {
    String name;
    int age;
    float balance;
    static int population;

    Human(String name, int age, float balance){
        this.name = name;
        this.age = age;
        this.balance = balance;
        Human.population +=1;
    }
}
