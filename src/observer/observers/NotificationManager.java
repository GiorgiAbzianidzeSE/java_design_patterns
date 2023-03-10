package observer.observers;

import observer.observers.PaymentListener;

public class NotificationManager implements PaymentListener {

    private void sendNotification(){
        System.out.println("Notifying...");
    }

    @Override
    public void paymentMade() {
        this.sendNotification();
    }

    public String toString(){
        return "AAA";
    }
}
