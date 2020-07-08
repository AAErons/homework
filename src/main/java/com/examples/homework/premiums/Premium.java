package com.examples.homework.premiums;

public abstract class Premium {
    protected float defaultCoefficent;
    protected float maxCoefficent;
    protected float sumInsuredThreshold;

    public Premium(float defaultCoefficent, float maxCoefficent, float sumInsuredThreshold) {
        this.defaultCoefficent = defaultCoefficent;
        this.maxCoefficent = maxCoefficent;
        this.sumInsuredThreshold = sumInsuredThreshold;
    }

    public abstract float calculateValue(float sumInsured);


}
