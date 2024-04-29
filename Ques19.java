class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}


class SavingAccount {
    private int accountNumber;
    private double balance;


    public SavingAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }


    public void depositAmount(double amount) {
        balance += amount;
  System.out.println("Amount " + amount + " deposited successfully. New balance: " + balance);
    }


    public void withdrawAmount(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException(
                    "Insufficient funds. Unable to withdraw " + amount + ". Balance: " + balance);
        } else {
            balance -= amount;
            System.out.println("Amount " + amount + " withdrawn successfully. New balance: " + balance);
        }
    }


    public double getBalance() {
        return balance;
    }
}


public class Ques19 {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount(123456, 1000.0);


        try {
            account.depositAmount(500.0);
            account.withdrawAmount(200.0);
            account.withdrawAmount(1500.0); // This will throw InsufficientFundsException
        } catch (InsufficientFundsException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
