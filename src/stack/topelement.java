package stack;
import java.util.Stack;

public class topelement {
    public static <T> T topElement(Stack<T> stack) {
        T top = stack.firstElement();
        return top;
    }
}
