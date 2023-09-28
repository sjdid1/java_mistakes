import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class home3_task_1 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter data in random order separated by space: ");
            String input = scanner.nextLine();
            String[] data = input.split(" ");

            if (data.length != 6) {
                System.out.println("Error: Invalid number of inputs.");
                return;
            }

            String lastName = "";
            String firstName = "";
            String middleName = "";
            String dateOfBirth = "";
            String phoneNumber = "";
            char gender = '\0';

            for (String datum : data) {
                try {
                    if (datum.matches("[0-9]+")) {
                        phoneNumber = datum;
                    } else if (datum.matches("[f,m]")) {
                        gender = datum.charAt(0);
                    } else if (datum.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                        dateOfBirth = datum;
                    } else if (datum.matches("[A-Z][a-z]*")) {
                        if (lastName.equals("")) {
                            lastName = datum;
                        } else if (firstName.equals("")) {
                            firstName = datum;
                        } else {
                            middleName = datum;
                        }
                    } else {
                        throw new Exception("Invalid input format.");
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    return;
                }
            }

            try {
                FileWriter writer = new FileWriter(lastName + ".txt", true);
                writer.write(lastName + firstName + middleName + dateOfBirth + " " + phoneNumber + gender + "\n");
                writer.close();
                System.out.println("Data saved successfully.");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
