package com.cg.application;

import com.cg.framework.NormalAcc;

public class GSNormal extends NormalAcc {

    public GSNormal(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges, deliveryCharges);
    }

    @Override
    public void bookProduct(float p) {

    }

    @Override
    public void items(float p) {

    }

    @Override
    public String toString() {
        return "Normal Account";
    }
}
