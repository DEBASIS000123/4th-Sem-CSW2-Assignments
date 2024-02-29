package Q7;
abstract class Account {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
    public void setbalance(double balance) {
    	this.balance=balance;
    }
    public abstract void deposit(double amount);

    public abstract void withdraw(double amount);
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public void deposit(double amount) {
        double interest = amount * interestRate / 100;
        double prevbal=super.getBalance();
        super.setbalance(prevbal+amount + interest);
    }

    @Override
    public void withdraw(double amount) {
    	double bal= super.getBalance();
        if (amount <=bal) {
            super.setbalance(bal-amount);
            
            System.out.println("Success.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }
    }
}

class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(int accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public double getOverdraftLimit() {
        return overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        double bal= super.getBalance();
        super.setbalance(bal+amount);
    }

    @Override
    public void withdraw(double amount) {
    	double bal= super.getBalance();
        if (bal- amount >= overdraftLimit) {
             super.setbalance(bal-amount);
        } else {
            System.out.println("Withdrawal amount exceeds overdraft limit.");
        }
    }
}

public class BankingApplication {
    public static void main(String[] args) {
       
        SavingsAccount savingsAccount = new SavingsAccount(12345, 1000, 5);
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + savingsAccount.getAccountNumber());
        System.out.println("Balance: " + savingsAccount.getBalance());
        savingsAccount.deposit(500);
        System.out.println("Balance after deposit: " + savingsAccount.getBalance());
        savingsAccount.withdraw(400);
        System.out.println("Balance after withdrawal: " + savingsAccount.getBalance());
        
        
        CurrentAccount currentAccount = new CurrentAccount(54321, 2000, 1000);
        System.out.println("\nCurrent Account Details:");
        System.out.println("Account Number: " + currentAccount.getAccountNumber());
        System.out.println("Balance: " + currentAccount.getBalance());
        currentAccount.deposit(500);
        System.out.println("Balance after deposit: " + currentAccount.getBalance());
        currentAccount.withdraw(2600);
        System.out.println("Balance after withdrawal: " + currentAccount.getBalance());
    }
}
