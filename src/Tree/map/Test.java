package Tree.map;

import java.util.*;
import java.util.concurrent.DelayQueue;

public class Test {

    public static void main(String[] args) {
        Stack<Integer> newStack = new Stack<>();

        List<Integer> listStack = new ArrayList<>();
        Queue<Integer> num = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int solan = scanner.nextInt();
        int so;
        for (int i = 0; i < solan; i++) {
            so = scanner.nextInt();
            scanner.nextLine();
            listStack.add(so);
        }
        System.out.println(listStack);

        for (int i = 0; i < listStack.size(); i++) {
            newStack.push(listStack.get(i));

        }

        for (int i = 0; i < listStack.size() ; i++) {

            listStack.set(i,newStack.pop());
        }
        System.out.println(listStack);

    }
}


