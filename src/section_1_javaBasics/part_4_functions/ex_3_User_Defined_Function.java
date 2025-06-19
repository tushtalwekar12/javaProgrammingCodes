package section_1_javaBasics.part_4_functions;
import java.util.Scanner;
// User defined function
/*
syntax :
         return Type functionName()
          {
             // body
             return statement ;
          }
 */

public class ex_3_User_Defined_Function {
    public static void main(String[] args) {
        sum(); // calling sum()
        greeting(); // call
        System.out.println(greet());
    }

    // sum() - add two numbers with void return type
    static void sum()
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number 1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the number 2 : ");
        int num2 = sc.nextInt();
        int sum = num1 +num2;
        System.out.println("The sum is : "+sum);
    }

    // greeting() -
    static void greeting()
    {
        System.out.println("Hello World!");
    }

    // greet() - A method that returns an String
    static String greet()
    {
        String greet ="how are you";
        return greet;
    }
}
