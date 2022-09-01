import java.util.Collections;
import java.util.List;

public class NumberProb {
    public static void main(String[] args) {
        calculatePair(5, Collections.emptyList());
    }
    public static void calculatePair(int num, List<Integer> combinationList) {
        int found = 0;
        for (int i =0 ; i<=num ;i++){
            found =+ i;
            for (int j= 0; j<=num; j++){
                if ((found+ j) == num){
                    combinationList.add(found,j );
                    calculatePair(found+j, combinationList);
                }
            }
        }
        System.out.println(combinationList);
    }

}
