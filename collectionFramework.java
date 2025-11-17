import java.util.*;
class Main {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Prithwi");
    names.add("Aayush");
    names.add("Partha");
    names.add("Prithwi"); // duplicate
    System.out.println("ArrayList: " + names);

    HashSet<String> set = new HashSet<>(names);
    System.out.println("HashSet: " + set); // removes duplicate
  }
}
