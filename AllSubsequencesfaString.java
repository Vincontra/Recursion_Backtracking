import java.util.*;
public class AllSubsequencesfaString
{
    class Solution {
        public List<String> powerSet(String s) {
            // Code here
            List<String>ans=new ArrayList<>();
            String curr="";
            func(ans,s,0,curr);
            Collections.sort(ans);
            return ans;



        }
        public static void func(List<String>ans,String s ,int i,String curr){
            if(i==s.length()){
                ans.add(curr);
                return;
            }
            func(ans,s,i+1,curr+s.charAt(i));
            func(ans,s,i+1,curr);
        }
    }
}
