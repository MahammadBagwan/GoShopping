package com.cg.framework;

public abstract class ShopAcc {
    private int accNo;
    private String accNm;
    private float charges;

    public ShopAcc(int accNo, String accNm, float charges){
        accNo = accNo;
        accNm = accNm;
        charges = charges;
    }

    public abstract void bookProduct(float p);
    public abstract void items(float p);

    @Override
    public abstract String toString();
}

