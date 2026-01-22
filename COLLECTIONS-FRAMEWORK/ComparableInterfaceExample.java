import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    // Natural ordering by marks
    public int compareTo(Student s) {
        return this.marks - s.marks; //ASCENDING
    }
}

public class ComparableInterfaceExample {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Aman", 78));
        list.add(new Student(2, "Riya", 92));
        list.add(new Student(3, "Karan", 85));

        Collections.sort(list);

        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.marks);
        }
    }
}
