

public class _7_isArraySorted{
    public static boolean isArraySorted(int[] arr){
        if(arr.length==1)return true;
        if(arr[0]>arr[1])return false;

        int[] smallArray=new int[arr.length-1];
        for(int i=1;i<arr.length;i++){
            smallArray[i-1]=arr[i];

        }
        boolean isSmallArraySorted=isArraySorted(smallArray);
        return isSmallArraySorted;
    }
    public static void main(String[] args){
        int arr[]={1,2,7,4,5};
        boolean ans=isArraySorted(arr);
        System.out.println(ans);
}
}
