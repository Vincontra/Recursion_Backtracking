public class ValidSudoku {
    class Solution {
        public boolean isValidSudoku(char[][]arr) {
            for(int i=0;i<9;i++){
                boolean check[]=new boolean[10];
                for(int j=0;j<9;j++){
                    if(arr[i][j]!='.'){
                        if(check[arr[i][j]-'0']){
                            return false;
                        }
                        check[arr[i][j]-'0']=true;

                    }
                }
            }
            for(int i=0;i<9;i++){
                boolean check[]=new boolean[10];
                for(int j=0;j<9;j++){
                    if(arr[j][i]!='.'){
                        if(check[arr[j][i]-'0']){
                            return false;
                        }
                        check[arr[j][i]-'0']=true;
                    }
                }
            }

            int i=0;
            int j=0;
            while(i<9){
                j=0;
                while(j<9){
                    int sr=i;
                    int sc=j;
                    boolean check[]=new boolean[10];
                    for(int k=sr;k<sr+3;k++){
                        for(int l=sc;l<sc+3;l++){
                            if(arr[k][l]!='.'){
                                if(check[arr[k][l]-'0']){
                                    return false;
                                }
                                check[arr[k][l]-'0']=true;
                            }
                        }
                    }
                    j+=3;
                }
                i+=3;
            }
            return true;
        }
    }
}
