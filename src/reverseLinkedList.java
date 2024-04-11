import java.util.LinkedList;

public class reverseLinkedList {
    public static void main(String[] args) {
        LinkedList <Integer> list1=new LinkedList<>();
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        LinkedList <Integer> list2 =new LinkedList<>();
        System.out.println(list1);
        list1.descendingIterator().forEachRemaining(list2::add);
        System.out.println(list2);
    }
}
