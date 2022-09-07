package com.cg.client;

import com.cg.application.GSNormal;
import com.cg.application.GSPrimeAcc;
import com.cg.application.GSShopFactory;
import com.cg.framework.NormalAcc;
import com.cg.framework.PrimeAcc;
import com.cg.framework.ShopFactory;

public class EntryPoint {
    public static void main(String[] args) {
        // Q1
        ShopFactory shopFact = new GSShopFactory();

        // Q2
        PrimeAcc primeAcc = new GSPrimeAcc(12345, "A", 100.0f, true);

        // Q3
        NormalAcc normalAcc = new GSNormal(21345, "B", 120.0f, 100.0f);

        // Q4
        primeAcc.bookProduct(3.2f);

        // Q5
        System.out.println(primeAcc.toString());
    }
}
