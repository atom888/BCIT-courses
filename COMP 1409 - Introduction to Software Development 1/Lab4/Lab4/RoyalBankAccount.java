/**
 * Class for RoyalBankAccount.
 * 
 * @author Adam D. 
 * @version V1.0 May 13 2017
 */
public class RoyalBankAccount
{
    public static final String BANK_MOTTO = "You're poorer than you think";
    public static double primeInterestRate = 0.025; // make constant?
    public static final int MAX_DEPOSIT_USD
    = 10000;
    
    private double personalInterestRate;
    private double balanceUSD;
    private int PIN;
    private String firstName;
    private String lastName;
    private boolean isOverdraftAvailable;
    private double overdraftAmount;

    /**
     * Constructor for objects of class RoyalBankAccount
     * @param cPersonalInterestRate -  sets personal rate if abouve 0
     * @param cBalanceUSD - sets balance if above 0
     * @param cPIN - sets PIN if between four digits
     * @param cFirstName - sets first name if it is longer than 3 characters and less than 20
     * @param cLastName -sets last name if it is longer than 3 characters and less than 20
     */
    public RoyalBankAccount(double cPersonalInterestRate, double cBalanceUSD, int cPIN, String cFirstName, String cLastName)
    {
        if (cPersonalInterestRate > 0) {
            personalInterestRate = cPersonalInterestRate;
        }
        if (cBalanceUSD >= 0) {
            balanceUSD = cBalanceUSD;
        }
        if (cPIN > 0 && cPIN <= 9999) {
            PIN = cPIN;
        }
        if (cFirstName != null ) {
            firstName = cFirstName;
        }
        if (cLastName != null ) {
            lastName = cLastName;
        }
    }
    
    /**
    * @param getPersonalInterestRate - returns personal interest rate
    */
    public double getPersonalInterestRate() {
        return personalInterestRate;
    }
    /**
    * @param getBalanceUSD - returns balance
    */
    public double getBalanceUSD () {
        return balanceUSD;
    }
    /**
    * @param getPIN - returns PIN value
    */
    public int getPIN() {
        return PIN;
    }
    /**
    * @param getFirstName - returns first name
    */
    public String getFirstName() {
        return firstName;
    }
    /**
    * @param getLastName - returns last name
    */
    public String getLastName() {
        return lastName;
    }
    /**
    * @param getOverdraft - returns  value if isOverdraftAvaialbe
    */
    public boolean getOverdraft(){ 
        return isOverdraftAvailable;
    }
    /**
    * @param getOverdraftAmount - returns overdraft amount
    */
    public double getOverdraftAmount() {
        return overdraftAmount;
    }
    /**
    * @param getPrimeInterestRate - returns prime interest rate
    */
    public static double getPrimeInterestRate() {
        return primeInterestRate;
    }
    /**
    * @param getBankMotto - returns the bank motto
    */
    public static String getBankMotto() {
        return BANK_MOTTO;
    }
    /**
    * @param setPersonalInterestRate - sets the value of personal interest rate
    */
    public void setPersonalInterestRate(double newPersonalInterestRate) {
        personalInterestRate = newPersonalInterestRate;
    }
    /**
    * @param setBalanceUSD - sets balance amount
    */
    public void setBalanceUSD (double newBalanceUSD) {
        balanceUSD = newBalanceUSD;
    }
    /**
    * @param setPIN - sets a new PIN value
    */
    public void setPIN (int newPIN) {
        PIN = newPIN;
    }
    /**
    * @param setFirstName - sets a new first name
    */
    public void setFirstName(String newFirstName){
        firstName = newFirstName;
    }
    /**
    * @param setLastName - sets a new last name
    */
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
    /**
    * @param setOverdraft - sets a true or false value for overdraft
    */
    public void setOverdraft(boolean newOverdraft) {
        isOverdraftAvailable = newOverdraft;
    }
    /**
    * @param setOverdraftAmount - sets the overdraft amount
    */
    public void setOverdraftAmount(double newOverdraftAmount) {
        overdraftAmount = newOverdraftAmount;
    }
    /**
    * @param withdraw - allows users to withdraw the ammount suggested unless it is a negative value - 
    * if overdraft is avaialbe the user can have a balance of negative
    */
    public void withdraw(double withdrawAmount) {
        if (withdrawAmount >= 0 && withdrawAmount <= balanceUSD) {
            balanceUSD -= withdrawAmount; 
        } else if (withdrawAmount > balanceUSD && isOverdraftAvailable == true && withdrawAmount <= (overdraftAmount + balanceUSD)) {
            balanceUSD -= withdrawAmount;
        }
       
    }
    /**
    * @param deposit - allows user to deposit the amount suggested unless a negative value or over the Max deposit limit
    * 
    */
    public void deposit(double depositAmount) {
        if (depositAmount <= 0) {
            System.out.println("Sorry, you can't deposit a negative value");
        }
        if (depositAmount > MAX_DEPOSIT_USD) {
            System.out.println("The manager will be contacting you. Thank you for your deposit.");
        }
        if (depositAmount > 0 && depositAmount < MAX_DEPOSIT_USD) {
            balanceUSD += depositAmount;
        }

        
    }
   
    
}

