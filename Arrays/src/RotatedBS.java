public class RotatedBS {
    // leetcode Q.no.- 33
    //https://leetcode.com/problems/search-in-rotated-sorted-array/


    public static void main(String[] args) {
//        int[] a= {40,2,3,5,9,10,13,24};
//        int[] a={3,4,5,6,7,0,1,2};
        int[] a={3,4,5,6,7,8,9,10,11};
//        System.out.println(search(a,5));
        System.out.println(FindPivot(a));
    }


    static int search(int[] arr, int target){
        int pivot = FindPivot(arr);

        if(arr[pivot]==target){
            return pivot;
        }
        if(target >= arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        }

        // if(target <= arr[0]) that means the target value is smaller than
        // all the elements from index=0 to pivot
        // so therefor we will look between the range from pivot+1 to end
        else{
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }
    }

    static int FindPivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){

            int mid= start + (end-start)/2;
            // Here we will code all the possible conditions to find the pivot in an ascending order rotated array
            if( mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if( mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }

            if(arr[mid] < arr[start]){
                end=mid-1;
            }

            // if(arr[mid] > arr[end]) that means the pivot value lies between mid and end
            // so we can ignore all the elements before mid
            // or
            // if(arr[start] < arr[mid]) that means it is a continuous ascending order array
            else{
                start = mid+1;
            }


        }

        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start<=end)
        {
            int mid=start + (end-start)/2;
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
