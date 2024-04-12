import java.util.Scanner;

public class daysInMonth {
    public static void main(String[] args) {
        Scanner inputMonth= new Scanner(System.in);
        System.out.println("Input Month in number: ");
        int getInput = inputMonth.nextInt();
        System.out.println("Input Year in number: ");
        int getInputYear = inputMonth.nextInt();

        String nameOfMonth="";
        int nummberOfDays=0;
        switch (getInput) {
            case 1:
                nameOfMonth="January";
                nummberOfDays= 31;
                break;
            case 2:
                nameOfMonth="February";
                nummberOfDays= (getInputYear%400==0)||((getInputYear%4==0)&&(getInputYear%100!=0))?29:28;
                break;
            case 3:
                nameOfMonth="march";
                nummberOfDays= 31;
                break;
            case 4:
                nameOfMonth="april";
                nummberOfDays= 30;
                break;
            case 5:
                nameOfMonth="may";
                nummberOfDays= 31;
                break;
            case 6:
                nameOfMonth="june";
                nummberOfDays= 30;
                break;
            case 7:
                nameOfMonth="july";
                nummberOfDays= 31;
                break;
            case 8:
                nameOfMonth="august";
                nummberOfDays= 31;
                break;
            case 9:
                nameOfMonth="september";
                nummberOfDays= 30;
                break;
            case 10:
                nameOfMonth="october";
                nummberOfDays= 31;
                break;
            case 11:
                nameOfMonth="november";
                nummberOfDays= 30;
                break;
            case 12:
                nameOfMonth="december";
                nummberOfDays= 31;
                break;
            default:
                break;
            }
        System.out.println("Name of Month is: "+nameOfMonth);
        System.out.println("Year is: "+getInputYear);
        System.out.println("Number of days: "+nummberOfDays);
    }
}
