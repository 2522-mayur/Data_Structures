



public class _8_checkNumberInArray{
    public static boolean isPresent(int[] arr,int x,int index){
        if(arr.length==index)return false;
        if(arr[index]==x)return true;
        return isPresent(arr, x, index+1);

    }
    public static void main(String[] args){
        int arr[]={1,2,7,4,5};
        int x=7;
        boolean ans=isPresent(arr,x,0);
        System.out.println(ans);
}
}
