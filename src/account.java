abstract class account {
    private int accountnumber;
    private String holdername;
    private double balance;

    account(int accountnumber, String holdername, double balance) {
        this.accountnumber = accountnumber;
        this.holdername = holdername;
        this.balance = balance;
    }

    public int getaccountnumber() {
        return accountnumber;
    }

    public String getholdername() {
        return holdername;
    }

    public double getbalance() {
        return balance;
    }

    public void setbalance(double balance) {
        this.balance = balance;
    }

    public void display() {
        System.out.println("Account number: " + accountnumber);
        System.out.println("Holder name: " + holdername);
        System.out.println("Balance: " + balance);
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited successfully");
        System.out.println("Your current balance is " + balance);
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Amount withdrawn successfully");
        System.out.println("Your current balance is " + balance);
    }

    public void checkbalance() {
        System.out.println("Balance: " + balance);
    }

    public void transfer(double amount, account receiver) {
        balance = balance - amount;
        receiver.balance = receiver.balance + amount;
    }

    public abstract double calculateInterest();
}