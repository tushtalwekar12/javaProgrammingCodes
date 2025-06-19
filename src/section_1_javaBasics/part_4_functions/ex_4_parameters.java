package section_1_javaBasics.part_4_functions;

public class ex_4_parameters {
    public static void main(String[] args) {
        int sumTwo = addTwoNumbers(12,2); // 12 , 2 - we are passing argument
        System.out.println(sumTwo);

        System.out.println(greet("Tushar"));
    }

    // pass the value of numbers when you are calling the method in main()
    static int addTwoNumbers(int a , int b)   // a , b - these are parameters
    {
        int sumOfNumber = a + b;
        return sumOfNumber;
    }

    static String greet(String name)
    {
        String greeting = "Hello " + name;
        return greeting;
    }

}
