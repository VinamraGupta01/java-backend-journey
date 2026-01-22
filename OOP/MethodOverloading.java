//METHOD OVERLOADING : IT STATES THAT MULTIPLE METHODS CAN HAVE SAME NAME BUT CAN PEFORM DIFFERENT OPERATIONS ACCORDING TO THEIR RESPECTIVE PARAMETERS
class Example {
    public int add(int n1){
        return n1;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
}
class MethodOverloading {
    public static void main(String args[]){
        Example obj=new Example();
        System.out.println(obj.add(10));
        System.out.println(obj.add(10.25,5));
        System.out.println(obj.add(10,10,10));
    }
}
