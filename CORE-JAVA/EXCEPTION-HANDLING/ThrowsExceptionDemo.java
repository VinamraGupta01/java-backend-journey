/*
WAP to validate student marks using the throws keyword
Requirements:
Create a method validateMarks(int marks) that:
declares throws IllegalArgumentException
If marks is less than 0 or greater than 100, throw an IllegalArgumentException
If marks are valid, print
"Marks are valid: X"
Call validateMarks() from the main method
Handle the exception in main using try–catch
Print a meaningful error message if invalid marks are entered
Ensure the program ends gracefully
*/
import java.util.Scanner;

class ThrowsExceptionDemo {

    // Method declares throws
    static void validateMarks(int marks) throws IllegalArgumentException {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("ENTERED MARKS ARE INVALID");
        }
        System.out.println("ENTERED MARKS ARE VALID : " + marks);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            int marks = sc.nextInt();
            validateMarks(marks);
        } catch (IllegalArgumentException e) {
            System.out.println("ERROR: " + e.getMessage());
        } finally {
            System.out.println("PROGRAM EXECUTION COMPLETED");
            sc.close();
        }
    }
}
