import java.util.Arrays;

public class Capitalize_the_Title {
    public static String capitalizeTitle(String title) {
        String[] arr = title.split(" ");
        System.out.println(Arrays.toString(arr));
        StringBuilder str = new StringBuilder();

        for(int i=0; i<arr.length; i++){
            String v = arr[i];

            if(v.length()<=2){
                for(int j=0; j<v.length(); j++){
//                    char val = Character.toLowerCase(v.charAt(j));
                    str.append(Character.toLowerCase(v.charAt(j)));
                }
            }

            else{
                for(int j=0; j<v.length(); j++){
                    if(j==0){
//                        char val = Character.toLowerCase(v.charAt(j));
                        str.append(Character.toUpperCase(v.charAt(j)));
                    }
                    else{
//                        char val = Character.toLowerCase(v.charAt(j));
                        str.append(Character.toLowerCase(v.charAt(j)));
                    }
                }
            }

            if(i!=arr.length-1){
                str.append(" ");
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String str = "capiTalIze tHe titLe";
        String ans = capitalizeTitle(str);
        System.out.println(ans);
    }
}
