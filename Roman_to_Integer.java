import java.util.Scanner;

public class Roman_to_Integer {

    public static int romanToInt(String s) {
        int sum = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'I'){
                if(i==s.length()-1){
                    sum += 1;
                }
                else{
                    if(s.charAt(i+1) == 'V'){
                        sum += 4;
                        i++;
                        continue;
                    }
                    if(s.charAt(i+1) == 'X'){
                        sum += 9;
                        i++;
                        continue;
                    }
                    else{
                        sum += 1;
                    }
                }
            }
            if(s.charAt(i) == 'V'){
                sum += 5;
            }
            if(s.charAt(i) == 'X'){
                if(i==s.length()-1){
                    sum += 10;
                }
                else{
                    if(s.charAt(i+1) == 'C'){
                        sum += 90;
                        i++;
                        continue;
                    }
                    if(s.charAt(i+1) == 'L'){
                        sum += 40;
                        i++;
                        continue;
                    }
                    else{
                        sum += 10;
                    }
                }
            }

            if(s.charAt(i) == 'L'){
                if(i==s.length()-1){
                    sum += 50;
                }
                else{
                    if(s.charAt(i+1) == 'C'){
                        sum += 50;
                        i++;
                        continue;
                    }
                    if(s.charAt(i+1) == 'M'){
                        sum += 950;
                        i++;
                        continue;
                    }
                    if(s.charAt(i+1) == 'D'){
                        sum += 450;
                        i++;
                        continue;
                    }
                    else{
                        sum += 50;
                    }
                }

            }

            if(s.charAt(i) == 'C'){
                if(i==s.length()-1){
                    sum += 100;
                }
                else{
                    if(s.charAt(i+1) == 'M'){
                        sum += 900;
                        i++;
                        continue;
                    }
                    if(s.charAt(i+1) == 'D'){
                        sum += 400;
                        i++;
                        continue;
                    }
                    else{
                        sum += 100;
                    }
                }
            }

            if(s.charAt(i) == 'D'){
                if(i==s.length()-1){
                    sum += 500;
                }
                else{
                    if(s.charAt(i+1) == 'M'){
                        sum += 500;
                        i++;
                        continue;
                    }
                    else{
                        sum += 500;
                    }
                }

            }

            if(s.charAt(i) == 'M'){
                sum += 1000;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(romanToInt(s));
    }
}
