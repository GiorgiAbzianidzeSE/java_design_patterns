package observer.subjects;

import observer.observers.PaymentListener;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PaymentManager {

    private final List<PaymentListener> paymentListeners
            = new ArrayList<>();
    public void pay(){
        paymentListeners.forEach(PaymentListener::paymentMade);
    }

    public void registerPaymentListener(PaymentListener p){
        this.paymentListeners.add(p);
    }

    public void unRegisterPaymentListener(PaymentListener p){
        this.paymentListeners.remove(p);
    }


}


