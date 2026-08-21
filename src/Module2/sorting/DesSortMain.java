package Module2.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class DesSortMain {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();
        names.add("Banana");
        names.add("Apple");
        names.add("Mango");
        names.add("Cherry");

        System.out.println("Before sorting: " + names);

        Collections.sort(names, (a, b) -> b.compareTo(a));

        System.out.println("After sorting (descending): " + names);
    }
}