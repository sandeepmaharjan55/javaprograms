import java.util.ArrayList;

public class reverseArray {
    public static void main(String[] args) {
        int[] arrayInput={1,2,3,3,4,5,5};
        //we need to reverse it to {5,4,3,2,1}
        reverseArrayFunction(arrayInput);
    }
    public static void reverseArrayFunction(int[] hell){
        int hellLength=hell.length;
        int end = hellLength-1;
        ArrayList <Integer> newArr=new ArrayList<>();
        for (int i = end; i >=0 ; i--) {
            newArr.add(hell[i]);
        }
        System.out.println(newArr);
    }
}
