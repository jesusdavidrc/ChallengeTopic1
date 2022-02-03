package com.hotdogcar.decorator;

import com.hotdogcar.interf.IHotDog;
import com.hotdogcar.models.HotDog;

public class Pinia extends HotDogDecorator {

    public Pinia(IHotDog hotDogDecorado){
        super(hotDogDecorado);

    }

    @Override
    public void comprarHotDog(HotDog hotDog) {
        super.comprarHotDog(hotDog);
        addPinia(hotDog);
    }

    public void addPinia(HotDog hotDog){
        System.out.println("Extra de Piña en trozos");
    }

}