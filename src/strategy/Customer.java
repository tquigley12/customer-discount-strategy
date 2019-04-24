package strategy;

public abstract class Customer {

    public Customer() {
        
    }

    public abstract String getCustomerName();

    public abstract void setCustomerName(String customerName);
    
    public abstract double getBillAmount();
  
    public abstract void setBillAmount(double billAmount);

    /*
    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discountType
                + '}';
    }
    */
}
