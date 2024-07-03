public class FindUnique {
    public static void main(String[] args) {
        int[] a={2,3,3,4,2,6,4,6,7};
        int arr[] = { 12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7 };
        System.out.println(ans(a));
        System.out.println(Unique(arr));

    }
    static final int INT_SIZE = 32;

    static int ans(int[] a){

        int unique=0;

        for(int i:a){
            unique ^=i;
        }

        return unique;
    }

    static int Unique(int[] a){

        int result=0;
        int x=0,sum=0;

        for(int i=0;i< INT_SIZE;i++) {

            sum=0;
            x = (1 << i);
            for (int j = 0; j < a.length; j++) {
                if ((a[j] & x) != 0) {
                    sum++;
                }
            }

            if ((sum % 3) != 0) {
                result |= x;
            }
        }
        return result;
    }
}
