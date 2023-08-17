package bankproj;

public class LoanUser extends LoanAccount{
    public void loan(){
        System.out.println(" ");
        System.out.println("LOAN");
    }
    @Override
    public void interestRate() {
        super.interestRate();
    }

    @Override
    public void createBankAccount() {
        super.createBankAccount();
    }

    @Override
    public void loanInterest(int sum, int time) {
        super.loanInterest(sum, time);
    }
}
