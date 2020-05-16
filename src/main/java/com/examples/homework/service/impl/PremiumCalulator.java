package com.examples.homework.service.impl;

import com.examples.homework.controller.api.PolicyRequest;
import com.examples.homework.controller.api.PolicyResponse;
import com.examples.homework.service.Calculator;
import org.springframework.stereotype.Service;

@Service
public class PremiumCalulator implements Calculator {
    @Override
    public PolicyResponse calculate(PolicyRequest request) {
        //TODO create logic to calculate policy
        return null;
    }
}
