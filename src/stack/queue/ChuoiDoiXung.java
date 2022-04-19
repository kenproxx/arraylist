package stack.queue;

import java.util.Stack;

public class ChuoiDoiXung {
    public static void main(String[] args) {
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
