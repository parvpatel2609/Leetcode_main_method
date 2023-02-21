import java.util.Objects;
import java.util.Scanner;

public class Palindrome_Number {
    public static boolean isPalindrome(int num){
        String reverse = "";
        String num_str = String.valueOf(num);
//        int length = String.valueOf(num).length();
//        System.out.println(length);
        for(int i=0; i<num_str.length() ; i++){
            reverse = num_str.charAt(i) + reverse;
        }
//        System.out.println(reverse);
        if(Objects.equals(reverse, num_str)){
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPalindrome(num));
    }
}
