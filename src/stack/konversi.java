package stack;
import java.util.List;
import java.util.Stack;

public class konversi {
    public static Stack<Integer> konversiArrayList(List<Integer> array, Stack<Integer> stack){
      for(Integer i : array)
        stack.push(i);
      return stack;
    }
}
