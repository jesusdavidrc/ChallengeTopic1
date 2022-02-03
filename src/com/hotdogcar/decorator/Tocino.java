package com.hotdogcar.decorator;

import com.hotdogcar.interf.IHotDog;
import com.hotdogcar.models.HotDog;

public class Tocino extends HotDogDecorator {

    public Tocino(IHotDog hotDogDecorado){
        super(hotDogDecorado);

    }

    @Override
    public void comprarHotDog(HotDog hotDog) {
        super.comprarHotDog(hotDog);
        addTocino(hotDog);
    }

    public void addTocino(HotDog hotDog){
        System.out.println("Extra de tocino");
    }

}