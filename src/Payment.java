public abstract class Payment {

    public String paymentId;
    public double amount;

    public Payment(String paymentId ,double amount){
        this.paymentId   = paymentId;
        this.amount      = amount;

    }

    // common method

    public void showPaymentInfo() {
        System.out.println("Payment ID: " + paymentId + ", Amount : " + amount);

    }

    // abstract method - subclasses must implement
    public abstract void processPayment();




}
