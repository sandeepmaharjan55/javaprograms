import java.util.ArrayList;
import java.util.List;

public class onlyOddNumbers {
    public static void main(String[] args) {
        List <Integer> newlist = new ArrayList<>();
        newlist.add(2);
        newlist.add(3);
        newlist.add(4);
        newlist.add(5);
        newlist.add(6);
        newlist.add(7);

        System.out.println(newlist);
        for (int hj:newlist
             ) {
            if(hj%2==0) System.out.println(false);
        }
        System.out.println(true);
    }
}
