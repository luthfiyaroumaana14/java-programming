public class GenericsDemo {

    // Generic class
    static class Box<T> {
        private T value;

        void set(T value) {
            this.value = value;
        }

        T get() {
            return value;
        }
    }

    // Generic method
    static <T extends Comparable<T>> T findMax(T[] arr) {
        T max = arr[0];

        for (T element : arr) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("----- Generic Class Demo -----");

        Box<Integer> intBox = new Box<>();
        intBox.set(101);
        System.out.println("Integer Box value: " + intBox.get());

        Box<String> strBox = new Box<>();
        strBox.set("Revathy");
        System.out.println("String Box value: " + strBox.get());

        System.out.println("\n----- Generic Method Demo -----");

        Integer[] numbers = {45, 89, 12, 67, 34};
        System.out.println("Maximum of Integer array: " + findMax(numbers));

        String[] names = {"Arun", "Bala", "Chitra", "Deepak"};
        System.out.println(
            "Maximum (lexicographically) of String array: " + findMax(names)
        );
    }
}