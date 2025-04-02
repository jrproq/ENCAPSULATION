public class BankAccount {
    private long accountNumber;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setAccountNumber(123456789);
        account.setBalance(5000.75);
        System.out.println("Bank Account: Number = " + account.getAccountNumber() + ", Balance = PHP " + account.getBalance());
    }
}
