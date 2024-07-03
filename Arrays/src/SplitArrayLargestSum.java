public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int[] a={7,2,5,10,8};
        int m=2;
        System.out.println(SplitArray(a,m));
    }

    static int SplitArray(int[] arr, int m){
        int start=0;
        int end=0;

        for(int n: arr){
            start=Math.max(n,start);
            end=end+n;
        }

        while(start<end){

            int mid= start + (end - start)/2;

            int sum=0;
            int subArray=1;
            for(int n: arr){
                if(sum+n>mid){
                    sum=n;
                    subArray++;
                }
                else{
                    sum+=n;
                }
            }

            if(subArray>m){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }

        return end;
    }

}
