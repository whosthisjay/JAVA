package OOP.Abstraction.Practical4;
//	Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
//	Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and implement the respective methods to handle deposits and withdrawals for each account type.
public abstract class BankAccount {

    public abstract void deposit(float depositAmount);
    public abstract void withdraw(float withdrawAmount);
}

class SavingsAccount extends BankAccount{
    private float balance;
    SavingsAccount(float balance){
        this.balance=balance;
    }
    public void deposit(float depositAmount){
        balance=balance+depositAmount;
        System.out.println("Balance : "+balance);

    }
    public void withdraw(float withdrawAmount){
        balance=balance-withdrawAmount;
        System.out.println("Balance : "+balance);
    }
}

class CurrentAccount extends BankAccount{
    private float balance;
    CurrentAccount(float balance){
        this.balance=balance;

    }
    public void deposit(float depositAmount){
        balance=balance+depositAmount;
        System.out.println("Balance : "+balance);

    }
    public void withdraw(float withdrawAmount){
        balance=balance-withdrawAmount;
        System.out.println("Balance : "+balance);

    }
}