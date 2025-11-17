import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> numbers = new Vector<>();

        System.out.print("Enter first number: ");
        numbers.add(sc.nextInt());
        System.out.print("Enter second number: ");
        numbers.add(sc.nextInt());

        int a = numbers.get(0);
        int b = numbers.get(1);
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
}
