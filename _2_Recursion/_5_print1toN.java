


public class _5_print1toN{
    public static void helper(int n){
     if(n==0)return;
     helper(n-1);
     System.out.println(n);
    }
    public static void main(String[] args){
        helper(5);
}
}
