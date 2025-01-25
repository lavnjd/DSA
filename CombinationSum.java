import java.util.*;
class CombinationSum{
    public static void fun(int ind,int[] arr,List<Integer> ans,List<List<Integer>> res,int target){
        if(ind==arr.length){
            if(target ==0){
                res.add(new ArrayList<>(ans));
            }
            return;
        }
        if(target>=arr[ind]){
            ans.add(arr[ind]);
            fun(ind,arr,ans,res,target-arr[ind]);
            ans.remove(ans.size()-1);
        }
        fun(ind+1,arr,ans,res,target);
    }
    public static void main(String[] args){
        int[] arr = {10,1,2,7,6,1,5};
        List<Integer> ans = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        fun(0,arr,ans,res,8);
        for(List<Integer> a:res){
            for(Integer b : a){
                System.out.print(b);
            }
            System.out.println(" ");
        }
    }
}