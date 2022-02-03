package com.tiendamusic.decorator;

import com.tiendamusic.interfaces.IReproductor;
import com.tiendamusic.models.Reproductor;

public abstract class ReproductorDecorator implements IReproductor {
    protected IReproductor reproductorDecorado;

    public ReproductorDecorator(IReproductor reproductorDecorado){
        this.reproductorDecorado = reproductorDecorado;

    }

    @Override
    public void comprarReproductor(Reproductor reproductor) {
        this.reproductorDecorado.comprarReproductor(reproductor);
    }
}
