//Problem:
//From a list of employees:
//1. id > 102
//2. get only names
//3. sort alphabetically

import java.util.List;

class Employee {
    public int id;
    public String name;

    Employee(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int returnId(){
        return id;
    }

    public String returnName(){
        return name;
    }
}

class StreamsAPIExample {
    public static void main(String args[]){
        List<Employee> list=List.of(
            new Employee(101,"Vinamra"),
            new Employee(102,"Samyak"),
            new Employee(103,"Neeti"),
            new Employee(104,"Ishaan"),
            new Employee(105,"Riddhi")     
        );

        List<String> result=
        list.stream()
            .filter(e-> e.returnId()>102)
            .map(Employee::returnName)
            .sorted()
            .toList();

            System.out.println(result);
    }
}