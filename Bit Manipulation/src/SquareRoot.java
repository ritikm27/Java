public class SquareRoot {
    public static void main(String[] args) {
        System.out.printf("%.5f",sqroot(47,5));
//        System.out.println(Math.sqrt(47));
    }

    static double sqroot(int n, int p){

        int[] arr=new int[n+1];
        int start=0;
        int end=n;
        int mid=0;

        double root=0.0;

        while(start<=end){

            mid=start+ (end-start)/2;

            if(mid*mid==n){
                return mid;
            }
            else if(mid*mid<n){
                start=mid+1;
                root=mid;
            }
            else{
                end=mid-1;
            }

        }

        double incr=0.1;
        for (int i = 0; i < p; i++) {
            while(root*root<=n){
                root +=incr;
            }
            root -=incr;
            incr /=10;
        }

        return root;
    }
}
