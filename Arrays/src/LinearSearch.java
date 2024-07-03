import java.util.Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        String str="Ritik More";
        System.out.println(str.charAt(2));
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str);

        char[] ch=str.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println(str);
    }
}
