package com.cg.framework;

public abstract class PrimeAcc extends ShopAcc {
    private boolean isPrime;
    private float deliveryCharges;

    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
       isPrime = isPrime;
    }

    @Override
    public abstract void bookProduct(float p);

    @Override
    public abstract String toString();
}

