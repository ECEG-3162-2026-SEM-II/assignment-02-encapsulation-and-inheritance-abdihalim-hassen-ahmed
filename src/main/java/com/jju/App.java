public class App {
    public static void main(String[] args) {

        // Create a Savings Account
        SavingsAccount savings = new SavingsAccount("SA001", 1000.0, 5.0);

        // Create a Checking Account
        CheckingAccount checking = new CheckingAccount("CA001", 500.0, 200.0);

        // Display initial balances
        System.out.println("Initial Balances:");
        savings.displayBalance();
        checking.displayBalance();

        // Deposit money
        savings.deposit(200);
        checking.deposit(300);

        // Withdraw money
        savings.withdraw(150);
        checking.withdraw(700); // includes overdraft

        // Add interest to savings account
        savings.addInterest();

        // Display final balances
        System.out.println("\nFinal Balances:");
        savings.displayBalance();
        checking.displayBalance();
    }
}


