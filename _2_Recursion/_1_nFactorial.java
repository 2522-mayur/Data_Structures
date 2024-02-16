

public class _1_nFactorial{
    public static int helper(int n){
       if(n==0){
        return 1;
       }
       int smallOutput=helper(n-1);
       int answer=n*smallOutput;
       return answer;
    }
    public static void main(String[] args){
        int n=5;
        int fact=helper(n);
        System.out.println(fact);
}
}
