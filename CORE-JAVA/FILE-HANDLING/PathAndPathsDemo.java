import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.IOException;

public class PathAndPathsDemo {
    public static void main(String args[]) {

        //CREATING BASE DIRECTORY PATH
        Path myDir=Paths.get("runtime-files");

        //RESOLVING FILE TO DIRECTORY
        Path myFile=myDir.resolve("example.txt");

        try {
            //CHECKING IF DIRECTORY EXISTS OR NOT
            if(Files.notExists(myDir)){
                Files.createDirectory(myDir);
                System.out.println("CREATED DIRECTORY SUCCESSFULLY");
            }

            //CHECKING IF FILE EXISTS OR NOT
            if(Files.notExists(myFile)){
                Files.createFile(myFile);
                System.out.println("CREATED FILE SUCCESSFULLY");
            }

            //PRINTING DETAILS OF FILE
            System.out.println("----FILE DETAILS----");
            System.out.println("FILE NAME : "+myFile.getFileName());
            System.out.println("PARENT DIRECTORY : "+myFile.getParent());
            System.out.println("ABSOLUTE PATH : "+myFile.toAbsolutePath());
            System.out.println("IS ABSOLUTE : "+myFile.isAbsolute());
        }catch(IOException e){
            e.printStackTrace();
        }

        finally {
            System.out.println("PROGRAM EXECUTION COMPLETED");
        }
    }
}