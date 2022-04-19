package stack.queue;

import java.util.Scanner;
import java.util.Stack;

public class DecimalToBinanry {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<>();
        int num = 111;
        while (num != 0) {
            int  num2 = num % 2;
            integerStack.push(num2);
            num /= 2;
        }
        System.out.println(integerStack);
        System.out.println(integerStack.size());
//        for (int i = 0; i < integerStack.size(); i++) {
//            System.out.print(integerStack.pop());
//        }
        while (!integerStack.isEmpty()) {
            System.out.print(integerStack.pop());
        }
    }
}
//
//                Scanner in = new Scanner(System.in);
//                Stack<Integer> stack = new Stack<Integer>();
//                System.out.println("Nhập vào số thập phân: ");
//                int num = in.nextInt();
//                while (num != 0)
//
//                {
//                    int d = num % 2;
//                    stack.push(d);
//                    num /= 2;
//                }
//                System.out.print("\nGiá trị nhị phân là: ");
//                while (!(stack.isEmpty() ))
//                {
//                    System.out.print(stack.pop());
//                }
//                System.out.println();
//            }
//        }