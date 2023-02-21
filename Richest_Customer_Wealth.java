import java.util.Scanner;

public class Richest_Customer_Wealth {

    public static int customer_Wealth(int[][] array){
        int[] answers = new int[array.length];
        for(int i=0; i< array.length; i++){
            int sum = 0;
            for(int j=0; j< array[i].length; j++){
                sum += array[i][j];
            }
            answers[i] = sum;
            sum =0;
        }
        int max = answers[0];
        for(int i=0; i< answers.length; i++){
            if(max< answers[i]){
                max = answers[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] arr_2D = new int[rows][columns];
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                arr_2D[i][j] = sc.nextInt();
            }
        }

        System.out.println(customer_Wealth(arr_2D));
    }
}
