import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kids_With_the_Greatest_Number_of_Candies {

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();

        int max = 0;
        for(int i=0; i<candies.length; i++){
            if(max < candies[i]){
                max = candies[i];
            }
        }

        for(int i=0; i<candies.length; i++){
            candies[i] += extraCandies;
        }

        for(int i=0; i<candies.length; i++){
            if(candies[i] >= max){
                ans.add(true);
            }
            else{
                ans.add(false);
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int extracandies = 3;
        int[] arr = {2,3,5,1,3};
        System.out.println(List.of(kidsWithCandies(arr, extracandies)));
    }
}
