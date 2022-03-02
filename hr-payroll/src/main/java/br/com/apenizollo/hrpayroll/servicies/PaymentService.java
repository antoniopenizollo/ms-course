package br.com.apenizollo.hrpayroll.servicies;

import br.com.apenizollo.hrpayroll.entities.Payment;
import br.com.apenizollo.hrpayroll.entities.Worker;
import br.com.apenizollo.hrpayroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient workerFeignClient;

    public Payment getPayment(long workerId, int days) {
        Worker worker = workerFeignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}
