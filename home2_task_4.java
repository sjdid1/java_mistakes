import java.util.Scanner;
public class home2_task_4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter a non-empty string: ");
            String userInput = input.nextLine();
            try {
                if (userInput.isEmpty()) {
                    throw new Exception("Blank lines cannot be entered.");
                } else {
                    System.out.println("User input: " + userInput);
                }
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
}
