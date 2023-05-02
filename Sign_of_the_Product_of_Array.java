class Solution {
    public int signFunc(double val){
        if(val>0)
            return 1;
        if(val<0)
            return -1;
        else
            return 0;
    }

    public int arraySign(int[] nums) {
        double ans = 1;
        for(int i=0; i<nums.length; i++){
            ans=ans*nums[i];
            System.out.println("Value:"+ nums[i]+" multiplication:"+ans);
        }
        
        int val = signFunc(ans);
        return val;
    }
}
