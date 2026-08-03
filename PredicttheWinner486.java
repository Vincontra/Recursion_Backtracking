public class PredicttheWinner486 {
    class Solution {
        public boolean predictTheWinner(int[] nums) {
            // question hai ki kya player 1 jit sakta kya
            // matlab kya palyer 2 haar sakta kya
            // jab bhi play1 ki turn hogi kya koi aisa way hai jo usko jeeta de
            // that means do choices me se kisi ek ne bhi jeeta diya then he wins
            // hence or use kr lete hai

            //ply2 ke isme simple hai agar ply1 ko jitna hai that means usko haarna padega
            // matlab ek bhi way aisa jisse wo haar jaye hence AND use kr liya

            // abhi aisa bhi ho sakta that play 2 na haare then that means dono ways se wo jeet raha hoga
            return func(nums,0,nums.length-1,true,0,0);
        }
        public static boolean func(int nums[],int i,int j,boolean turn,int s1,int s2){
            if(i>j){
                if(s1>=s2){
                    return true;
                }
                return false;
            }
            if(turn){
                return func(nums,i+1,j,false,s1+nums[i],s2)||func(nums,i,j-1,false,s1+nums[j],s2);

            }else{
                return func(nums,i+1,j,true,s1,s2+nums[i])&&func(nums,i,j-1,true,s1,s2+nums[j]);
            }
        }
    }
}
