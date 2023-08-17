package bankproj;

public abstract class CurrentAccount implements Bank {
    @Override
    public void interestRate() {
        System.out.println("The interest rate for Current account is:7%");
    }

    @Override
    public void createBankAccount() {
        System.out.println("Current Account created");
    }
    public void currentInterest(int sum,int time){
     int rate=7;
     int interest=(sum*time*rate)/100;
        System.out.println("The interest for the period is:"+interest);
    }

}
