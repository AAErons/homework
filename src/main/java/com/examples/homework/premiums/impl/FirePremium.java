package com.examples.homework.premiums.impl;


import com.examples.homework.premiums.Premium;

public class FirePremium extends Premium {
    private static final float DEFAULT_COEFFICENT = 0.014f;
    private static final float MAX_COEFFICENT = 0.024f;
    private static final float SUM_INSURED_THRESHOLD = 100f;

    public FirePremium() {
        super(DEFAULT_COEFFICENT, MAX_COEFFICENT, SUM_INSURED_THRESHOLD);
    }

    @Override
    public float calculateValue(float sumInsured) {
        if(sumInsured > SUM_INSURED_THRESHOLD){
            return sumInsured * MAX_COEFFICENT;
        }else {
            return sumInsured * DEFAULT_COEFFICENT;
        }
    }
}
