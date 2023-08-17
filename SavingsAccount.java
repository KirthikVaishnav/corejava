package bankproj;

public abstract class SavingsAccount implements Bank {
    @Override
    public void interestRate() {
        System.out.println("The interest for saving account is :6%");
    }

    @Override
    public void createBankAccount() {
        System.out.println("Savings account created");
    }

    public void savingsInterest(int sum,int time){
        int rate=6;
        int interest=(sum*time*rate)/100;
        System.out.println("The interest for the period is:"+interest);
    }
}
