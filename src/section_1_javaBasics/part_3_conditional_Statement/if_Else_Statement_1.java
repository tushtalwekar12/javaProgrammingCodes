package section_1_javaBasics.part_3_conditional_Statement;
/*
 if else statement
 - you to execute certain blocks of code based on specified conditions.
 - The if-else statement evaluates a boolean expression.
 - If the expression evaluates to true, the code block following the if statement is executed.
  - If it evaluates to false, the code block following the else statement is executed.

  - Ternary Operator - shorthand for if_else
  - syntax - variable = condition ? expressionTrue : expressionFalse;
 */
public class if_Else_Statement_1 {
    public static void main(String[] args) {
        // Example 1
        int myAge = 22;
        if (myAge > 18){
            System.out.println("You can Vote");
        }else {
            System.out.println("You Can't Vote");
        }

        // Example-2 - else_if
        int score = 89;
        if (score >= 90){
            System.out.println("Grade-A");
        } else if (score >=80) {
            System.out.println("Grade-B");
        } else if (score >= 60) {
            System.out.println("Grade-C");
        }else {
            System.out.println("Grade-F");
        }

        // Example-3 Alternative of if else - Ternary Operator
        int jee_Score = 80;
        String check_result = (jee_Score >= 90) ? "You are Passed, elligible to admission" : "You are Failed, better Luck Next time!";
        System.out.println(check_result);

        // Example-4
        int marks =38;
        String  result =(marks > 35)?"Passed":"Failed";
        System.out.println(result);
    }
}
