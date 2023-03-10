package observer;

import observer.observers.NotificationManager;
import observer.observers.PaymentEventLogger;
import observer.observers.PaymentListener;
import observer.subjects.PaymentManager;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

        PaymentManager pm = new PaymentManager();

        NotificationManager not = new NotificationManager();
        pm.registerPaymentListener(not);
        pm.registerPaymentListener(new PaymentEventLogger());

        pm.pay();

        pm.unRegisterPaymentListener(not);
        pm.pay();
    }
}
