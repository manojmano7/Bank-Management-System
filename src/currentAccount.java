class currentAccount extends account {

    currentAccount(int accountnumber, String holdername, double balance) {
        super(accountnumber, holdername, balance);
    }

    @Override
    public double calculateInterest() {
        return 0;
    }
}