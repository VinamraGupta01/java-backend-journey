import java.util.*;

class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}

public class LambdaExpressionExample {
    public static void main(String args[]){
        ArrayList<Employee> list=new ArrayList<Employee>();

        //ADDING ELEMENTS TO THE LIST
        list.add(new Employee(101,"Vinamra",70000.50));
        list.add(new Employee(102,"Leena",80000.75));
        list.add(new Employee(103,"Rohan",100000.00));
        list.add(new Employee(104,"Jasmine",70000.50));
        list.add(new Employee(105,"Ricky",75000.50));

        //PRINTING INITIAL LIST
        System.out.print("INITIAL LIST -> ");
        list.forEach(e-> System.out.println(e));

        //SORTING BY SALARY USING LAMBDA
        Collections.sort(list, (e1,e2) -> (int)(e1.salary - e2.salary));

        System.out.println("\nAFTER SORTING BY SALARY");
        list.forEach(e -> System.out.println(e));

        //FILTER SALARY > 50000
        System.out.println("\nEMPLOYEES WITH SALARY > 50000");
        list.forEach(e -> {
            if(e.salary > 50000){
                System.out.println(e);
            }
        });

        //INCREASING SALARY BY 10%
        list.forEach(e -> e.salary = e.salary + (e.salary * 0.10));

        System.out.println("\nAFTER 10% SALARY INCREMENT");
        list.forEach(e -> System.out.println(e));
    }
}
