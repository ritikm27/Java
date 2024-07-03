public class MagicNumber {
    public static void main(String[] args) {
        int n=6;
        System.out.println(mn1(n));
        System.out.println(mn2(n));

    }

    static double mn1(int n){
        int a=n;
        double ans=0;

        for(int i=0;i<Integer.toBinaryString(a).length();i++){
            int p=n&1;
            ans=ans+Math.pow(5,i+1)*p;
            n= n >> 1;
        }

        return ans;
    }

    static int mn2(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int last=n&1;
            n = n >> 1;
            ans += last * base;
            base = base * 5;
        }

        return ans;
    }
}
