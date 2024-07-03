public class FindPeakInMountainArray {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,4,2,1};
        System.out.println(peakIndexInMountainArray(a));
    }


    // Calculate the index of peak value in mountain array
    static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid= start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                // we are in descending phase of array
                // end!= mid-1; because we are not sure that there will be value greater than arr[mid] in left side of array
                // so arr[mid] can also be the possible value
                end=mid;
            }
            else{
                // we are in ascending phase of array
                // here we are sure that there exist elements which are greater than arr[mid]
                start=mid+1;
            }
        }

        return start; // as the loop will end when end==start only

        // both above check are intended to get the greatest element in the array
    }


    static int binarySearch(int[] arr, int target, int start, int end){

        while(start<=end){

            int mid= start + (end-start)/2;

            if(target<arr[mid]){
                end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }

        return -1;
    }
}
