public class KthSymbolOfGrammer {
    public static void main(String[] args) {

        // q aisa hai ki
        // there is a grammer which generates only 0 or 1
        // base is n=1 and k=1 then synmbol is 0

        // now for every further levels 0-> 01
        // 1-->10

        // so like this
        // 0
        // 01
        // 0110
        // 01101001
        // so on.....
        // now n and k will be given we have to sout that character

        // now the logic is :
        // agar if you have observed almost half part as it is next level me ja rha hai
        // and jo adha bach rha wo toggle hai

        // like level3 is 0110
        // lvl4 is 0110 1001
        // so half is exact to lvl3 and baki half is toggled

        // that is what written by me

        System.out.println(func(4,8));




    }
    public static int func(int n,int k){
        if (n==1&&k==1){
            return 0;
        }
        int mid=(1<<(n-1))/2;
        if (k<=mid){
            return func(n-1,k);
        }
        else{
            int tog=func(n-1,k-mid);
            if (tog==0){
                return 1;
            }else{
                return 0;
            }
        }

    }
}
