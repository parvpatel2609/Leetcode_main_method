import java.util.Objects;
import java.util.Scanner;

public class Final_Value_of_Variable_After_Performing_Operations {

    public static int finalValueAfterOperations(String[] arr){
        int val = 0;
        for(int i=0; i< arr.length; i++){
            if(Objects.equals(arr[i], "++X") || Objects.equals(arr[i], "X++")){
                val++;
            }
            else if (Objects.equals(arr[i], "--X") || Objects.equals(arr[i], "X--")) {
                val--;
            }
        }
        return val;
    }

    public static void main(String[] args) {

        String[] arr = {"X++","++X","--X","X--"};
        System.out.println(finalValueAfterOperations(arr));
    }
}
