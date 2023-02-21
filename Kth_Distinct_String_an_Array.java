import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Kth_Distinct_String_an_Array {

    public static String kthDistinct(String[] arr, int k){

        HashMap<String,Integer> hm = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i], 1);
            }
        }

        System.out.println(hm);

        List<String> al = new ArrayList<>();

        for(int i=0; i< arr.length; i++) {
            if(hm.get(arr[i]) == 1) {
                al.add(arr[i]);
            }
        }

        for(int i=0; i<al.size(); i++){
            if(i == k-1){
                return al.get(i);
            }
        }
        return "";
    }

    public static void main(String[] args) {
        String[] arr = {"d","b","c","b","c","a"};
        int k=2;
        String ans = kthDistinct(arr,k);
        System.out.println(ans);
    }
}
