import java.util.*;

public class CollectionsDemo {
    public static void main(String[] args) {

        System.out.println("----- ArrayList Demo -----");

        ArrayList<String> list = new ArrayList<>();

        list.add("Constructors");
        list.add("Inheritance");
        list.add("Abstraction");
        list.add("Exception Handling");

        System.out.println("ArrayList elements: " + list);
        System.out.println("Element at index 1: " + list.get(1));

        list.remove("Abstraction");

        System.out.println("After removing 'Abstraction': " + list);
        System.out.println("Size of list: " + list.size());

        System.out.println("\n----- HashMap Demo -----");

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Arun");
        map.put(102, "Bala");
        map.put(103, "Chitra");

        System.out.println("HashMap entries:");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(
                "Roll No: " + entry.getKey() +
                "  Name: " + entry.getValue()
            );
        }

        System.out.println("Value for key 102: " + map.get(102));

        map.remove(101);

        System.out.println("After removing key 101: " + map);
    }
}