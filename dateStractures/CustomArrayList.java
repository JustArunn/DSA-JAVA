package dateStractures;

public class CustomArrayList {
    int DEFAULT_CAPACITY = 10;
    int size = 0;
    private int[] data;

    CustomArrayList() {
        data = new int[DEFAULT_CAPACITY];
    }

    public void add(int element) {
        if (this.isFull()) {
            this.resize();
        } else {
            data[size++] = element;
        }
    }

    public void remove() {
        size--;
    }

    public void set(int index, int element) {
        if (index > size) {
            System.out.println("can't insert element at index: "+index);
            return;
        } else {
            data[index] = element;
        }
    }

    public int size() {
        return size;
    }

    private boolean isFull() {
        return size == DEFAULT_CAPACITY;
    }

    private void resize() {
        DEFAULT_CAPACITY = size*2;
        int[] temp = new int[size*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    } 

    @Override
    public String toString() {
        if (data == null) {
            return "null";
        }

        if (data.length == 0) {
            return "[]";
        }

        StringBuilder b = new StringBuilder();
        b.append("[");
        for (int i = 0; i < data.length; i++) {
            b.append(data[i]);
            if (size == i)
                return b.append("]").toString();
            b.append(", ");
        }
        return b.toString();
    }
}
