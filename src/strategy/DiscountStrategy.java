package strategy;

/**
 *
 * @author tquigley1
 */
public abstract class DiscountStrategy extends Customer {

    public DiscountStrategy() {
        
    }

    @Override
    public abstract double getBillAmount();
    
    @Override
    public abstract void setBillAmount(double billAmount);
    
}
