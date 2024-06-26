
import java.util.Scanner;

public class pyramidStructure {
        private static void printPattern1(int rows) {
            // for loop for the rows
            for (int i = 1; i <= rows; i++) {
                // white spaces in the front of the numbers
                int numberOfWhiteSpaces = rows - i;
                //System.out.println(numberOfWhiteSpaces);
                //print leading white spaces
                printString(" ", numberOfWhiteSpaces);

                //print numbers
                printString(i + " ", i);

                //move to next line
                System.out.println("");
            }
        }

        //utility function to print string given times
        private static void printString(String s, int times) {
            for (int j = 0; j < times; j++) {
                System.out.print(s);
            }
        }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the rows to print:");
            int rows = scanner.nextInt();
            scanner.close();

            System.out.println("Printing Pattern 1\n");
            printPattern1(rows);

        }



}
