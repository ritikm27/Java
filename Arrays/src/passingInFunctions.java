import java.util.Arrays;

public class passingInFunctions {
    public static void main(String[] args) {
//        int[] a={1,2,3,4,5};
        String[] a={"a","b","c","d"};
        System.out.println(Arrays.toString(a));
        change(a);

        System.out.println(Arrays.toString(a));
    }
// This is what we call mutable behaviour (of objects)

    private static void change(String[] arr) {
        arr[2]="ab";
    }
}
