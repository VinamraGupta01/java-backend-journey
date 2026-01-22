import java.io.IOException;

class CheckedVsUncheckedException{

    public static void main(String[] args){

        CheckedVsUncheckedException check=new CheckedVsUncheckedException();

        try{
            check.checkAge(23);
        }
        // UNCHECKED EXCEPTION
        catch (IllegalArgumentException e){
            System.out.println("ERROR! " + e.getMessage());
        }
        // CHECKED EXCEPTION
        catch (IOException e) {
            System.out.println("IO EXCEPTION: " + e.getMessage());
        }
    }

    void checkAge(int age) throws IOException{

        // UNCHECKED EXCEPTION
        if (age <= 18){
            throw new IllegalArgumentException("AGE MUST BE 18 OR ABOVE");
        }

        // CHECKED EXCEPTION
        if (age == 20){
            throw new IOException("FAILED TO SAVE FILE");
        }
        System.out.println("AGE ACCEPTED AND FILE SAVED SUCCESSFULLY");
    }
}
