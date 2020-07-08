package com.examples.homework;

import com.examples.homework.controller.api.*;
import com.examples.homework.service.impl.PremiumCalculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


class HomeworkUnitTests {

    @Test
    public void calculatePremium() {
        float expectedPremium = 1f;

        PremiumCalculator calculator = new PremiumCalculator();

        PolicyRequest request = new PolicyRequest();

        Policy policy = new Policy();

        request.setPolicy(policy);

        PolicyObject policyObject = new PolicyObject();

        policy.getPolicyObjects().add(policyObject);

        PolicySubObject policySubObject = new PolicySubObject();

        policyObject.getPolicySubObjects().add(policySubObject);


        PolicyResponse response = calculator.calculate(request);


        assertEquals(expectedPremium, response.getPremium());
    }

}
