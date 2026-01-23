import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;

public class TryWithResourcesDemo {
    public static void main(String args[]) {

        // CREATING DIRECTORY
        File myDir = new File("runtime-files");

        // CHECKING IF DIRECTORY EXISTS OR NOT
        if (!myDir.exists()) {
            myDir.mkdirs();
            System.out.println("CREATED DIRECTORY SUCCESSFULLY");
        }

        // CREATING A FILE INSIDE SAME DIRECTORY
        File myFile = new File(myDir, "example.txt");

        // TRY-WITH-RESOURCES
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(myFile))) {

            bw.write("CURRENTLY WORKING ON FILE HANDLING IN JAVA");
            bw.newLine();
            bw.write("CURRENTLY DOING THE TOPIC TRY WITH RESOURCES");

            System.out.println("DATA WRITTEN SUCCESSFULLY");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("PROGRAM EXECUTION COMPLETED");
    }
}
