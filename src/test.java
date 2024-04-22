import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Integer[] arrayWithDup={1,5,10,2,6,8,3};

        //System.out.println(newHas);
        for (int i = 0; i < arrayWithDup.length; i++) {
            for (int j = i+1; j < arrayWithDup.length; j++) {
                if (arrayWithDup[i]>arrayWithDup[j])
                {
                    int ner = arrayWithDup[i];
                    arrayWithDup[i]=arrayWithDup[j];
                    arrayWithDup[j]=ner;
                }
            }
        }
        for (int jerk: arrayWithDup
             ) {
            System.out.println(jerk);

        }

    }
}

