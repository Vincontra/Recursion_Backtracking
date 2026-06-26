import java.util.*;
public class SortAnArray {
    public static void main(String[] args) {
        int arr[]={3,2,1,60};
        sort(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[],int idx){
        if (idx==arr.length){
            return;
        }
        // What we will do that we will find the min element with its min idx
        // so far and just swap with current one
        // and then move ahead
        int minidx=0;
        int Min=Integer.MAX_VALUE;
        int curr=minIDx(idx,arr,minidx,Min);

        int temp=arr[curr];
        arr[curr]=arr[idx];
        arr[idx]=temp;
        sort(arr,idx+1);
    }
    public static int minIDx(int idx,int arr[],int minIdx,int min){
        if (idx== arr.length){
            return minIdx;
        }
        if (min>arr[idx]){
            minIdx=idx;
            min=arr[idx];
        }
        return minIDx(idx+1,arr,minIdx,min);
    }
}
