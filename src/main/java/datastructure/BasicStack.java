package datastructure;

public class BasicStack<T> {

    private T[] data;
    private int pointer;

    public BasicStack() {
        this.data = (T[]) new Object[10];
    }

    public int size() {
        return pointer;
    }

    public void push(T item) {
        if (pointer < data.length) {
            data[pointer++] = item;
        } else {
            throw new IllegalStateException("Stack Is Full!");
        }
    }

    public T pop() {
        if (pointer == 0) {
            throw new IllegalStateException("Stack Is Empty!");
        } else {
            return data[--pointer];
        }
    }

    public boolean contains(T item) {

        for (int i = 0; i < pointer; i++) {
            if (data[i].equals(item)) return true;
        }
        return false;
    }

    public T access(T item) {
        while (pointer > 0) {
            T temp = pop();
            if (item.equals(temp)) {
                return temp;
            }
        }
        throw new IllegalArgumentException("Couldn't find item on the stack" + item);
    }

    public static void main(String[] args) {

        BasicStack<String> basicStack = new BasicStack<>();
        basicStack.push("A");
        basicStack.push("B");
        basicStack.push("C");
        basicStack.push("D");

        try {
            System.out.println(basicStack.size());
            System.out.println(basicStack.pop());
            System.out.println(basicStack.pop());
            System.out.println(basicStack.pop());
            System.out.println(basicStack.size());
            System.out.println(basicStack.contains("A"));
            System.out.println(basicStack.access("A"));
            System.out.println(basicStack.size());
            System.out.println(basicStack.pop());
            System.out.println(basicStack.pop());
            System.out.println("finishing...");
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
