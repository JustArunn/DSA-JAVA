package intaritance;

public abstract class Box {
    int l;
    int w;
    int h;

    public  Box(){
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    public Box(int l, int w, int h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public Box(int side){
        this.l = side;
        this.w = side;
        this.h = side;
    }

    public Box(Box other){
        this.h = other.h;
        this.w = other.w;
        this.l = other.l;
    }
}
