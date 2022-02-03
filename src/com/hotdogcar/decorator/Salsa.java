package com.hotdogcar.decorator;

import com.hotdogcar.interf.IHotDog;
import com.hotdogcar.models.HotDog;

public class Salsa extends HotDogDecorator {

    public Salsa(IHotDog hotDogDecorado){
        super(hotDogDecorado);

    }

    @Override
    public void comprarHotDog(HotDog hotDog) {
        super.comprarHotDog(hotDog);
        addSalsa(hotDog);
    }

    public void addSalsa(HotDog hotDog){
        System.out.println("Extra de Salsas de la casa");
    }

}