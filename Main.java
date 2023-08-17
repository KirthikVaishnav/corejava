package bankproj;

public class Main {
    public static void main(String[] args) {
          CurrentUser cu1=new CurrentUser();
          cu1.current();
          cu1.createBankAccount();
          cu1.interestRate();
          cu1.currentInterest(12000,3);

          SavingsUser su1=new SavingsUser();
         // su1.details("Kavi",21,101010101020);
          su1.savings();
          su1.createBankAccount();
          su1.interestRate();
          su1.savingsInterest(20000,5);

          LoanUser lu1=new LoanUser();
          lu1.loan();
          lu1.createBankAccount();
          lu1.interestRate();
          lu1.loanInterest(12000,3);

    }
}
