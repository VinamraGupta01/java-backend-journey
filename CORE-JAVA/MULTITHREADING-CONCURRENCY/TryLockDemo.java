import java.util.concurrent.locks.ReentrantLock;

class BankAccount {
    private int balance = 1000;
    private final ReentrantLock lock = new ReentrantLock();

    public void withdraw(int amount, String threadName) {

        if (lock.tryLock()) {   // TRY to take lock
            try {
                System.out.println(threadName + " got the lock");

                if (balance >= amount) {
                    balance -= amount;
                    System.out.println(threadName + " withdrew " + amount);
                } else {
                    System.out.println(threadName + " insufficient balance");
                }

            } finally {
                lock.unlock();
                System.out.println(threadName + " released the lock");
            }
        } else {
            System.out.println(threadName + " could NOT get the lock");
        }
    }
}

class ATM extends Thread {
    private final BankAccount account;
    private final int amount;

    ATM(BankAccount account, int amount) {
        this.account = account;
        this.amount = amount;
    }

    @Override
    public void run() {
        account.withdraw(amount, Thread.currentThread().getName());
    }
}

public class TryLockDemo {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        Thread t1 = new ATM(account, 700);
        Thread t2 = new ATM(account, 700);

        t1.start();
        t2.start();
    }
}
