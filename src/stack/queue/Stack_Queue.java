package stack.queue;

import java.util.Scanner;
import java.util.Stack;

public class Stack_Queue {

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack();
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str2 = "dung";
        char[] charA = str.toCharArray();
        for (int i = 0; i < charA.length; i++) {
            if (charA[i] == '(') {
                stringStack.push("(");
            }
            if (charA[i] == ')') {
                if (stringStack.isEmpty() == false) {
                    stringStack.pop();
                } else {
                    str2 = "sai";
                }
            }

        }
        if (stringStack.isEmpty() == false) {
            str2 = "sai";
        }
        System.out.println(str2);
    }
}
