import java.util.ArrayList;
import java.util.List;

public class mergeList {
    public static void main(String[] args) {
        List <String> list1= new ArrayList<>();
        List <String> list2= new ArrayList<>();
        list1.add("Hero");
        list2.add("Man");

        List <String> merged =new ArrayList<>(list1);
        merged.addAll(list2);
        System.out.println(merged);
    }
}
