package arraylist;
import java.util.List;
import java.util.Scanner;

public class tambahdata {
    public static List<String> tambahData(int length, List<Integer> listInt, List<String> listString, Scanner stdin){
      for(int i = 0; i<length; i++){
           System.out.print("Data array ke-"+i+" : ");
           listInt.add(stdin.nextInt());
        }
      for(Integer i: listInt) {
           listString.add(String.valueOf(i));
        }
      return listString;
    }
}
