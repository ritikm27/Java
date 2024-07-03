public class DuplicateElementsRotatedBS {
    //leetcode 81
    public static void main(String[] args) {
        int[] a={4,5,5,1,2,2,3,3,3,4,4,4};
        System.out.println(search(a,4));
    }

    static int search(int[] arr, int target){
        int pivot=FindPivotDuplicate(arr);

        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return binarySearch(arr, target, 0, pivot-1);
        }
        else {
            return binarySearch(arr, target, pivot+1, arr.length-1);
        }
    }

    static int FindPivotDuplicate(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<end){

            int mid=start + (end-start)/2;

            if(mid!=end && arr[mid]>arr[mid+1]){
                return mid;
            }
            else if(mid!=start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            // here we try to remove the duplicates as much as we can
            else if(arr[start]==arr[mid] && arr[mid]==arr[end]){

                if(arr[start]>arr[start+1]){
                    return start;
                }
                else{
                    start++;
                }
                if(arr[end]<arr[end-1]){
                    return end;
                }
                else{
                    end--;
                }
            }

            // here this the pivot lies between mid and end
            else if (arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[start]<arr[end])) {
                start=mid;
            }
            // here this the pivot lies between start and mid
            else if(arr[start]>arr[mid]){
                end=mid-1;
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
