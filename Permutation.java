import java.util.*;
class Permutation{
    public static void fun(int[] arr, List<List<Integer>> ans, boolean[] freq,List<Integer>res){
        if(arr.length == res.size()){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]=true;
                res.add(arr[i]);
                fun(arr,ans,freq,res);
                res.remove(res.size()-1);
                freq[i]=false;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3};
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[arr.length];
        List<Integer> res = new ArrayList<>();
        fun(arr,ans,freq,res);
        for(List<Integer> a:ans){
            for(Integer b:a){
                System.out.print(b);
            }
            System.out.println("");
        }
    }
}