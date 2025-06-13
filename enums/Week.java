package enums;

public enum Week implements A {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;

    Week() {
        System.out.println("Constructor Called for " + this);
    }

    @Override
    public void hello(){
        System.out.println("Hello! how are you?");
    }
}
