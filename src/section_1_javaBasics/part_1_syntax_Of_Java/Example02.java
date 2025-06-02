package section_1_javaBasics.part_1_syntax_Of_Java;
// datatypes and variable
public class Example02 {
    public static void main(String[] args) {
        // 1. whole / integral Numbers -byte<short<int<long
        byte age =25; // 1 byte
        short year = 2025; //2 byte
        int salary =50000;  // 4 bytes
        long population = 80000000000L;   // 8 bytes needs 'L'

        // 2. decimal Numbers -float, double
        float pi = 3.145f; // 4 bytes needs 'f'
        double gpa =9.81;  // 8 bytes

        // 3. character -char
        char grade = 'A'; // 2 bytes , always in ' '
        char unicodeChar = 97;

        // 4. booleans -bool
        boolean isPassed = true; // 1 bit

        // Output all variables
        System.out.println("----- Whole Numbers -----");
        System.out.println("Byte (age): " + age);
        System.out.println("Short (year): " + year);
        System.out.println("Int (salary): " + salary);
        System.out.println("Long (population): " + population);

        System.out.println("\n----- Decimal Numbers -----");
        System.out.println("Float (pi): " + pi);
        System.out.println("Double (GPA): " + gpa);

        System.out.println("\n----- Character -----");
        System.out.println("Char (grade): " + grade);
        System.out.println("Char (Unicode snowman): " + unicodeChar);

        System.out.println("\n----- Boolean -----");
        System.out.println("Boolean (isPassed): " + isPassed);
    }
}
