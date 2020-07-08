package com.examples.homework.controller.api;

import com.examples.homework.enums.RiskType;


public class PolicySubObject {
    String subObjectName;
    float sumInsured;
    RiskType risks;

    public String getSubObjectName() {
        return subObjectName;
    }

    public void setSubObjectName(String subObjectName) {
        this.subObjectName = subObjectName;
    }

    public float getSumInsured() {
        return sumInsured;
    }

    public void setSumInsured(float sumInsured) {
        this.sumInsured = sumInsured;
    }

    public RiskType getRisks() {
        return risks;
    }

    public void setRisks(RiskType risks) {
        this.risks = risks;
    }
}
