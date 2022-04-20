package stack.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ChuoiDoiXung {
    public static void main(String[] args) {
        Queue<String> a = new PriorityQueue<>();
       a.add("1");
       a.add("3");
       a.add("5");
        System.out.println(a);
        a.remove();
        System.out.println(a);



        Stack<String> stringStack = new Stack<>();
        String str = "Able was I ere I saw elbA";
        String str2 = "ko doi xung";
        for (int i = 0; i < str.length() /2 ; i++) {
            stringStack.push(str.charAt(i)+"");
            if (str.charAt(i) == str.charAt((str.length() - 1) - i)) {
                stringStack.pop();
            }

        }
        if (stringStack.isEmpty()) {
            str2 = "doi xung";
        }
        System.out.println(str2);
    }
}
