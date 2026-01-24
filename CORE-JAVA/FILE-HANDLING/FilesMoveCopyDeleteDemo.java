import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
import java.util.List;

public class FilesMoveCopyDeleteDemo {
    public static void main(String args[]){

        //GETTING PATH 
        Path myPath=Paths.get("runtime-files");

        //GETTING FILES
        Path originalFile=myPath.resolve("original.txt");
        Path copiedFile=myPath.resolve("copied.txt");
        Path moveFile=myPath.resolve("move.txt");

        try {
            //CHECKING IF DIRECTORY IS CREATED OR NOT
            if(Files.notExists(myPath)){
                Files.createDirectories(myPath);
                System.out.println("CREATED DIRECTORY SUCCESSFULLY");
            }

            //CREATING ORIGINAL FILE 
            if(Files.notExists(originalFile)){
                Files.write(originalFile,
                    List.of(
                        "ADDING CONTENTS INTO THE FILE",
                        "ADDING CONTENTS INTO THE ORIGINAL FILE"
                    )
                );
                System.out.println("ORIGINAL FILE CREATED");
            }

            //COPYING FILE ORIGINAL->COPIED
            Files.copy(originalFile,copiedFile,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("COPIED THE CONTENTS OF ORIGINAL FILE TO COPIED FILE SUCCESSFULLY");

            //MOVING FILE ORIGINAL->MOVE
            Files.move(originalFile,moveFile,StandardCopyOption.REPLACE_EXISTING);
            System.out.println("MOVED ORIGINAL FILE TO THE MOVED FILE");

            //DELETING ORIGINAL FILE
            Files.deleteIfExists(copiedFile);
            System.out.println("DELETED THE COPIED FILE SUCCESSFULLY");
        }catch(IOException e){
            e.printStackTrace();
        }
        
        finally {
            System.out.println("PROGRAM EXECUTION COMPLETED");
        }
    }
}