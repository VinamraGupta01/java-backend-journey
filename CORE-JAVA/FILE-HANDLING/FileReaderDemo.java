import java.io.FileWriter;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class FileReaderDemo {
    public static void main(String args[]) {

        // CREATING DIRECTORY
        File myDir = new File("runtime-files");

        if (!myDir.exists()) {
            myDir.mkdirs();
            System.out.println("CREATED THE DIRECTORY SUCCESSFULLY");
        }

        // CREATING FILE INSIDE DIRECTORY
        File myFile = new File(myDir, "example.txt");

        try {
            if (!myFile.exists()) {
                FileWriter fw = new FileWriter(myFile);
                fw.write("CURRENTLY PRACTICING FILE HANDLING IN JAVA\n");
                fw.write("CURRENTLY WORKING ON FILE READER");
                fw.close();
            }

            // READING FILE USING FILE READER
            FileReader fr = new FileReader(myFile);
            int ch;

            System.out.println("---- FILE CONTENT ----");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("\nPROGRAM EXECUTION COMPLETED");
        }
    }
}
