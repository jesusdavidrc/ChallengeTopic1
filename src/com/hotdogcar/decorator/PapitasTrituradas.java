package com.hotdogcar.decorator;

import com.hotdogcar.interf.IHotDog;
import com.hotdogcar.models.HotDog;

public class PapitasTrituradas extends HotDogDecorator {

    public PapitasTrituradas(IHotDog hotDogDecorado){
        super(hotDogDecorado);

    }

    @Override
    public void comprarHotDog(HotDog hotDog) {
        super.comprarHotDog(hotDog);
        addPapas(hotDog);
    }

    public void addPapas(HotDog hotDog){
        System.out.println("Extra de Papas trituradas");
    }

}