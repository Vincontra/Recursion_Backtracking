import java.util.*;
public class MColoringProblem {
    class Solution {
        boolean graphColoring(int v, int[][] edges, int m) {
            ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
            for(int i=0;i<v;i++){
                adj.add(new ArrayList<>());
            }
            for(int i=0;i<edges.length;i++){
                int u=edges[i][0];
                int V=edges[i][1];
                adj.get(u).add(V);
                adj.get(V).add(u);
            }
            int col[]=new int[v]; // col 1 to m;
            return func(adj,col,0,m,0);

        }
        public static boolean func(ArrayList<ArrayList<Integer>>adj,int col[],int node,int m,int cnt){
            if(cnt==adj.size()){
                return true; // sabko col de chuke
            }

            for(int i=1;i<=m;i++){
                if(col[node]==0&&kyaColDebhiSaktaHu(node,i,adj,col)){
                    col[node]=i;
                    if(func(adj,col,node+1,m,cnt+1)){  // isme neighbourse se jyada adajacent number wise
                        // usspr focus hai i mean q hi hai waisa
                        return true;
                    }
                    col[node]=0;// backtrack dusra color dekhe dekhna padega
                }

            }
            return false;
        }
        public static boolean kyaColDebhiSaktaHu(int node,int c,ArrayList<ArrayList<Integer>>adj,int col[]){

            for(int i:adj.get(node)){
                if(col[i]!=0&&col[i]==c){
                    return false;
                }
            }
            return true;
        }
























    }
}
