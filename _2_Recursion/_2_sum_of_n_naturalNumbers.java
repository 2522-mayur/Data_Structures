


public class _2_sum_of_n_naturalNumbers{
    public static int helper(int n){
       if(n==0){
        return 0;
       }
       int smallOutput=helper(n-1);
       int answer=n+smallOutput;
       return answer;
    }
    public static void main(String[] args){
        int n=5;
        int sum=helper(n);
        System.out.println(sum);
}
}
