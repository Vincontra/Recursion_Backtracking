import java.util.*;
public class CombinationSumII {
    class Solution {
        public List<List<Integer>> combinationSum2(int[]arr, int tar) {
            Arrays.sort(arr);
            List<List<Integer>>ans=new ArrayList<>();
            int n=arr.length;
            List<Integer>l1=new ArrayList<>();
            func(ans,l1,arr,n-1,tar);
            return ans;
        }
        public static void func(List<List<Integer>>ans,List<Integer>l1,int arr[],int n,int tar){
            if(n<0){
                if(tar==0){
                    ans.add(new ArrayList<>(l1));
                }
                return;
            }
            if(tar==0){
                ans.add(new ArrayList<>(l1));
                return;
            }
            if(tar<0){
                return;
            }
            if(n==0){ // 0th index wala banda if we can take multiple time
                if(tar-arr[0]==0){
                    l1.add(arr[0]);
                    ans.add(new ArrayList<>(l1));
                    l1.remove(l1.size()-1);
                }
                return;
            }

            if(tar-arr[n]>=0){
                l1.add(arr[n]);
                func(ans,l1,arr,n-1,tar-arr[n]);
                l1.remove(l1.size()-1);
            }
            // agar nhi le rhe means we need to skip it lekin sabko krna padega as list bhi duplicate nhi chhaiye
            int j=n-1;
            while(j>=0&&arr[j]==arr[n]){
                j--;
            }
            func(ans,l1,arr,j,tar);
        }
    }
}
