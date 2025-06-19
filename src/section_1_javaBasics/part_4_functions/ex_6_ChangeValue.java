package section_1_javaBasics.part_4_functions;

import java.util.Arrays;

public class ex_6_ChangeValue {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5};
        changeArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void changeArray(int[] nums){
        nums[0] =99; // If you make a change to the object via this reference variable , same object will be change
    }
}
/* Notes :
✅ Key Concepts:

🔹 1. Arrays are objects (reference types) in Java.
   - When passed to a method, the value of the reference (memory address) is copied.
   - Both the original and the parameter in the method point to the same array in memory.

🔹 2. Java is pass-by-value.
   - But in the case of objects, the "value" being passed is the reference to the object.
   - Hence, modifying the object inside the method reflects outside the method.

🔹 3. Arrays are mutable.
   - Their contents can be changed even if the reference variable is passed by value.

🧠 Visualization:
main()                          changeArray()
------                          -------------
arr ---> [1, 2, 3, 5]  --->     nums ---> [1, 2, 3, 5]
                              (nums[0] = 99)
Now arr ---> [99, 2, 3, 5]

🖨️ Final Output:
[99, 2, 3, 5]

-   The original array gets modified because both 'arr' and 'nums' refer to the same object in memory
 */
