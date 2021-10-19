package Intermediate_OOPs_Assignment;
import java.util.ArrayList;
import java.util.List;

class CurrentAccount extends Question3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
        
        return totalDeposits;
    }
}
class SavingsAccount extends Question3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
        /*
         * here we only return the totalDeposit as we
         * don't need fixedDepositAmount to calculate
         * total cash in the bank
         */
        return totalDeposits;
    }
    public int getFixedDepositAmount() {
        return fixedDepositAmount;
    }
    public int getWithDrawal() {
       
        return totalDeposits - fixedDepositAmount;
    }
}
public class Question3 {
    public static Integer totalCashInBank(int cash){
        return cash;
    }
    /*
     * here are all the 'need to be overridden' getter methods in the child classes
     */
    public int getCash(){ return 0; }
    public int getFixedDepositAmount() { return 0; }
    public int getWithDrawal() { return 0; }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        Question3 currentAccount = new CurrentAccount();
        Question3 savingsAccount = new SavingsAccount();
        /*
         * adding to the list
         */
        array.add(totalCashInBank(currentAccount.getCash() + savingsAccount.getCash()));

        int total = 0;
        for(int i : array){
            total += i;
        }

        //int total = currentAccount.getCash()+ savingsAccount.getCash();

        int withDraw = currentAccount.getCash() + savingsAccount.getWithDrawal();

        System.out.println("Cash in Savings Account  : $"+savingsAccount.getCash());
        System.out.println("Cash in Current Account  : $"+currentAccount.getCash());
        System.out.println("---------------------------------------------");
        System.out.println("Total Cash in the Bank   : $"+total);
        System.out.println("---------------------------------------------");
        System.out.println("------> Savings Fixed Deposit Amount : $"+savingsAccount.getFixedDepositAmount());
        System.out.println("------> Withdrawl From Savings       : $"+savingsAccount.getWithDrawal());
        System.out.println("------> Withdrawl From Current       : $"+currentAccount.getCash());
        System.out.println("---------------------------------------------");
        /*
         * totaWithdrawlCash = totalCurrentAccountDeposit + (totalSavingsAccountDeposit - fixedDepositAmount)
         */
        System.out.println("Total Withdrawal Cash : $"+withDraw);
    }
}