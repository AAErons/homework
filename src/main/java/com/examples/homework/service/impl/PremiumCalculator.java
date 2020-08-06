package com.examples.homework.service.impl;

import com.examples.homework.controller.api.PolicyRequest;
import com.examples.homework.controller.api.PolicyResponse;
import com.examples.homework.controller.api.PolicySubObject;
import com.examples.homework.strategies.Strategy;
import com.examples.homework.strategies.impl.FireStrategy;
import com.examples.homework.service.Calculator;
import com.examples.homework.strategies.impl.TheftStrategy;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


@Service
public class PremiumCalculator implements Calculator {

    private Map<String, Function<String, PolicySubObject>> allStrategies;

    public void Setup(){
        allStrategies = new HashMap<>();
        //allStrategies.put(STIS_CREATE_NEW_UPDATE.name(), trimProcess::process);
        //allStrategies.put(STIS_UPDATE_OTA.name(), trimProcess::processOta);
    }

    @Override
    public PolicyResponse calculate(PolicyRequest request) {

        PolicyResponse response = new PolicyResponse();

        List<PolicySubObject> policySubObjects =
                request.getPolicy().getPolicyObjects()
                        .stream()
                        .filter(i -> i.getPolicySubObjects().size() > 0)
                        .flatMap(i -> i.getPolicySubObjects().stream())
                        .collect(Collectors.toList());

        BigDecimal premium = BigDecimal.ZERO;


        Strategy strategy = new FireStrategy();
        BigDecimal premiumFire = strategy.calculateValue(policySubObjects);
        strategy = new TheftStrategy();
        BigDecimal premiumTheft = strategy.calculateValue(policySubObjects);

        response.setPremium(premiumFire.add(premiumTheft));

        return response;
    }



}
