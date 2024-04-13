import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class hashset {
    public static void main(String[] args) {
        Integer[] arrOne={1,2,3,1,2};
        Integer[] arrTwo={1,2,3};
        System.out.println(checkIfContaina(arrOne,arrTwo));
    }

    private static boolean checkIfContaina(Integer[] arrOne, Integer[] arrTwo) {
        Set<Integer> eleUniqueOne=new HashSet<>(Arrays.asList(arrOne));
        Set<Integer> eleUniqueTwo=new HashSet<>(Arrays.asList(arrTwo));
        System.out.println("One "+eleUniqueOne);
        System.out.println("Two "+eleUniqueTwo);
        System.out.println("daada "+Arrays.asList(arrOne));
        for (Object el:eleUniqueOne
             ) {
            if(!eleUniqueTwo.contains(el)) return false;
        }
//        for (int newr:arrOne
//             ) {
//            if(!Arrays.asList(arrTwo).contains(newr)) return false;
//        }
        return true;
    }
}
