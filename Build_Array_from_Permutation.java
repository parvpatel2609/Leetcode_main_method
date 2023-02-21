import java.util.Arrays;
import java.util.Scanner;

public class Build_Array_from_Permutation {

    public static int[] build_Array_permutation(int[] array){
        int[] ans = new int[array.length];
        for(int i=0; i< array.length; i++){
            ans[i] = array[array[i]];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(build_Array_permutation(arr)));
    }
}
