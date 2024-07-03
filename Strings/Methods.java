import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name="Ritik More is an Engineer";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()); // it will create a new object
        System.out.println("    Ritik    More  ".strip()); // removes all white spaces from start and end of string
        System.out.println(name);
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
