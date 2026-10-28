class bank {
    private account[] account;
    private int count;

    bank(int size) {
        account = new account[size];
        count = 0;
    }

    public void createSavingsAccount(
            int accountnumber, String holdername, double balance)
            throws InvalidAmountException {

        for (int i = 0; i < count; i++) {
            if (account[i].getaccountnumber() == accountnumber) {
                System.out.println("Account number already exists");
                return;
            }
        }

        if (balance <= 0) {
            throw new InvalidAmountException(
                    "Initial balance must be greater than 0");
        }

        savingsAccount sc =
                new savingsAccount(accountnumber, holdername, balance);

        account[count] = sc;
        count++;

        System.out.println("Savings account created successfully");
    }

    public void createCurrentAccount(
            int accountnumber, String holdername, double balance)
            throws InvalidAmountException {

        for (int i = 0; i < count; i++) {
            if (account[i].getaccountnumber() == accountnumber) {
                System.out.println("Account number already exists");
                return;
            }
        }

        if (balance <= 0) {
            throw new InvalidAmountException(
                    "Initial balance must be greater than 0");
        }

        currentAccount ca =
                new currentAccount(accountnumber, holdername, balance);

        account[count] = ca;
        count++;

        System.out.println("Current account created successfully");
    }

    public void displayAccount(int accountnumber)
            throws AccountNotFoundException {

        account a = findAccount(accountnumber);
        a.display();
    }

    public void depositeAmount(int accountnumber, double amount)
            throws InvalidAmountException, AccountNotFoundException {

        account a = findAccount(accountnumber);

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Deposit amount must be greater than zero");
        }

        a.deposit(amount);
    }

    public void withdrawAccount(int accountnumber, double amount)
            throws InvalidAmountException,
            InsufficientBalanceException,
            AccountNotFoundException {

        account a = findAccount(accountnumber);

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Withdraw amount must be greater than 0");
        }

        if (amount > a.getbalance()) {
            throw new InsufficientBalanceException(
                    "Insufficient balance. Available balance is "
                            + a.getbalance());
        }

        a.withdraw(amount);
    }

    public void checkBalanceAccount(int accountnumber)
            throws AccountNotFoundException {

        account a = findAccount(accountnumber);
        a.checkbalance();
    }

    public void transferAccount(int from, int to, double amount)
            throws AccountNotFoundException,
            InvalidAmountException,
            InsufficientBalanceException {

        account sender;
        account receiver;

        try {
            sender = findAccount(from);
        } catch (AccountNotFoundException e) {
            throw new AccountNotFoundException("Sender account not found");
        }

        try {
            receiver = findAccount(to);
        } catch (AccountNotFoundException e) {
            throw new AccountNotFoundException("Receiver account not found");
        }

        if (amount <= 0) {
            throw new InvalidAmountException(
                    "Transfer amount must be greater than 0");
        }

        if (amount > sender.getbalance()) {
            throw new InsufficientBalanceException(
                    "Sender has insufficient balance");
        }

        sender.transfer(amount, receiver);

        System.out.println("Transfer successful");
        System.out.println("Sender balance: " + sender.getbalance());
        System.out.println("Receiver balance: " + receiver.getbalance());
    }

    public void calculateInterest(int accountnumber)
            throws AccountNotFoundException {

        account a = findAccount(accountnumber);
        double interest = a.calculateInterest();

        System.out.println(
                "Interest for balance " + a.getbalance()
                        + " is " + interest);
    }

    public account findAccount(int accountnumber)
            throws AccountNotFoundException {

        for (int i = 0; i < count; i++) {
            if (account[i].getaccountnumber() == accountnumber) {
                return account[i];
            }
        }

        throw new AccountNotFoundException(
                "Account number " + accountnumber + " not found");
    }
}