package src;

public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(12345, "Sam Sam");

        account.deposit(1000.0);
        account.withdraw(500.0);
        account.deposit(200.0);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Current Balance: $" + account.getBalance());

        account.printTransactionHistory();
    }
    
}
