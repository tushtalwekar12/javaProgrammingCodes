package section_1_javaBasics.part_4_functions;
// Method with return type
public class ex_2_Return_Function {
    public static void main(String[] args) {
        // Call the function and store the returned value in ans
        int ans = sumOfTwoNo();
        System.out.println(ans);
    }
    // return the value - A method that returns an integer value.
    static int sumOfTwoNo()
    {
        int a =12;
        int b =1;
        // Return the sum of a and b
        return a + b;  // end of function
//        System.out.println("hii");  - unreachable code
    }
}
