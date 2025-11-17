import java.util.*;
class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");
        fruits.add("Apple"); // duplicates
        System.out.println("Fruits: " + fruits);

        fruits.remove("Banana"); // remove
        System.out.println("After remove: " + fruits);

        System.out.println("First Fruit: " + fruits.get(0)); // access
    }
}
