class RecursionBasic{
    public static void name(int count){
        if(count == 5){
            return;
        }
        System.out.println("lavanya");
        name(count+1);
    }
    public static void number(int num,int n){
        if(num > n){
            return;
        }
        System.out.println(num);
        number(num+1,n);
    }
    public static void backtrackNumber(int num){
        if(num<1){
            return;
        }
        backtrackNumber(num-1);
        System.out.println(num);
    }
    public static void numberGreater(int num, int n){
        if(num < n){
            return;
        }
        System.out.println(num);
        numberGreater(num-1,n);
    }
    public static void reversal(int start,int end,int[] nums){
        if(start == end){
            return;
        }
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        reversal(start+1,end-1,nums);

    }
     public static boolean palindrome(int start,int end,int[] nums){
        if(nums[start] != nums[end]){
            return false;
        } else if(start>end){
            return true;
        }       
        return palindrome(start+1,end-1,nums);

    }
    public static void main(String args[]){
        backtrackNumber(10);
        int[] nums = {1,8,9,2,1};
        System.out.println(palindrome(0,nums.length-1,nums));
        
    }
}