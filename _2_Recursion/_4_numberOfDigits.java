
// Problem statement
// You are given a number 'n'.



// Return number of digits in ‘n’.



// Example:
// Input: 'n' = 123

// Output: 3

// Explanation:
// The 3 digits in ‘123’ are 1, 2 and 3. 



public class _4_numberOfDigits{
    public static int helper(int n){
       if(n==0){
        return 0;
       }
       int smallOutput=helper(n/10);
       int answer=smallOutput+1;
       return answer;
    }
    public static void main(String[] args){
        int n=234;
        int ans=helper(n);
        System.out.println(ans);
}
}
