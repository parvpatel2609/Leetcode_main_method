import java.util.Objects;
import java.util.Stack;

public class Evaluation_Reverse_Polish_Notation {
    public static boolean isNumeric(String[] arr, int index){
        int value;
        try {
            value = Integer.parseInt(arr[index]);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }

    public static int evalRPN(String[] tokens) {
        Stack<Integer> s1 = new Stack<>();
        int n1=0, n2=0, val=0;
        for(int i=0; i<tokens.length; i++){
            if(isNumeric(tokens, i)){
                s1.push(Integer.parseInt(tokens[i]));
            }
            else{
                if(Objects.equals(tokens[i], "+")){
                    n1 = s1.pop();
                    n2 = s1.pop();
                    val = n1+n2;
                    s1.push(val);
                }
                else if(Objects.equals(tokens[i], "-")){
                    n1 = s1.pop();
                    n2 = s1.pop();
                    val = n2-n1;
                    s1.push(val);
                }
                else if(Objects.equals(tokens[i], "*")){
                    n1 = s1.pop();
                    n2 = s1.pop();
                    val = n1*n2;
                    s1.push(val);
                }
                else if(Objects.equals(tokens[i], "/")){
                    n1 = s1.pop();
                    n2 = s1.pop();
                    val = n2/n1;
                    s1.push(val);
                }
            }
        }
        return s1.pop();
    }

    public static void main(String[] args) {
        String[] token = {"4","13","5","/","+"};
        int top = evalRPN(token);
        System.out.println(top);
    }
}
