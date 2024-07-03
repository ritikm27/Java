import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();

        System.out.println(list.size());
        list.add(5);
        list.add(4);
        list.add(2);
        list.add(3);
        list.add(1);

        System.out.println(list.size());
        System.out.println(list);

        list.add(1,10);
        System.out.println(list);

        System.out.println(list.get(1));
        System.out.println(list.contains(5));

        System.out.println(list.remove(1));
        System.out.println(list);
    }
}
