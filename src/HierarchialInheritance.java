//3. HIERARCHIAL INHERITANCE 
 
class Employee {
    protected String companyName = "FinCorp";

    public void displayCompanyName() {
        System.out.println("COMPANY NAME IS : " + companyName);
    }
}

class Developer extends Employee {
    protected String employeeRole = "Full Stack Developer";

    public void displayEmpRole() {
        displayCompanyName();   // inherited from Employee
        System.out.println("EMPLOYEE ROLE IS : " + employeeRole);
    }
}

class Manager extends Employee {
    protected String managerialGenre = "Product Manager";

    public void displayManagerGenre() {
        displayCompanyName();   // inherited from Employee
        System.out.println("MANAGER GENRE IS : " + managerialGenre);
    }
}

class HierarchialInheritance {
    public static void main(String args[]) {

        Developer dev = new Developer();
        dev.displayEmpRole();

        Manager man = new Manager();
        man.displayManagerGenre();
    }
}


