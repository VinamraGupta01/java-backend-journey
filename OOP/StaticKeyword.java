class Employee {

    // STATIC VARIABLE (shared by all employees)
    static String companyName;

    // INSTANCE VARIABLES (unique for each employee)
    int id;
    String name;

    // STATIC BLOCK (runs once when class is loaded)
    static {
        companyName = "TechNova Solutions";
        System.out.println("Static Block Executed: Company Initialized");
    }

    // CONSTRUCTOR
    Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // INSTANCE METHOD
    public void displayEmployee() {
        System.out.println("ID: " + id + ", Name: " + name + ", Company: " + companyName);
    }

    // STATIC METHOD
    public static void changeCompany(String newCompany) {
        companyName = newCompany;
        System.out.println("Company changed to: " + companyName);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Vinamra");
        Employee e2 = new Employee(102, "Rahul");

        e1.displayEmployee();
        e2.displayEmployee();

        Employee.changeCompany("Backend Labs");

        e1.displayEmployee();
        e2.displayEmployee();
    }
}
