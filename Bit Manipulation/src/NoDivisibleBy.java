import java.util.ArrayList;

public class NoDivisibleBy {
    public static void main(String[] args) {
        div3(20);
    }

    // O(N) time complexity
    static void div(int n){
        for (int i = 1; i <=n ; i++) {
            if(n%i==0){
                System.out.print(i + " ");
            }
        }
    }

    // O(sqrt(N)) Time Complexity
    static void div2(int n){
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i==i){
                System.out.print(i + " ");
            }
            if(n%i==0){
                System.out.print(i + " " + n/i + " ");
            }
        }
    }

    // Time and Space Complexity is O(sqrt(N))
    static void div3(int n){
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <=Math.sqrt(n) ; i++) {
            if(n%i==i){
                System.out.print(i + " ");
            }
            if(n%i==0){
                System.out.print(i + " ");
                list.add(n/i);
            }

        }

        for (int i = list.size()-1; i >=0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
