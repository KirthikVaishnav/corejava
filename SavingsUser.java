package bankproj;


import java.util.HashMap;

public class SavingsUser extends SavingsAccount {
   /* public void details(String n,int a,long s){
        HashMap<String, UserDet> userMap = new HashMap<>();

        UserDet user = new UserDet();
        user.name = n;
        user.age = a;
        user.acc_no=s;
    } */

    public void display_details(){

    }
    public void savings(){
        System.out.println(" ");
        System.out.println("SAVINGS");
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
    public void savingsInterest(int sum,int time) {
        super.savingsInterest(sum, time);
    }
}
