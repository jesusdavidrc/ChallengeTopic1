package com.hotdogcar.interf.impl;

import com.hotdogcar.interf.IHotDog;
import com.hotdogcar.models.HotDog;

public class HotDogSimple implements IHotDog {

    public HotDogSimple() {
        super();
    }

    @Override
    public void comprarHotDog(HotDog hotDog) {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*");
        System.out.println("Perro Caliente Simple");
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*--*-*-*-*");

    }
}

