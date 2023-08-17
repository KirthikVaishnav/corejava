package bankproj;

public class LoanAccount implements Bank{

    @Override
    public void interestRate() {
        System.out.println("The interest for saving account is :7%");
    }

    @Override
    public void createBankAccount() {
        System.out.println("Loan Account is created");
    }

    public void loanInterest(int sum,int time){
        int rate=6;
        int interest=(sum*time*rate)/100;
        System.out.println("The interest for the period is:"+interest);
    }
}
