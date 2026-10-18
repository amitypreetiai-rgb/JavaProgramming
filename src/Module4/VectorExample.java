package Module4;

import java.util.Vector;
import java.util.ArrayList;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.add(10);
        v.add(20);

        ArrayList<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);

        System.out.println("Vector: " + v);
        System.out.println("ArrayList: " + a);
    }
}
