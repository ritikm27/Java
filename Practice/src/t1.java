public class t1 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,4,2,1};
        System.out.println(findPivotMountainArray(arr));
    }
    static int findPivotMountainArray(int[] arr){
        int start=0;
        int end=arr.length-1;
        int mid=0;
        while(start<end){
            mid=start + (end- start)/2;
            if(arr[mid]>arr[mid+1] && arr[mid]>arr[mid-1]){
                return arr[mid];
            }
            else if(arr[mid]> arr[start]){
                start=mid+1;
            }
            else{
                end=mid;
            }
        }

        return -1;
    }
}
