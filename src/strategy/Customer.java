package strategy;

public abstract class Customer {

    private String customerName;

    public Customer() {

    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public abstract double getBillAmount();

    public abstract void setBillAmount(double billAmount);

}