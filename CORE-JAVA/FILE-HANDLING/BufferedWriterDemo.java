import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;

public class BufferedWriterDemo {
    public static void main(String args[]){

        //CREATING DIRECTORY
        File myDir=new File("runtime-files");

        //CHECKING IF DIRECTORY EXISTS OR NOT
        if(!myDir.exists()){
            myDir.mkdirs();
            System.out.println("DIRECTORY CREATED SUCCESSFULLY");
        }

        //CREATING FILE IN THE DIRECTORY
        File myFile=new File(myDir,"example.txt");

        try {
            BufferedWriter bw=new BufferedWriter(new FileWriter(myFile,true));

            bw.write("THIS IS AN EXAMPLE OF BUFFERED WRITER");
            bw.newLine();

            bw.write("CURRENTLY WORKING ON FILE HANDLING IN JAVA");
            bw.newLine();

            bw.close();

            System.out.println("CONTENT ADDED IN THE FILE SUCCESSFULLY");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("PROGRAM EXECUTION COMPLETED");
        }
    }
}