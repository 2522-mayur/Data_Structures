import java.util.*;

public class _1_findLargest{
    public static int helper(int[] arr){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={1,4,6,9,8,4,3};
        int largest=helper(arr);
        System.out.println(largest);
}
}
