package enums;

public class Main {
    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
        week.hello();
        for(Week day: Week.values()){
            System.out.println(day);
        }
    }
}
