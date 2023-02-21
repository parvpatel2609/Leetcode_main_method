public class Valid_Palindrome {
    public static boolean isPalindrome(String s) {
        String str = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>=65 && s.charAt(i)<=90){
                char ch = s.charAt(i);
                int ascii_value = ch +32;
                str = str + (char)ascii_value;
            }
            else if(s.charAt(i)>=48 && s.charAt(i)<=57){
                str = str + s.charAt(i);
            }

            else if(s.charAt(i)>=97 && s.charAt(i)<=122){
                str = str + s.charAt(i);
            }
        }
//        System.out.println(str + " ");
        String reverse ="";
        for(int i=str.length()-1; i>=0; i--){
            reverse = reverse + str.charAt(i);
        }
//        System.out.println(reverse);
        if(str.equals(reverse)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = ("0P").toLowerCase();
        System.out.println(isPalindrome(str));
    }
}
