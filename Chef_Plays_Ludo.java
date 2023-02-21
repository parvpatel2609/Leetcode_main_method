import java.util.Scanner;

public class Chef_Plays_Ludo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0; i<num; i++){
            int val = sc.nextInt();
            if(val==6){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
