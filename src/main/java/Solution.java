import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr ,target)));
    }

    public static  Object[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        // int output [] = {};
        ArrayList<Integer> arrayList = new ArrayList<Integer>();  

        for (int i = 0; i < nums.length; i++)
        {
            if (map.containsKey(target - nums[i])){

                arrayList.add(map.get(target - nums[i]));
                arrayList.add(map.get(nums[i]));

                return  arrayList.toArray();
                
                // System.out.printf("Pair found (%d, %d)",
                    // nums[map.get(target - nums[i])], nums[i]);
                // return;
            }
 
            // store index of the current element in the map
            map.put( nums[i], i);
        }
        return arrayList.toArray();
    }
}