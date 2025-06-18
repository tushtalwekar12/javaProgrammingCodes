package section_1_javaBasics.part_1_syntax_Of_Java;
// Input form the users
import java.util.Scanner;

public class Example04 {
    public static void main(String[] args) {
        // Add two number and print Sum
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 =input.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = input.nextInt();

        int sum =num1 + num2;
        System.out.println("The Sum is : "+ sum);
    }
}
