import java.util.Scanner;

class ATM {
    private int balance;
    private int amount;

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void deposit() {
        if (getAmount() > 0) {
            balance = balance + getAmount();
            System.out.println("Deposit successful");
            System.out.println("Balance: " + getBalance());
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public void withdraw() {
        if (getAmount() <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else if (getAmount() > getBalance()) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - getAmount();
            System.out.println("Withdrawal successful");
            System.out.println("Balance: " + getBalance());
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM();

        System.out.println("Enter initial balance:");
        atm.setBalance(sc.nextInt());

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Balance: " + atm.getBalance());
        } else if (choice == 2) {
            System.out.println("Enter deposit amount:");
            atm.setAmount(sc.nextInt());
            atm.deposit();
        } else if (choice == 3) {
            System.out.println("Enter withdrawal amount:");
            atm.setAmount(sc.nextInt());
            atm.withdraw();
        } else {
            System.out.println("Invalid choice");
        }

        sc.close();
    }
}
