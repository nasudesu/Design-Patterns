package Account;

public class Account {

    private double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public double deposit(double amount){
        return this.balance += amount;
    }

    public double withdraw(double amount){
        if (balance - amount < 0) {
            System.out.println("You dont have enough: " + balance);
            return balance;
        }
        this.balance -= amount;
        System.out.println("Balance left: " + this.balance);
        return balance;
    }
}
