import java.util.*;

class Student {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

//COMPARATOR FOR SORTING BY NAME
class NameComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.name.compareTo(s2.name);
    }
}

public class ComparatorInterfaceExample {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Aman", 78));
        list.add(new Student(2, "Riya", 92));
        list.add(new Student(3, "Karan", 85));

        Collections.sort(list, new NameComparator());

        for (Student s : list) {
            System.out.println(s.id + " " + s.name + " " + s.marks);
        }
    }
}
