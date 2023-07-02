package arraylist;
import java.util.Collections;
import java.util.List;

public class sortingarray {
    public static <T extends Comparable<? super T>> void sortingDesc(List<T> listInt) {
        Collections.sort(listInt, Collections.reverseOrder()); 
        System.out.println("Array yang telah diurutkan Descending "+listInt); 
    }

    public static <T extends Comparable<? super T>> void sortingAsc(List<T> listInt) {
        Collections.sort(listInt); 
        System.out.println("Array yang telah diurutkan Ascending "+listInt); 
    }
}
