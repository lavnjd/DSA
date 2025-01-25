import java.util.*;
class CombinationSumII{
    public static void fun(int ind,int[] arr, List<Integer> ans, List<List<Integer>> res,int target){
        if(target == 0){
            res.add(new ArrayList<>(ans));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1] ) {continue;}
            if(arr[i]>target) {break;}
            ans.add(arr[i]);
            fun(i+1,arr,ans,res,target-arr[i]);
            ans.remove(ans.size()-1);
        }
    }
    public static void main(String[] args){
        int[] arr = {2,5,2,1,2};
        Arrays.sort(arr);
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        fun(0,arr,ans,res,5);
        for(List<Integer> a : res){
            for(Integer b:a){
                System.out.print(b);
            }
            System.out.println("");
        }
    }
}