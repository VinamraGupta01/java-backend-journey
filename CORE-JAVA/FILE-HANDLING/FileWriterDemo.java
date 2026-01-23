import java.io.IOException;
import java.io.Writer;
import java.io.File;
import java.io.FileWriter;

public class FileWriterDemo {
    public static void main(String args[]){

        //CREATING A FILE
        File myFile=new File("RUNTIME-FILES/myFile.txt");

        //CHECKING IF THE DIRECTORY EXISTS OR NOT
        if(!myFile.exists()){
            myFile.mkdirs();
            System.out.println("CREATED DIRECTORY SUCCESSFULLY");
        }

        try{
            FileWriter fw=new FileWriter(myFile,true);

            //WRITING INTO FILE
            fw.write("LEARNING FILE HANDLING IN JAVA STEP BY STEP");
            fw.write("CURRENTLY LEARNING FILE WRITER");

            fw.close();

            System.out.println("WRITTEN CONTENT INTO THE FILE");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("PROGRAM EXECUTION COMPLETED");
        }
    }
}