package Day9;

abstract class Bank {
    abstract double getBalance();
}

class BankA extends Bank {
    double balance;

    public BankA(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class BankB extends Bank {
    double balance;

    public BankB(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

class BankC extends Bank {
    double balance;

    public BankC(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankA firstBank = new BankA(100);
        BankB secondBank = new BankB(150);
        BankC thirdBank = new BankC(200);

        System.out.println("Bank A's balance is: " + firstBank.getBalance());
        System.out.println("Bank B's balance is: " + secondBank.getBalance());
        System.out.println("Bank C's balance is: " + thirdBank.getBalance());

    }
}
