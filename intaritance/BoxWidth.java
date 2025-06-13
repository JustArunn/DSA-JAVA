package intaritance;

public class BoxWidth extends Box {
    int weight;

    public BoxWidth() {
    }

    public BoxWidth(int weight) {
        this.weight = weight;
    }

    public BoxWidth(int l, int w, int h, int weight) {
        super(l, w, h);
        this.weight = weight;
    }

    public BoxWidth(int side, int weight){
        super(side);
        this.weight = weight;
    }

    public BoxWidth(BoxWidth other){
        super(other);
        this.weight = other.weight;
    }

    @Override
    public String toString() {
        return "{" + l + ", " + w + ", " + h + ", " + weight + "}";
    }
}
