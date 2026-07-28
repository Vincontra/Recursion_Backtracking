import java.util.*;
public class SubsetsII {
    class Solution {
        public List<List<Integer>> subsetsWithDup(int[] nums) {
            Arrays.sort(nums);
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
            while(i<nums.length-1&&nums[i]==nums[i+1])i++;
            func(ans,l1,nums,i+1);
        }
    }
}
