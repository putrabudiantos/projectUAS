package stack;

import java.util.Stack;

public class reversedata {

    private static <T> T popBottom(Stack<T> stack) {
        T top = stack.pop();
        if (stack.isEmpty()) {
            return top;
        } else {
            T bottom = popBottom(stack);
            stack.push(top);
            return bottom;
        }
    }

    public static <T> void reverseStack(Stack<T> stack) {
        if (stack.isEmpty()) {
            return;
        }
        T bottom = popBottom(stack);
        reverseStack(stack);
        stack.push(bottom);
    }
}
