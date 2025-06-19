package section_1_javaBasics.part_3_conditional_Statement;
//switch statement executes one statement from multiple conditions.
public class switch_Statement_3 {
    public static void main(String[] args) {
        int day = 1;
        switch (day){
            case 1 :
                System.out.println("Sunday");
                break;
            case 2 :
                System.out.println("Monday");
                break;
            case 3 :
                System.out.println("Tuesday");
                break;
            case 4 :
                System.out.println("Wednesday");
                break;
            case 5 :
                System.out.println("Thusday");
                break;
            case 6 :
                System.out.println("Friday");
                break;
            case 7 :
                System.out.println("Saterday");
                break;
        }
    }
}
