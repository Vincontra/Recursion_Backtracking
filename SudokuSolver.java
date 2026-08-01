public class SudokuSolver {
    class Solution {
        public void solveSudoku(char[][] board) {
            func(board,0,0);
        }
        public static boolean func(char[][]board,int i,int j){
            if(i==9){
                return true;
            }
            if(j==9){
                // last col so we should change the row
                return func(board,i+1,0);
            }
            // agar already filled hai to agla cell
            if(board[i][j]!='.'){
                return func(board,i,j+1);
            }
            for(char k='1';k<='9';k++){
                if(isValid(i,j,k,board)){
                    board[i][j]=k;
                    if(func(board,i,j+1)){
                        return true;
                    }
                    board[i][j]='.';
                }
            }
            return false;
        }
        public static boolean isValid(int i,int j,char k,char board[][]){
            // iss row me
            for(int l=0;l<9;l++){
                if(board[i][l]==k){
                    return false;
                }
            }
            //iss col me
            for(int l=0;l<9;l++){
                if(board[l][j]==k){
                    return false;
                }
            }
            // har 3*3 wala wo sab check
            //i,j se start cell for that 3*3 grid nikalna padega
            // row=i-i%3
            // col=j-j%3
            // ye chiz i did not derive so keep it in mind
            int r=i-i%3;
            int c=j-j%3;

            for(int l=0;l<3;l++){
                for(int m=0;m<3;m++){
                    if(board[l+r][m+c]==k){
                        return false;
                    }
                }
            }
            return true;
        }
    }
}
