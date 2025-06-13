package intaritance;

public class Main {
    public static void main(String[] args) {
        BoxWidth bw = new BoxWidth();
        BoxWidth bw2 = new BoxWidth(200);
        BoxWidth bw3 = new BoxWidth(2, 3, 4, 500);
        BoxWidth bw4 = new BoxWidth(4, 900);
        System.out.println(bw3.toString());
        System.out.println(bw4.toString());
        BoxWidth bwc = new BoxWidth(bw4);
        System.out.println(bwc.toString());
    }
}
