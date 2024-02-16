


// Problem statement
// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to return the answer.

// Do this recursively.



public class  _3_power {
    public static int helper(int n,int x){
    
       if(x==0)return 1;
       if(n==0)return 0;
       int smallOutput=helper(n,x-1);
       int answer=n*smallOutput;
       return answer;
    }
    public static void main(String[] args){
        int n=5,x=2;
        int power=helper(n,x);
        System.out.println(power);
}
}
