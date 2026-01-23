import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;

class BufferedReaderDemo {
    public static void main(String[] args) {

        // CREATING DIRECTORY
        File myDir = new File("runtime-files");

        // CHECKING IF DIRECTORY EXISTS OR NOT
        if (!myDir.exists()) {
            myDir.mkdirs();
            System.out.println("CREATED DIRECTORY SUCCESSFULLY");
        }

        // CREATING FILE INSIDE DIRECTORY
        File myFile = new File(myDir, "example.txt");

        try {
            // CREATE FILE WITH CONTENT IF NOT EXISTS
            if (!myFile.exists()) {
                FileWriter fw = new FileWriter(myFile);
                fw.write("WORKING ON FILE HANDLING IN JAVA\n");
                fw.write("CURRENTLY PRACTICING BUFFERED READER TOPIC");
                fw.close();
            }

            // READING CONTENTS OF FILE USING BUFFERED READER
            BufferedReader br = new BufferedReader(new FileReader(myFile));

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("PROGRAM EXECUTION COMPLETED");
        }
    }
}
