public class floor {
    public static void main(String[] args) {
        int[] a={2,4,5,6,9,10,12,50,60,65,80};
        int target=55;
        System.out.println(getFloor(a,target));
    }


    static int getFloor(int[] arr, int target){
        int start=0;
        int end=arr.length-1;
        int mid;

        while(start<=end){
            mid=start + (end-start)/2;

            if(arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){
                end=mid-1;
            }
            else{
                return mid;
            }
        }

        return end;
    }
}
