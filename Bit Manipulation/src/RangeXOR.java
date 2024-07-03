public class RangeXOR {
    public static void main(String[] args) {
        int a=3;
        int b=9;

        int ans = xor(b) ^ xor(a-1);

        System.out.println(ans);

        //this is only to check, this can give TLE for larger numbers
        int ans2=0;
        for (int i = a; i <=b ; i++) {
            ans2 ^= i;
        }

        System.out.println(ans2);

    }

    //this will give XOR from 0 to n
    static int xor(int a){

        if(a%4==0){
            return a;
        }

        if(a%4==1){
            return 1;
        }

        if(a%4==2){
            return a+1;
        }

        return 0;
    }
}
