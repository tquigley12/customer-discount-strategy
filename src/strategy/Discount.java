package strategy;

/**
 *
 * @author tquigley1
 */
public class Discount extends DiscountStrategy {

    private double billAmount;
    
    public Discount(String customerName, double billAmount) {
        super.setCustomerName(customerName);
        this.setBillAmount(billAmount);
    }
    
    @Override
    public double getBillAmount() {
        double tempBill;
        tempBill = billAmount - (billAmount * 0.5);
        return tempBill;
    }
    
    @Override
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    
}
