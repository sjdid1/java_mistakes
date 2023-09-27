import java.io.FileNotFoundException;

public class home2_task_3 {
    public static void main(String[] args) {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[2] = 9; // Corrected index to 2 instead of 3
   } catch (ArithmeticException ex) { // Catch ArithmeticException instead of Throwable
       System.out.println("Division by zero error: " + ex.getMessage());
   } catch (FileNotFoundException ex) { // Add FileNotFoundException to method signature and catch block
       System.out.println("File not found error: " + ex.getMessage());
   } catch (NullPointerException ex) {
       System.out.println("Null pointer exception: " + ex.getMessage());
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Index out of bounds exception: " + ex.getMessage());
   }
}

public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}
}
