package Tree.map;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class test2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();


        Stack<Character> characterStack = new Stack<>();


        String a = "jkdsfkjal  s;d5";


        char[] b ;

        b = a.toCharArray();

        System.out.println(b);
        System.out.println(b.length);


        for (int i = 0; i < b.length; i++) {
            characterStack.push(b[i]);
        }
        System.out.println(characterStack);
        for (int i = 0; i < b.length; i++) {
            b[i] = characterStack.pop();
        }
        System.out.println(b);




        String s = new String();
        String ab  = s.valueOf(b);
        stack.push(ab);

        System.out.println(stack);



    }
}
