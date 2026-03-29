public class CheckingAccount extends BankAccount {

    private static final double TRANSACTION_FEE = 1.50;

    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        double totalAmount = amount + TRANSACTION_FEE;

        // Check if balance can cover both withdrawal and fee
        if (getBalance() >= totalAmount) {
            // Reuse parent class logic
            super.withdraw(totalAmount);
        } else {
               System.out.println("Insufficient funds for withdrawal and transaction fee.");
        }
    }
}
