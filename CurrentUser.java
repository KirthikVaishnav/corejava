package bankproj;

public class CurrentUser extends CurrentAccount{
    public void current(){
        System.out.println(" ");
        System.out.println("CURRENT");
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
    public void currentInterest(int sum, int time) {
        super.currentInterest(sum, time);
    }
}
