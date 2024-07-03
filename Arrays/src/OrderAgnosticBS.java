public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] a={10,9,8,7,6,5,4,3,2,1};
//        int[] a={2,3,4,5,6,6,7,7,8,9,10,11};
//        int[] a={50,40,36,28,25,20,15,12,10,7,5,2,1};
        int target=14;
        System.out.println(oaBS(a,target));
    }

    static int oaBS(int[] arr,int target){
        boolean b=arr[0]<arr[arr.length-1];
        int start=0;
        int end=arr.length-1;
        int mid;
        if(b)
        {
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
            return -1;

        }

        else{
            while(start<=end){

                mid=start + (end-start)/2;
                if(arr[mid]<target){
                    end=mid-1;
                }
                else if(arr[mid]>target){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }

            return -1;
        }
    }
}
