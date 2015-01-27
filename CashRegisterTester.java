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
public class CashRegisterTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CashRegister register1 = new CashRegister(.10);
        
        register1.recordPurchase(29.50);
        register1.recordTaxablePurchase(9.250);
        register1.recordPurchase(4.00);
        register1.recordTaxablePurchase(12.15);
        
        System.out.println(register1.getTotalTax());
        
        register1.receivePayment(58.00);
        
        System.out.println(register1.giveChange());
 
    }
   
}
