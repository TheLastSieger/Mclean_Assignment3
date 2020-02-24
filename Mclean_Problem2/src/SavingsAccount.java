/* create variable to store the annual interest rate
 * create a variable to store the balance in each users account
 * create 2 user account to store values "2000" and "3000"
 * create method to calculate monthly interest rate by multiplying the users balance by first the annual interest rate of 4%
 * create a new method to store 2nd years new interest rate representing a 5% interest rate
 * display each savers 12 month interest rate with a 4% interest rate
 * display each savers 12 month interest rate with 5% interest
 */
public class SavingsAccount {
    
	static private double annualInterestRate;
    
	private double savingBalance;

    public SavingsAccount()
    {

    }

    public SavingsAccount(double savingBalance)
    {
            this.savingBalance=savingBalance;
    }
    
    public double getSavingBalance()
    {
            return this.savingBalance;
    }
  
    public static void modifyInterestRate(double newInterestRate)
    {
            annualInterestRate=newInterestRate;
    }

    public void calculateMonthlyInterest()
    {
            double monthlyI;
            monthlyI= (double)(this.savingBalance*annualInterestRate/12);
            this.savingBalance+=monthlyI;
    }


public static void main(String[] args) {

            SavingsAccount saver1, saver2;
            saver1 = new SavingsAccount (2000.0);
            saver2= new SavingsAccount (3000.0);
      
            
            SavingsAccount.modifyInterestRate (0.04);
           
            System.out.println("The monthly balance for first saver is: \n");
            
            for(int i=0; i<12; i++) {
            
            saver1.calculateMonthlyInterest();            
           
            System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver1.getSavingBalance()));
           }
           
           System.out.println("\nThe monthly balance for the second saver is\n");
           
           for(int i=0; i<12; i++) {
        	 saver2.calculateMonthlyInterest();
        	 System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver2.getSavingBalance()));
           }

           SavingsAccount.modifyInterestRate(0.05);
           
           System.out.println("\nThe new monthly balance for saver 1 after the intrest increase is: \n");
            
           for(int i=0; i<12; i++) {
        	   saver1.calculateMonthlyInterest();            
        	   System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver1.getSavingBalance()));
           }
           
           System.out.println("\nThe new monthly balance for saver 2 after the intrest increase is: \n");
           
           for(int i=0; i<12; i++) {
           saver2.calculateMonthlyInterest();
           System.out.println("Month " + (i+1)+" : "+ String.format("%.2f",saver2.getSavingBalance()));
           }

}
}

