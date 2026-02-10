package Test;

public class Bank_Account_Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);
        System.out.println(account.getBalance());

        account.deposite(500);
        System.out.println(account.getBalance());

        account.withdraw(200);
        System.out.println(account.getBalance());
    }
}

class BankAccount{

    private double Balance;

    public double getBalance() {
        return Balance;
    }

//    public void setBalance(double balance) {
//        Balance = balance;
//    }

public BankAccount(double initialBalance){
        if (initialBalance >= 0){
            this.Balance = initialBalance;
        }
}
    void deposite(double amount){
        if (amount > 0){
            Balance += amount;
            System.out.println("Balance after deposit" + Balance);
        }

    }

    void withdraw(double amount){
        if (amount > 0 && amount <= Balance){
            Balance -= amount;
            System.out.println("Balance after withdraw" + Balance);
        }else {
            System.out.println("Balance not enough");
        }

    }
}
