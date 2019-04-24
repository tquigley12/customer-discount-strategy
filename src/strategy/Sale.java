package strategy;

/**
 *
 * @author tquigley1
 */
public class Sale extends DiscountStrategy {
    
    private String customerName;
    private double billAmount;

    public Sale(String customerName, double billAmount) {
        this.customerName = customerName;
        this.billAmount = billAmount;
    }

    @Override
    public String getCustomerName() {
        return customerName;
    }
    
    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    
    @Override
    public double getBillAmount() {
        double tempBill;
        tempBill = billAmount - (billAmount * 0.1);
        return tempBill;
    }
    
    @Override
    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

}
