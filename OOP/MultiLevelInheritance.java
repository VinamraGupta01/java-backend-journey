//2.MULTILEVEL INHERTITANCE

class Employee {
    protected String name;
    protected double salary;

    public void setEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

class Developer extends Employee {
    protected String programmingLanguage;

    public void setLanguage(String language) {
        this.programmingLanguage = language;
    }
}

class Inheritance extends Developer {
    protected double bonus = 20000;

    public void displayEmployee() {
        double totalSalary = salary + bonus;   

        System.out.println("NAME OF THE EMPLOYEE : " + name);
        System.out.println("SALARY OF THE EMPLOYEE : " + salary);
        System.out.println("BONUS OF THE EMPLOYEE : " + bonus);
        System.out.println("TOTAL SALARY OF THE EMPLOYEE : " + totalSalary);
    }

    public static void main(String args[]) {
        Inheritance user = new Inheritance();
        user.setEmployee("Vinamra", 85000);
        user.displayEmployee();
    }
}


