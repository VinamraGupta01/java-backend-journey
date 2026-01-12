class Employee {
    protected String jobRole;
    protected int id;

    //CONSTRUCTOR
    public Employee(String jobRole, int id) {
        this.jobRole = jobRole;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("JOB ROLE OF THE EMPLOYEE IS: " + jobRole);
        System.out.println("ID OF THE EMPLOYEE IS: " + id);
    }
}

class Developer extends Employee {
    private String programmingLanguage;

    public Developer(String jobRole, int id, String programmingLanguage) {
        super(jobRole, id); //CALLING SUPER CLASS CONSTRUCTOR
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); //CALLING SUPER CLASS METHOD
        System.out.println("PROGRAMMING LANGUAGE: " + programmingLanguage);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Developer emp = new Developer("Front End Developer", 101, "JavaScript");
        emp.displayDetails();
    }
}
