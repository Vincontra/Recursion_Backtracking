import java.util.*;
public class PermutationSequence {
    //lc 60
    class Solution {
        public String getPermutation(int n, int K) {
            StringBuilder sb=new StringBuilder();
            long fact[]=new long[n];
            fact[0]=1;
            for(int i=1;i<n;i++){
                fact[i]=i*(fact[i-1]);
            }
            ArrayList<Integer>l1=new ArrayList<>();
            for(int i=1;i<=n;i++){
                l1.add(i);
            }
            long k=K-1;
            while(true){
                sb.append(l1.get((int)(k/fact[n-1])));
                l1.remove((int)(k/fact[n-1]));
                if(l1.size()==0){
                    break;
                }
                k=k%fact[n-1];
                n--;
            }
            return sb.toString();
        }
    }


}
