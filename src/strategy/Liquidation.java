package strategy;

/**
 *
 * @author tquigley1
 */
public class Liquidation extends DiscountStrategy {

    private double billAmount;
    
    public Liquidation(String customerName, double billAmount) {
        super.setCustomerName(customerName);
        this.setBillAmount(billAmount);
    }
    
    @Override
    public double getBillAmount() {
        double tempBill;
        tempBill = billAmount - (billAmount * 0.75);
        return tempBill;
    }
    
    @Override
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    
}
