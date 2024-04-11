import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner inputValue = new Scanner(System.in);
        System.out.println("Enter the input integer value: ");
       // System.out.println("haha "+armstringfunctioncall(inputValue.nextInt()));
        int inputData=inputValue.nextInt();
        if (armstringfunctioncall(inputData)) System.out.println(inputData +" is a armstrong number");
        else System.out.println(inputData +" is not a armstrong number");

    }
    private static boolean armstringfunctioncall(int next) {
       // System.out.println(next);
        int countNoInt=0;
        int af=next;
        int[] hamro = new int[5];
        //int[] gar;
        while(next!=0){
            int v =next % 10;
            next=next/10;
            countNoInt++;
            hamro[countNoInt]=v;
           // System.out.println("v value "+v+"   next value "+next);
        }
        int newArmValue=0;
        for (int ger:hamro
             ) {
            newArmValue += Math.pow(ger,countNoInt);
        }
        //System.out.println(newArmValue+" "+ next);
        if (newArmValue==af) return true;
        else return false;
    }
}
