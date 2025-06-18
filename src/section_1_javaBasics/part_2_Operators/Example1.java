package section_1_javaBasics.part_2_Operators;
// Operator
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        //1. Airthmetic Operator - Used for basic mathematical operations. (+,-,*,/,%)
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        int b =sc.nextInt();
        System.out.println("Sum of a + b : "+ (a+b));
        System.out.println("Sub of a - b : "+ (a-b));
        System.out.println("Mul of a * b : "+ (a*b));
        System.out.println("Div of a / b : "+ (a/b));
        System.out.println("Mod of a % b : "+ (a % b));


        //2. Assignment Operator -Used to assign values to variable. (=,+=,-=,*=,/=)\
        int c = 10;
         c += 2;
        System.out.println(c);

    }
}
