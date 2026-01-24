import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;
import java.util.List;

public class FilesClassNIODemo {

    public static void main(String[] args) {

        // DIRECTORY PATH
        Path dirPath = Paths.get("runtime-files");

        // FILE PATH INSIDE DIRECTORY
        Path filePath = dirPath.resolve("example.txt");

        try {
            // CREATE DIRECTORY IF NOT EXISTS
            if (Files.notExists(dirPath)) {
                Files.createDirectories(dirPath);
                System.out.println("DIRECTORY CREATED SUCCESSFULLY");
            }

            // INITIAL CONTENT (CREATES FILE)
            List<String> initialContent = List.of(
                "CURRENTLY PURSUING JAVA NIO",
                "DOING THE TOPIC FILES CLASS"
            );

            Files.write(filePath, initialContent);
            System.out.println("INITIAL CONTENT WRITTEN");

            // APPEND CONTENT
            List<String> additionalContent = List.of(
                "ADDING SOME MORE CONTENT IN THE FILE",
                "SHOWCASING APPEND FEATURE IN JAVA NIO"
            );

            Files.write(
                filePath,
                additionalContent,
                StandardOpenOption.CREATE,
                StandardOpenOption.APPEND
            );
            System.out.println("CONTENT APPENDED");

            // READ USING readAllLines()
            System.out.println("\n---- readAllLines() ----");
            List<String> lines = Files.readAllLines(filePath);
            for (String line : lines) {
                System.out.println(line);
            }

            // READ USING readString()
            System.out.println("\n---- readString() ----");
            String content = Files.readString(filePath);
            System.out.println(content);

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("\nPROGRAM EXECUTION COMPLETED");
    }
}
