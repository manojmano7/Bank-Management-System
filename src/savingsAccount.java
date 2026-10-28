class savingsAccount extends account {

    savingsAccount(int accountnumber, String holdername, double balance) {
        super(accountnumber, holdername, balance);
    }

    @Override
    public double calculateInterest() {
        return getbalance() * 4 / 100;
    }
}