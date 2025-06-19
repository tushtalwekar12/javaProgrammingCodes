package section_1_javaBasics.part_4_functions;

public class ex_7_Scoping {
    // 1. function Scope -A variable declared inside a method is said to have function scope.
    public static void myMethod(){
        int x =10; // x has function scope
        System.out.println(x);
    }

    // 2. Block scope
    public static void testScope() {
        int a = 5; // function scope

        if (a > 0) {
            int b = 10; // block scope
            System.out.println(a); // ✅ OK
            System.out.println(b); // ✅ OK
        }

        System.out.println(a); // ✅ OK
        // System.out.println(b); // ❌ Error: b not in scope
    }

    public static void main(String[] args) {
        myMethod();
//        System.out.println(x); //cannot find symbol

        testScope();
    }
}
