import java.util.Scanner;

class Basics {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.next();     //READS ONE WORD ONLY
        sc.nextLine();                //CONSUMES NEXT LEFTOVER LINES
        String name2 = sc.nextLine(); //READ WHOLE LINE

        System.out.println("MY NAME IS " + name1);
        System.out.println("MY NAME IS " + name2);
        
        int a=sc.nextInt(); //READS INT VALUES
        int b=sc.nextInt(); //READS INT VALUES
        int sum=a+b;
        System.out.println("SUM OF A AND B IS :" +sum);

        sc.close(); //CLOSING SCANNER CLASS
    }
}
