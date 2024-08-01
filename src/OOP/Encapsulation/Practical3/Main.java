package OOP.Encapsulation.Practical3;
//Write a Java program to create a class called BankAccount with private instance variables accountNumber and balance.
// Provide public getter and setter methods to access and modify these variables.
public class Main {
    public static void main(String[] args) {
        BankAccount account=new BankAccount();
        account.setAccountNumber(78532154693l);
        account.setBalance(4837218.232);

        System.out.println("Balance : "+ account.getBalance());
        System.out.println("Account Number : "+ account.getAccountNumber());
    }
}
class BankAccount{
    private long accountNumber;
    private double balance;
    public long getAccountNumber(){
        return accountNumber;
    }
    public void setAccountNumber(long accountNumber){
        this.accountNumber=accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance= balance;
    }
}