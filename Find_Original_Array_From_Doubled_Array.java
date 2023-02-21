import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_Original_Array_From_Doubled_Array {

    public static int[] findOriginalArray(int[] changed) {
        List<Integer> ls = new ArrayList<>();
        for(int i=0; i<changed.length; i++){
            int val = changed[i]*2;
            System.out.print(val + " ");
            for(int j=i+1; j<changed.length; j++){
                if(changed[j] == val){
                    ls.add(changed[i]);
                    System.out.println(changed[i]);
                }
            }
        }
        int[] ans = new int[ls.size()];
        for(int i=0; i<ls.size(); i++){
            ans[i] = ls.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,6,8};
        int[] ans = findOriginalArray(arr);
        System.out.println(Arrays.toString(ans));
    }
}
