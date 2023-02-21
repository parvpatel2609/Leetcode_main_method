import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Majority_Element {

    public static int majorityElement(int[] nums){
        HashMap<Integer, Integer> hm = new HashMap<>();

        for(int i=0; i< nums.length; i++){
            if(hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i]) + 1);
            }
            else{
                hm.put(nums[i], 1);
            }
        }

        int max = (Collections.max(hm.values()));

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() == max) {
                return entry.getKey();
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        int ans = majorityElement(arr);
        System.out.println(ans);
    }
}
