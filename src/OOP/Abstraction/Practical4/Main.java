package OOP.Abstraction.Practical4;

public class Main {
    public static void main(String[] args )
    {
    BankAccount savingAccount=new SavingsAccount(10000);
    BankAccount currentAccount =new CurrentAccount(187433);
    savingAccount.withdraw(72953);
    savingAccount.deposit(432523);
    currentAccount.withdraw(52435);
    currentAccount.deposit(1000903);
    }
}
