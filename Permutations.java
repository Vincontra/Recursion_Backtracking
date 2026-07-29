import java.util.*;
public class Permutations {
    class Solution {
        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>>ans=new ArrayList<>();
            List<Integer>l1=new ArrayList<>();
            HashSet<Integer>hs=new HashSet<>();
            func(ans,l1,nums,hs);
            return ans;
        }
        public static void func(List<List<Integer>>ans,List<Integer>l1,int nums[],HashSet<Integer>hs){
            if(l1.size()==nums.length){
                ans.add(new ArrayList<>(l1));
                return;
            }
            for(int i=0;i<nums.length;i++){
                if(!hs.contains(nums[i])){
                    l1.add(nums[i]);
                    hs.add(nums[i]);
                    func(ans,l1,nums,hs);
                    int last=l1.get(l1.size()-1);
                    l1.remove(l1.size()-1);
                    hs.remove(last);
                }
            }
        }
    }
}
