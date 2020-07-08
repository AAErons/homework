package com.examples.homework.service.impl;

import com.examples.homework.controller.api.PolicyRequest;
import com.examples.homework.controller.api.PolicyResponse;
import com.examples.homework.controller.api.PolicySubObject;
import com.examples.homework.premiums.Premium;
import com.examples.homework.premiums.impl.FirePremium;
import com.examples.homework.service.Calculator;
import org.springframework.stereotype.Service;



@Service
public class PremiumCalculator implements Calculator {
    @Override
    public PolicyResponse calculate(PolicyRequest request) {
        PolicyResponse response = new PolicyResponse();

        //FIRE1 + FIRE2 + .... + FIREN = SUM
        //FirePremium firePremium = new FirePremium();
        //float firePremiumSum = firePremium.calculateValue(SUM);

        //TheftPremium firePremium = new FirePremium();
        //float theftPremiumSum = firePremium.calculateValue(SUM);

        //caclulate premium for each risktype that exist

        //response.setPremium(firePremiumSum + theftPremiumSum);

        return response;
    }



}
