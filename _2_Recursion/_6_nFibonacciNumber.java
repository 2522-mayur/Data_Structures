

public class _6_nFibonacciNumber{
    public static int helper(int n){
       if(n==1 || n==2 ){
        return 1;
       }
      int fib_n_1=helper(n-1);
      int fib_n_2=helper(n-2);
      int result=fib_n_1 + fib_n_2;
      return result;
    }
    public static void main(String[] args){
        int n=5;
        int ans=helper(n);
        System.out.println(ans);
}
}
