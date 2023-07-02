package arraylist;

import java.util.List;

public class hapusdata {
    public static List<Integer> hapusData(int index, List<Integer> listInt){
      try {
        listInt.remove(index);
      } catch (Exception e) {
        System.err.println("\nTidak dapat menghapus data index ke-" + index +"\n");
      }
      return listInt;
    } 
}
