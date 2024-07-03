public class PrimeNo {
    public static void main(String[] args) {
//        System.out.println(isPrime1(247));
//        System.out.println(isPrime2(247));

        for (int i = 0; i < 20; i++) {
            System.out.println(i + " = " + isPrime1(i));
        }
//
//        System.out.println("-----------------------------");
//
//        for (int i = 0; i < 20; i++) {
//            System.out.println(i+ " = "+ isPrime2(i));
//        }
    }

    static boolean isPrime1(int a){
        int c=2;

        if(a <=1){
            return false;
        }


        while(c*c <= a){
            if(a % c ==0){
                return false;
            }
            c++;
        }

        return true;
    }

//    static boolean isPrime2(int a){
//        if(a<=1){
//            return false;
//        }
//
//        if(a==2 || a==3 || a==5){
//            return true;
//        }
//
//        if(a%2==0){
//            return false;
//        }
//        if(a%3==0){
//            return false;
//        }
//        if(a%5==0){
//            return false;
//        }
//
//        return true;
//    }
}
