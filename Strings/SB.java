import java.util.Arrays;

public class SB {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();

        for(int i=0;i<26;i++){
            char ch=(char)('a'+i);
            sb.append(ch);
        }

        //here we do not need to copy elements and create new objects again and again
        //we can directly add new character to sb
        // StringBuilders are mutable in nature
        System.out.println(sb.toString());
        System.out.println(sb);
    }
}
