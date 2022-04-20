package Tree.map;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;

public class TreeMap2 {
    public static void main(String[] args) {
        Set<Integer> newSet = new LinkedHashSet<>();
        Stack<Integer> ab = new Stack<>();
        int[] a = {12,32325,12,3345,34,12312};
        Long b = 1264342342384723435L;

        while (b > 0) {
            ab.push((int) (b%10));
            b /= 10;
        }
        for (int i = 0; i < ab.size(); ) {
            newSet.add(ab.pop());
        }
        System.out.println(newSet);
    }
}
