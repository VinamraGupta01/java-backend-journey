import java.util.*;

class Student {
    int id;
    String name;

    Student(int id,String name){
        this.id=id;
        this.name=name;
    }

    public boolean equals(Object obj){
        Student s=(Student) obj;
        return this.id==s.id && this.name.equals(s.name);
    }

    public int hashCode(){
        return id;
    }
}

public class EqualsHashCodeExample {
    public static void main(String args[]){
        Student s1=new Student(1,"Vinamra");
        Student s2=new Student(2,"Riddhi");
        Student s3=new Student(3,"Vinamra");

        HashSet<Student> set=new HashSet<Student>();

        //ADDING ELEMENTS TO HASH SET
        set.add(s1);
        set.add(s2);
        set.add(s3);

        System.out.println("FINAL HASH SET -> "+set);
        System.out.println("SIZE OF HASH SET = "+set.size());
    }
}