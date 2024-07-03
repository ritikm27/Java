public class infiniteArrays {
    public static void main(String[] args) {
        int[] a={3,5,7,9,10,90,100,130,140,160,170};
        int target= 10;
        System.out.println(ans(a,target));

    }

    static int ans(int[] arr, int target){
        int start=0;
        int end=1;

        while(target>arr[end]){
            int temp=end+1; // This will be our new start value
            // size/range = (end-start+1)= end - (start -1)
            // we will double the range to know whether the target element is in the given range or not

            end= end + (end -start +1)*2;
            start=temp;
        }

        return binarySearch(arr, target ,start ,end);
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
