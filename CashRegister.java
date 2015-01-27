/*
 * David P. Lopez
 * COP2800
 * Cash Register Application
 */

package Register;

/**
 * 305.467.5719
 * @author david.lopez016@mymdc.net
 */
public class CashRegister {
    
    private double purchase;
    private double payment;
    private double tax;
    private double taxRate;
    
    public CashRegister(double taxRate)
    {
        purchase = 0;
        payment = 0;
        tax = 0;
        this.taxRate = taxRate;        
    }
    
    public void recordPurchase(double amount)
    {
        purchase += amount;
    }
    
    public void recordTaxablePurchase(double amount)
    {        
                
        purchase += amount;
        tax += (amount * taxRate);
        
    }
    
    public void receivePayment(double amount)
    {
        payment += amount;
    }
    
    public double giveChange()
    {
        double change = payment - purchase - tax;
        purchase = 0;
        payment = 0;
        tax = 0;
        return change;
    }
    
    public double getTotalTax()
    {
        return tax;
    }
    
}
