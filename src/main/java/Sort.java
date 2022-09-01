import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



class Sort {
 
    public static void main(String[] args) {
    String order0 = "hlabcdefgijkmnopqrstuvwxyz";
    String [] words0 = {"hello","leetcode"};

    String order1 = "worldabcefghijkmnpqstuvxyz";
    String [] words1 = {"word","world","row"};

    String order2 = "abcdefghijklmnopqrstuvwxyz";
    String [] words2 = {"apple","app"};

    Boolean result = SortArray(order1,words1);
    System.out.println("RESULT" + result);
    }
    public static  Boolean SortArray(String order , String[] arr){
        Map<Character, Integer> map = new HashMap<Character,Integer>(); 

        for (int i = 0; i <order.length(); i++) {
            map.put(order.charAt(i), i);
        }
        map.put('Z', 26);
        System.out.println(map);
        Boolean fianl_output = true  ;
        List<Boolean> output = new ArrayList<Boolean>();
        for (int i = 0; i < arr.length-1; i++) {
            String a = arr[i];
            String b ; if(i+1 == arr.length){
                b = arr[i];
            }else{
                b = arr[i+1];
            }
            System.out.println("Word-1 "+a +" Word-2 " + b);
            for(int z = 0; z < Math.min(a.length(),b.length()); z++){
                Integer v1 = map.get(a.charAt(z)) ;
                Integer v2 = map.get(b.charAt(z));
                System.out.println("V-1 "+ v1 +" V-2  " + v2);


                if (v1 == v2){
                    continue;
                }
                else if(v1 < v2){
                    output.add(true);
                    break;
                }else {
                    output.add(false);
                    break;
                }
                
            }
        }
        for (Boolean b  : output)
        {
            Boolean x = b;
            fianl_output = (x && b);
        }
        return fianl_output;
    }  
    
}