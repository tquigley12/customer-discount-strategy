package strategy;

/**
 *
 * @author tquigley1
 */
public abstract class DiscountStrategy extends Customer {

    public DiscountStrategy() {
        
    }
    
    @Override
    public abstract String getCustomerName();

    @Override
    public abstract void setCustomerName(String customerName);
    
    @Override
    public abstract double getBillAmount();
    
    @Override
    public abstract void setBillAmount(double billAmount);
    
}
