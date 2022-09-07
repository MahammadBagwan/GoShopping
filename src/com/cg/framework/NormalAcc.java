package com.cg.framework;

public abstract class NormalAcc extends ShopAcc {
    private float deliveryCharges;

    public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges){
       super(accNo, accNm, charges);
       deliveryCharges = deliveryCharges;
    }

    @Override
    public abstract void bookProduct(float p);

    @Override
    public abstract String toString();
}

