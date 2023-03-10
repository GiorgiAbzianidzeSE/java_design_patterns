package observer.observers;

import observer.observers.PaymentListener;

public class PaymentEventLogger implements PaymentListener {
    private void logEvent(){
        System.out.println("logging...");
    }

    @Override
    public void paymentMade() {
        this.logEvent();
    }
}
