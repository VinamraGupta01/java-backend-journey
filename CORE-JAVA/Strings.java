import java.util.*;
/* 
class Strings {
    public static void main(String args[]){
        //STRING DECLARATION
        //String name="Vinamra Gupta";
         
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("NAME OF THE PERSON IS :"+name);
        

        //STRING CONCATENATION
        Scanner sc=new Scanner(System.in);
        String firstName=sc.next();
        String lastName=sc.next();
        String fullName= firstName + " " + lastName;
        System.out.println(fullName);

        //FINDING LENGTH OF STRING
        System.out.println(fullName.length());

        //ITERATING STRING
        for(int i=0;i<fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        //COMPARING TWO STRINGS
        if(firstName.compareTo(lastName)==0){
            System.out.println("STRINGS ARE EQUAL");
        }
        else{
            System.out.println("STRING AREN'T EQUAL");
        }

        //EXTRACTING PART FROM SUBSTRING
        String sentence="My name is Vinamra";
        String sen=sentence.substring(11,sentence.length());
        System.out.println(sen);
        sc.close();
    }
}
*/
/* 
class Strings {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("Vinamra");
        System.out.println(sb);

        //PRINT CHARACTER AT 0th INDEX
        System.out.println(sb.charAt(0));

        //SET/REPLACE A CHARACTER AT A SPECIFIC INDEX
        sb.setCharAt(0,'S');
        System.out.println(sb);

        //INSERTING A CHARACTER AT A SPECIFIC INDEX 
        sb.insert(0,"V");
        System.out.println(sb);

        //DELETING ELEMENT FROM A SPECIFIC INDEX
        sb.delete(1,2);
        System.out.println(sb);

        //APPENDING CHARACTERS AT THE END OF THE STRING 
        sb.append('G');
        sb.append('u');
        sb.append('p');
        sb.append('t');
        sb.append('a');
        System.out.println(sb);
    }
}
*/

//REVERSE A STRING
class Strings {
    public static void main(String args[]){
        StringBuilder sb=new StringBuilder("hello");
        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-1-i;

            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);

            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);
        }
        System.out.println(sb);
    }
}