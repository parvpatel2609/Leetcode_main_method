import java.util.Arrays;

public class Running_Sum_of_1d_Array {

    public static int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            System.out.println(sum);
            ans[i] = sum;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(arr)));
    }
}
