class GettersSetters {

    // private data (Encapsulation)
    private double balance;

    // Getter
    public double getBalance() {
        return balance;
    }

    // Setter
    public void setAmount(double amount) {
        if (amount >= 0) {
            balance = amount;
        } else {
            System.out.println("BALANCE CANNOT BE NEGATIVE");
        }
    }

    public static void main(String args[]) {
        GettersSetters obj = new GettersSetters();
        obj.setAmount(100000);
        System.out.println(obj.getBalance());
    }
}
