/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Stuart - HP AMD 10
 */
public abstract class Account {
    
    // account numbers should be treated as string data, even if all numeric
    private String accountNumber; 
    
    //  Account status (Open, Closed, Inactive, etc.)
    private String  accountStatus;
    private String  acccountType;    // (Residential, Business, Government, etc.)
    private double  currentDueBalance;
    private double  currentDueAdjustments;  
    private double  pastDueBalance;
    private double  pastDueAdjustments;
    private int     daysPastDue;

    public final String getAccountNumber() {
        return accountNumber;
    }

    public final void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public final String getAccountStatus() {
        return accountStatus;
    }

    public final void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public final String getAcccountType() {
        return acccountType;
    }

    public final void setAcccountType(String acccountType) {
        this.acccountType = acccountType;
    }

    public final double getCurrentDueBalance() {
        return currentDueBalance;
    }

    public final void setCurrentDueBalance(double currentDueBalance) {
        this.currentDueBalance = currentDueBalance;
    }

    public final double getCurrentDueAdjustments() {
        return currentDueAdjustments;
    }

    public final void setCurrentDueAdjustments(double currentDueAdjustments) {
        this.currentDueAdjustments = currentDueAdjustments;
    }

    public final double getPastDueBalance() {
        return pastDueBalance;
    }

    public final void setPastDueBalance(double pastDueBalance) {
        this.pastDueBalance = pastDueBalance;
    }

    public final double getPastDueAdjustments() {
        return pastDueAdjustments;
    }

    public final void setPastDueAdjustments(double pastDueAdjustments) {
        this.pastDueAdjustments = pastDueAdjustments;
    }

    public final int getDaysPastDue() {
        return daysPastDue;
    }

    public final void setDaysPastDue(int daysPastDue) {
        this.daysPastDue = daysPastDue;
    }
    
    public final double getTotalBalance() {
        double totalBalance = currentDueBalance
                + currentDueAdjustments
                + pastDueBalance
                + pastDueAdjustments;
        return totalBalance;
    }
    
    
    
    
    
}
