import java.util.*;
public class RatMaze {
    class Solution {
        public ArrayList<String> ratInMaze(int[][] maze) {

            ArrayList<String>ans=new ArrayList<>();
            int n=maze.length;
            if(maze[0][0]==0||maze[n-1][n-1]==0){
                return ans;
            }

            StringBuilder sb=new StringBuilder();
            func(0,0,maze,ans,sb);
            Collections.sort(ans);
            return ans;

        }
        public static void func(int i,int j,int[][]maze,ArrayList<String>ans,StringBuilder sb){

            if(i==maze.length-1&&j==maze.length-1){
                ans.add(sb.toString());
                return;
            }
            if(i<0||j<0||i>=maze.length||j>=maze.length){
                return;
            }


            maze[i][j]=0;

            if(i<maze.length-1&&maze[i+1][j]==1){
                sb.append("D");
                maze[i+1][j]=0;
                func(i+1,j,maze,ans,sb);
                sb.setLength(sb.length()-1);
                maze[i+1][j]=1;
            }
            if(j<maze.length-1&&maze[i][j+1]==1){
                sb.append("R");
                maze[i][j+1]=0;
                func(i,j+1,maze,ans,sb);
                sb.setLength(sb.length()-1);
                maze[i][j+1]=1;
            }
            if(i>0&&maze[i-1][j]==1){
                sb.append("U");
                maze[i-1][j]=0;
                func(i-1,j,maze,ans,sb);
                sb.setLength(sb.length()-1);
                maze[i-1][j]=1;
            }
            if(j>0&&maze[i][j-1]==1){
                sb.append("L");
                maze[i][j-1]=0;
                func(i,j-1,maze,ans,sb);
                sb.setLength(sb.length()-1);
                maze[i][j-1]=1;
            }
            maze[i][j]=1;
        }
    }
}
