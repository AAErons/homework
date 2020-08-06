package com.examples.homework.controller.api;

import java.math.BigDecimal;

public class PolicyResponse {
    BigDecimal premium;

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }
}
