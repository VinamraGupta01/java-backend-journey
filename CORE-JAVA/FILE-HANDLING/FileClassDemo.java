/*
Write a Java program that:
Creates a runtime-files/logs directory if it doesn’t exist
Creates a file named app.log inside it
Prints important file information
Lists all files inside the directory
Handles exceptions properly
*/
import java.io.File;
import java.io.IOException;

public class FileClassDemo {
    public static void main(String args[]){
        
        File logDir=new File("RUNTIME-FILES/logs");

        //CHECKING IF THE DIRECTORY EXISTS OR NOT
        if(!logDir.exists()){
            logDir.mkdirs();
            System.out.println("DIRECTORY CREATED SUCCESSFULLY");
        }

        //CREATING A FILE
        File logFile=new File(logDir,"app.log");

        //CHECKING IF THE FILE EXISTS IN THE DIIRECTORY OR NOT
        try{
            if(logFile.createNewFile()){
                System.out.println("LOG FILE CREATED SUCCESSFULLY");
            }
            else{
                System.out.println("LOG FILE ALREADY EXISTS");
            }
            
            //PRINTING DETAILS OF THE FILE
            System.out.println("----FILE DETAILS----");
            System.out.println("FILE NAME : "+logFile.getName());
            System.out.println("FILE'S PATH : "+logFile.getPath());
            System.out.println("FILE CAN BE READ : "+logFile.canRead());
            System.out.println("FILE CAN BE WRITTEN : "+logFile.canWrite());
            System.out.println("FILE SIZE : "+logFile.length()+"BYTES");

            //LISTING ALL FILES IN THE LOGS DIRECTORY
            System.out.println("----FILES IN THE LOG DIRECTORY----");
            File[] files=logDir.listFiles();
            if(files!=null){
                for(File file : files){
                    System.out.println("-"+file.getName());
                }
            }
        }catch(IOException e){
                System.out.println(e.getMessage());
            }
        finally{
            System.out.println("PROGRAM EXECUTION COMPLETED");
        }
    }
}