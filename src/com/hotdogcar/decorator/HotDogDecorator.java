package com.hotdogcar.decorator;

import com.hotdogcar.interf.IHotDog;
import com.hotdogcar.models.HotDog;

public abstract class HotDogDecorator implements IHotDog {
    protected IHotDog hotDogDecorado;

    public HotDogDecorator(IHotDog hotDogDecorado){
        this.hotDogDecorado = hotDogDecorado;

    }

    @Override
    public void comprarHotDog(HotDog hotDog) {
        this.hotDogDecorado.comprarHotDog(hotDog);
    }
}

