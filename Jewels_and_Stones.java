public class Jewels_and_Stones {

    public static int numJewelsInStones(String jewels, String stones) {

        int count = 0;
        for(int i=0; i<stones.length(); i++){
            if(jewels.contains(String.valueOf(stones.charAt(i)))){
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String jewels = "aA", stones = "aAAbbbb";
        int val = numJewelsInStones(jewels, stones);
        System.out.println(val);
    }
}
