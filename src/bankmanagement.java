import java.util.Scanner;

class bankmanagement {

    public static void main(String[] args) {

        bank bank = new bank(10);

        System.out.println("BANK MANAGEMENT SYSTEM");
        System.out.println("---------------------");

        System.out.println("1. Create savings account");
        System.out.println("2. Create current account");
        System.out.println("3. Display account");
        System.out.println("4. Deposit");
        System.out.println("5. Withdraw");
        System.out.println("6. Transfer money");
        System.out.println("7. Check balance");
        System.out.println("8. Calculate interest");
        System.out.println("9. Exit");

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Enter your choice");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: {
                    System.out.println("Enter account number");
                    int anum = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Enter holder name");
                    String hname = sc.nextLine();

                    System.out.println("Enter initial balance");
                    double bal = sc.nextDouble();

                    try {
                        bank.createSavingsAccount(anum, hname, bal);
                    } catch (InvalidAmountException e) {
                        System.out.println(e);
                    }

                    break;
                }

                case 2: {
                    System.out.println("Enter account number");
                    int anum = sc.nextInt();

                    sc.nextLine();

                    System.out.println("Enter holder name");
                    String hname = sc.nextLine();

                    System.out.println("Enter initial balance");
                    double bal = sc.nextDouble();

                    try {
                        bank.createCurrentAccount(anum, hname, bal);
                    } catch (InvalidAmountException e) {
                        System.out.println(e);
                    }

                    break;
                }

                case 3: {
                    System.out.println("Enter account number");
                    int anum = sc.nextInt();

                    try {
                        bank.displayAccount(anum);
                    } catch (AccountNotFoundException e) {
                        System.out.println(e);
                    }

                    break;
                }

                case 4: {
                    System.out.println("Enter account number");
                    int anum = sc.nextInt();

                    System.out.println("Enter amount");
                    double amt = sc.nextDouble();

                    try {
                        bank.depositeAmount(anum, amt);
                    } catch (InvalidAmountException e) {
                        System.out.println(e);
                    } catch (AccountNotFoundException e) {
                        System.out.println(e);
                    }

                    break;
                }

                case 5: {
                    System.out.println("Enter account number");
                    int anum = sc.nextInt();

                    System.out.println("Enter amount");
                    double amt = sc.nextDouble();

                    try {
                        bank.withdrawAccount(anum, amt);
                    } catch (InvalidAmountException e) {
                        System.out.println(e);
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e);
                    } catch (AccountNotFoundException e) {
                        System.out.println(e);
                    } finally {
                        System.out.println("Bank operation completed");
                    }

                    break;
                }

                case 6: {
                    System.out.println("Enter sender account number");
                    int from = sc.nextInt();

                    System.out.println("Enter receiver account number");
                    int to = sc.nextInt();

                    System.out.println("Enter amount");
                    double amt = sc.nextDouble();

                    try {
                        bank.transferAccount(from, to, amt);
                    } catch (AccountNotFoundException e) {
                        System.out.println(e);
                    } catch (InvalidAmountException e) {
                        System.out.println(e);
                    } catch (InsufficientBalanceException e) {
                        System.out.println(e);
                    }

                    break;
                }

                case 7: {
                    System.out.println("Enter account number");
                    int anum = sc.nextInt();

                    try {
                        bank.checkBalanceAccount(anum);
                    } catch (AccountNotFoundException e) {
                        System.out.println(e);
                    }

                    break;
                }

                case 8: {
                    System.out.println("Enter account number");
                    int anum = sc.nextInt();

                    try {
                        bank.calculateInterest(anum);
                    } catch (AccountNotFoundException e) {
                        System.out.println(e);
                    }

                    break;
                }

                case 9: {
                    System.out.println("Thank you");
                    sc.close();
                    return;
                }

                default: {
                    System.out.println("Invalid choice");
                }
            }
        }
    }
}