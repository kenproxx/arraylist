package Tree.map;

import java.util.Scanner;
import java.util.Stack;

public class main {
    public static void main(String[] args) {
        Stack<String> news = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+"");
        }
    }
}
