import java.util.Scanner;
class Basics {
    public static void main(String args[]){
        //USER INPUT
        Scanner sc=new Scanner(System.in);
        //next() ONLY GIVES SINGLE TOKEN AS OUTPUT (FOR STRINGS)
        String name1=sc.next();
        //nextLine() GIVES WHOLE INPUT AS OUTPUT (FOR STRINGS)
        String name2=sc.nextLine();
        System.out.println("MY NAME IS " +name1);
        System.out.println("MY NAME IS " +name2);
        //nextInt() GIVE WHOE INPUT AS OUTPUT (FOR INT TYPE VALUES)
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=a+b;
        System.out.println("SUM FOOF A AND B IS " +sum);
    }
}