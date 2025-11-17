import java.util.*;
class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> shoes = new Hashtable<>();
        shoes.put(101, "Nike");
        shoes.put(102, "Adidas");
        shoes.put(103, "Puma");

        System.out.println("Shoe Collection: " + shoes);
        System.out.println("Shoe with ID 102: " + shoes.get(102));

        shoes.remove(104);
        System.out.println("After removing ID 104: " + shoes);

        System.out.println("Contains ID 101? " + shoes.containsKey(101));
    }
}
