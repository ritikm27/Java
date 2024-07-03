public class RootOfAnyNumber {
    public static void main(String[] args) {
        System.out.println(sqrt(2,3));
    }

    static double sqrt(double n,int b){
        double x=n;
        double root;
        while(true){
            root= (0.5)*(x + (n/Math.pow(x,b-1)));

            if(Math.abs(root-x) < 0.1){
                break;
            }

            x=root;
        }

        return root;
    }
}
