import java.util.*;
public class NQueens {
    class Solution {
        public List<List<String>> solveNQueens(int n) {
            List<List<String>>ans=new ArrayList<>();
            List<String>l1=new ArrayList<>();
            HashSet<Integer>col=new HashSet<>();
            HashSet<Integer>ld=new HashSet<>();
            HashSet<Integer>rd=new HashSet<>();
            func(0,ans,l1,col,n,ld,rd);
            return ans;
        }
        public static void func(int row,List<List<String>>ans,List<String>l1,HashSet<Integer>col,int n,HashSet<Integer>ld, HashSet<Integer>rd){
            if(row==n){
                ans.add(new ArrayList<>(l1));
                return;
            }
            // StringBuilder sb=new StringBuilder();
            for(int j=0;j<n;j++){
                StringBuilder sb=new StringBuilder();
                if(col.contains(j)||rd.contains(row+j)||ld.contains(row-j)){
                    continue;
                }
                else{
                    for(int a=0;a<j;a++){
                        sb.append(".");
                    }
                    sb.append("Q");
                    col.add(j);
                    ld.add(row-j);
                    rd.add(row+j);
                    int cellleft=n-j-1;
                    for(int i=1;i<=cellleft;i++){
                        sb.append(".");
                    }
                    l1.add(sb.toString());
                    func(row+1,ans,l1,col,n,ld,rd);
                    l1.remove(l1.size()-1);
                    col.remove(j);
                    ld.remove(row-j);
                    rd.remove(row+j);
                }
            }
        }
    }
}
