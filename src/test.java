import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
     //days in a month
        System.out.println("Input Month");
        Scanner getIn = new Scanner(System.in);
        int userMonth = getIn.nextInt();
        System.out.println("Input year");
        int userYear =getIn.nextInt();

        String nameMonth="";
        int numDays=0;

        switch (userMonth){
            case 1:
                nameMonth="January";
                numDays=31;
                break;
            case 2:
                nameMonth="february";
                numDays=(userYear%400==0||(userYear%4==0 && userYear%100!=0)?29:28);
                break;
            case 3:
                nameMonth="March";
                numDays=31;
                break;
            case 4:
                nameMonth="April";
                numDays=30;
                break;
            case 5:
                nameMonth="May";
                numDays=31;
                break;
            case 6:
                nameMonth="June";
                numDays=30;
                break;
            case 7:
                nameMonth="July";
                numDays=31;
                break;
            case 8:
                nameMonth="August";
                numDays=31;
                break;
            case 9:
                nameMonth="September";
                numDays=30;
                break;
            case 10:
                nameMonth="October";
                numDays=31;
                break;
            case 11:
                nameMonth="November";
                numDays=30;
                break;
            case 12:
                nameMonth="December";
                numDays=31;
                break;
            default:
                break;
        }
        System.out.println("Year: "+userYear);
        System.out.println("Month: "+nameMonth);
        System.out.println("Days: "+numDays);

    }
}

