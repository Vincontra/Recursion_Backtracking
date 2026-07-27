import java.util.*;
public class CombinationSum {
    class Solution {
        public List<List<Integer>> combinationSum(int[]arr, int tar) {
            List<List<Integer>>ans=new ArrayList<>();
            int n=arr.length;
            List<Integer>l1=new ArrayList<>();
            func(ans,l1,arr,n-1,tar);
            return ans;
        }
        public static void func(List<List<Integer>>ans,List<Integer>l1,int arr[],int n,int tar){
            if(tar==0){
                ans.add(new ArrayList<>(l1));
                return;
            }
            if(tar<0){
                return;
            }
            if(n==0){ // 0th index wala banda if we can take multiple time
                if(tar%arr[0]==0){
                    int cnt=tar/arr[0];
                    for(int j=1;j<=cnt;j++){
                        l1.add(arr[0]);
                    }
                    ans.add(new ArrayList<>(l1));
                    for(int j=1;j<=cnt;j++){
                        l1.remove(l1.size()-1);
                    }
                }
                return;
            }

            if(tar-arr[n]>=0){
                l1.add(arr[n]);
                func(ans,l1,arr,n,tar-arr[n]);
                l1.remove(l1.size()-1);
            }
            func(ans,l1,arr,n-1,tar);

        }
    }
}
