import java.util.*;
class PermutationSwap{
    public static void fun(int ind,int[] arr){
        if(arr.length==ind){
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]);
            }
            System.out.println("");
            return;
        }
        for(int i=ind;i<arr.length;i++){
           swap(i,ind,arr);
           fun(ind+1,arr);
           swap(i,ind,arr);
        }
    }
    public static void swap(int i,int j,int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        fun(0,arr);
    }
}