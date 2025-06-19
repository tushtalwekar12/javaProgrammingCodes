package section_1_javaBasics.part_4_functions;
/*
✅ Key Concepts:

🔹 1. Pass-by-value in Java
- Java is always pass-by-value (even for objects).
- When you pass a variable to a method, a **copy of the value** is passed.
- If it's a primitive type, the actual value is copied.
- If it's an object (like String), the reference (memory address) is copied, but not the actual object.

🔹 2. Strings are immutable
- Strings in Java are immutable, meaning you can't change their value after creation.
- Reassigning a new value to a String reference doesn't affect the original String.

📊 Visualization:

main()                          changeName()
------                          -------------
name ---> "kunal"     --->      naam ---> "kunal"
                             (then naam ---> "rahul")

But the original 'name' in main() still points to "kunal".
*/

public class ex_5_Passing_The_Value {
    public static void main(String[] args) {
        String name = "kunal";
        changeName(name);     // passing "kunal"  - A copy of the reference to "kunal" is passed as naam.
        System.out.println(name);
    }
    static void changeName(String naam)
    {
        naam ="rahul"; // we are creating new object
    }
}
/*
📝 Note:
- For primitive data types (int, float, boolean, etc.), Java passes the actual value (pass-by-value).
- For objects (String, Arrays, custom classes), Java passes the **value of the reference**, so you can modify the object,
  but not reassign it in a way that affects the original reference outside the method.

To truly modify a value inside a method, use a mutable object like StringBuilder.
*/