package br.com.apenizollo.hrpayroll.servicies;

import br.com.apenizollo.hrpayroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }
}
