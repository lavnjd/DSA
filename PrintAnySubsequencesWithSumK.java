import java.util.*;
class PrintAnySubsequencesWithSumK{
    public static boolean fun(int ind,int[] arr,List<Integer> ans,int k,int sum){
        if(ind==arr.length){
            if(sum==k){
                for(Integer i:ans){
                    System.out.print(i);
                }
                return true;
            }else{
                return false;
            }
        }
        ans.add(arr[ind]);
        sum+=arr[ind];
        if(fun(ind+1,arr,ans,k,sum)){
            return true;
        }
        sum =sum-ans.get(ans.size()-1);
        
        ans.remove(ans.size()-1);
        if(fun(ind+1,arr,ans,k,sum)){
            return true;
        }
        return false;
    }
    public static void main(String[] args){
        int[] arr = {3,1,2,5,6,3,1,2,8,9};
        List<Integer> ans = new ArrayList<>();
        int ind = 0;
        fun(ind,arr,ans,10,0);
    }
}