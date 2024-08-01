package Exception.Practical4;
class BankException extends Exception{
    BankException(String message){
        super(message);
    }
}

public class Bank {
    private float currentBalance;
    private float withdrawAmount;
    private float depositAmount;

    public void setDepositAmount(float depositAmount) throws BankException {
        if(depositAmount<0){
            throw new BankException("Amount is Negative ");
        }
        this.depositAmount = depositAmount;
        currentBalance=currentBalance+depositAmount;
    }

    public float getDepositAmount() {
        return depositAmount;
    }

    public float getWithdrawAmount() {
        return withdrawAmount;
    }

    public void setWithdrawAmount(float withdrawAmount) throws BankException {
        if(currentBalance<withdrawAmount){
            throw new BankException("You have Insufficient Balance");
        }else if(withdrawAmount<0){
            throw new BankException("Amount is Negative ");
        }
        this.withdrawAmount = withdrawAmount;
        currentBalance=currentBalance-withdrawAmount;
    }

    public void getCurrentBalance() {
        System.out.println("Current Balance : "+currentBalance);
    }

    public void setCurrentBalance(float currentBalance) {
        this.currentBalance = currentBalance;
    }
}
