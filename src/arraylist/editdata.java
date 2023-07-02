package arraylist;

import java.util.List;

public class editdata {
 public static List<Integer> editData(int index, int value, List<Integer> listInt){
      listInt.set(index, value);
      return listInt;
    }   
}
