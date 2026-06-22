public class CardPayment extends Payment {

    public String cardNumber;

    public CardPayment(String paymentId , double amount , String cardNumber){

        super(paymentId,amount);
        this.cardNumber = cardNumber;


    }

    public void processPayment(){
        System.out.println("Processing card payment of Rs. " + super.amount + " using card: " + this.cardNumber);

    }



}
