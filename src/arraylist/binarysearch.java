package arraylist;
import java.util.List;

public class binarysearch {
    public static int binarySearch(List<Integer> listInt, int x){
        int left = 0, right = listInt.size() - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (listInt.get(mid) == x)
                return mid;
            if (listInt.get(mid) < x)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

}
