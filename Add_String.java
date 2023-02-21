import java.math.BigInteger;
import java.util.Scanner;

public class Add_String {

    public static String addStrings(String num1, String num2) {
//        long n1 = Long.parseLong(num1);
//        long n2 = Long.parseLong(num2);
//        System.out.printf("n1 is : " + n1 + "\nn2 is : " + n2);
//        System.out.println();
//        long sum = n1+n2;
//        System.out.println("Sum of to long number is : " + sum);
//        return Long.toString(sum);
        BigInteger n1 = new BigInteger(num1);
        BigInteger n2 = new BigInteger(num2);
        BigInteger sum = n1.add(n2);
        String str = sum.toString();
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.next();
        String n2 = sc.next();
        String res = addStrings(n1,n2);
        System.out.println(res);
    }
}
