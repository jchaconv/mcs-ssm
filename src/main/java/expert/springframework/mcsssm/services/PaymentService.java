package expert.springframework.mcsssm.services;

import expert.springframework.mcsssm.domain.Payment;
import expert.springframework.mcsssm.domain.PaymentEvent;
import expert.springframework.mcsssm.domain.PaymentState;
import org.springframework.statemachine.StateMachine;

public interface PaymentService {

    Payment newPayment(Payment payment);

    StateMachine<PaymentState, PaymentEvent> preAuth(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> authorizePayment(Long paymentId);

    StateMachine<PaymentState, PaymentEvent> declineAuth(Long paymentId);

}
