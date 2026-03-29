public class SavingsAccount extends BankAccount {

    private double interestRate;

    // Constructor
    public SavingsAccount(String accountHolder, double initialBalance, double interestRate) {
        super(accountHolder, initialBalance); // must be first
        this.interestRate = interestRate;
    }

    // Method to apply interest
    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest); // reuse existing deposit method
    }

    // Optional: getter for interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Optional: setter for interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
}

