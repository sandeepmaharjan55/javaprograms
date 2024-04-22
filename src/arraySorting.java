import java.util.Arrays;

public class arraySorting {
    public static void main(String[] args) {
        Integer[] arrayList={10,2,4,5,3,9,4};
        System.out.println(Arrays.asList(SortArray(arrayList)));
    }

    private static Integer[] SortArray(Integer[] arrayData) {

//        for (int her:arrayData
//             ) {
//            System.out.println(her);
//
//        }

        for (int i = 0; i < arrayData.length; i++) {
            for (int j = i+1; j < arrayData.length; j++) {
                if (arrayData[i] > arrayData[j]){
                    int temp= arrayData[i];
                    arrayData[i]=arrayData[j];
                    arrayData[j]=temp;
                }
            }
        }
        return arrayData;
    }
}
