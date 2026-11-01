public class Task2_2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 1000.0);
        
        System.out.println("Начальный баланс: " + account.getBalance());
        
        account.deposit(500.0);
        System.out.println("После пополнения (+500): " + account.getBalance());
        
        account.withdraw(2000.0); 
        System.out.println("После попытки снять 2000: " + account.getBalance());
        
        account.withdraw(300.0);
        System.out.println("После снятия 300: " + account.getBalance());
    }
}

class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Ошибка: Недостаточно средств для снятия " + amount);
        }
    }

    public double getBalance() {
        return balance;
    }
}
