public class sumOfElementsInArray {
    public static void main(String[] args) {
        int[] arrayData={1,2,3,4,5};
        int sum=0;
        for (int aar:arrayData
             ) {
            sum+=aar;
        }
        System.out.println("sum of elements in a array: "+sum);
    }
}
