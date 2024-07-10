package com.boa.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boa.entity.Payment;
import com.boa.repo.PaymentRepository;

@RestController
@RequestMapping("/payment")
public class PaymentController {
    private final PaymentRepository paymentRepository;

    @Autowired
    public PaymentController(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @GetMapping  
    public List<Payment> getAllPaymentts() {
        return paymentRepository.findAll();
    }

    @PostMapping
    public Payment addPayment(@RequestBody Payment payment) {
        return paymentRepository.save(payment);
    }

}
