package com.cg.application;

import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

    @Override
    public PrimeAcc getNewPrimeAccount(int accNo, String accNm, float charges, boolean isPrime) {
        PrimeAcc obj = new GSPrimeAcc(accNo, accNm, charges, isPrime);
        return obj;
    }

    @Override
    public NormalAcc getNewNormalAccount(int accNo, String accNm, float charges, float deliveryCharges) {
        NormalAcc obj = new GSNormal(accNo, accNm, charges, deliveryCharges);
        return obj;
    }
}
