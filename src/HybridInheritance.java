//4. HYBRID INHERITANCE
 
// INTERFACE 1
interface Bonus {
    double getBonus();
}

// INTERFACE 2
interface Tax {
    double getTax();
}

// BASE CLASS
class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }
}

//CHILD CLASS (HYBRID INHERITANCE)
class Developer extends Employee implements Bonus, Tax {

    public Developer(String name, double salary) {
        super(name, salary);
    }

    public double getBonus() {
        return salary * 0.10; //10% BONUS
    }

    public double getTax() {
        return salary * 0.05; //5% TAX
    }

    public void displaySalary() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + getBonus());
        System.out.println("Tax: " + getTax());
        System.out.println("Final Salary: " + (salary + getBonus() - getTax()));
    }
}

// MAIN CLASS
public class HybridInheritance {
    public static void main(String[] args) {
        Developer dev = new Developer("Vinamra", 80000);
        dev.displaySalary();
    }
}


