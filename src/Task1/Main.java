package Task1;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5);
        stack.push(6);
        stack.push(7);

        for (int item : stack.iterable()) {
            System.out.println(item);
        }
    }
}