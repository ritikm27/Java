public class binarySearch {
    public static void main(String[] args) {
        int[] a={2,3,4,5,6,6,7
                ,7,8,9,10,11};
        int target=7;
        System.out.println(bs(a,target));
    }

    static int bs(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;

        int mid;
//        mid=(start+end)/2;  // This can exceed the capacity of int in java as the size of array increases

        while(start<=end)
        {
            mid=start + (end-start)/2;
            if(arr[mid]<target)
            {
                start=mid+1;
            }
            else if(arr[mid]>target)
            {
                end=mid-1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
