import java.util.ArrayList;
import java.util.List;

public class RevArray {
    public static void main(String[] args) {
        int[] arr  = {1,3,5};
        List output = array(arr);
        System.out.println(output);
    }

    public static List array(int [] arr){
        List list = new ArrayList();
        for (int i = arr.length-1; i >=0 ; i--) {
            list.add(arr[i]);
        }
        return list;
    }
}
