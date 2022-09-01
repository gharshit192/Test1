/*
 Shortest Unsorted Continuous Subarray


 Given an integer array nums, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order.

 Return the shortest such subarray and output its length.

 **/

class quickTest {
    public static void main(String[] args) {
        int arr[] = {1,3,2,2,2};
        System.out.println(calculateSubArray(arr));
    }

    private static int calculateSubArray(int[] array) {
        Integer startingIndex = -1;
        Integer lastIndex = -1;
        Integer output ;

        if (array.length < 1 || array.length == 1) return 0;
        for (int i = 0; i < array.length; i++) {
            if(i == array.length -1) return 0;
            if (array[i] <= array[i + 1]) {
                continue;
            } else {
                startingIndex = i;
                System.out.println("Stating Index"+ startingIndex);
                Integer len = array.length - 1;
                for (int k = len; k > 0; k--) {
                    if (array[k] >= array[k - 1]) {
                        continue;
                    } else {
                        lastIndex = k;
                        System.out.println("Last Index"+ lastIndex);

                        break;
                    }
                }
                if(lastIndex != -1){
                    break;
                }
            }
        }
        if(startingIndex !=-1 && lastIndex !=-1){
            output = (lastIndex-startingIndex) + 1 ;
            return output;
        }else{
            return 0;
        }
    }
}