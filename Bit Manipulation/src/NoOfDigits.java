public class NoOfDigits {
    public static void main(String[] args) {
        int n=11;  // any Number
        int b=2;  // base of any Number Sytem

        int ans= (int)(Math.log(n) / Math.log(b)) +1;

        System.out.println(ans);


        System.out.println(Integer.toBinaryString(n).length());
        System.out.println(Integer.toOctalString(n).length());
        System.out.println(Integer.toHexString(n).length());


    }
}
