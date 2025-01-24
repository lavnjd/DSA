import java.util.*;
class CountAllSubsequencesWithSumK{
    public static int fun(int ind,int[] arr,List<Integer> ans,int k,int sum,int mini){
        if(ind==arr.length){
            if(sum==k){
                return 1;
            }
            return 0;
        }
        ans.add(arr[ind]);
        sum+=arr[ind];
        int left = fun(ind+1,arr,ans,k,sum,mini);
        sum =sum-ans.get(ans.size()-1);
        
        ans.remove(ans.size()-1);
        int right = fun(ind+1,arr,ans,k,sum,mini);
        
        return left+right;
    }
    public static void main(String[] args){
        int[] arr = {1,1,2};
        List<Integer> ans = new ArrayList<>();
        int ind = 0;
        System.out.println(fun(ind,arr,ans,2,0,0));
    }
}