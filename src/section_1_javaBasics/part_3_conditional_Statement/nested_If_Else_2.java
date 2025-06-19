package section_1_javaBasics.part_3_conditional_Statement;
// Nested If else statement - to check multiple condition
public class nested_If_Else_2 {
    public static void main(String[] args) {
        // Example-1
        int age = 19;
        boolean hasLicense =true;
        // first condition
        if (age >= 18){
            // another condition
            if (hasLicense){
                System.out.println("You can drive");
            }else {
                System.out.println("You need a License to drive");
            }
        }else {
            System.out.println("You are to Young to Drive");
        }
    }
}
