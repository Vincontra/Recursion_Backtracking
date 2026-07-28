import java.util.*;
public class Subsets {
    class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>>ans=new ArrayList<>();
            List<Integer>l1=new ArrayList<>();
            func(ans,l1,nums,0);
            return ans;
        }
        public static void func(List<List<Integer>>ans,List<Integer>l1,int nums[],int i){
            if(i>=nums.length){
                ans.add(new ArrayList<>(l1));
                return;
            }
            l1.add(nums[i]);
            func(ans,l1,nums,i+1);
            l1.remove(l1.size()-1);
            func(ans,l1,nums,i+1);
        }
    }
}
