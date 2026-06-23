public class Main {

    public static void main(String[] args){

        CardPayment cp = new CardPayment("07", 25000.00,"42127336836");
        cp.processPayment();
        cp.showPaymentInfo();
        cp.getCardHolderAddress();

        CardPayment cp1= new CardPayment("07", 25000.00,"42127336836");
        cp1.processPayment();

    }
}
