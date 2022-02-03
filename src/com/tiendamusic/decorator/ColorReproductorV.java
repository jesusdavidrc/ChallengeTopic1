package com.tiendamusic.decorator;

import com.tiendamusic.interfaces.IReproductor;
import com.tiendamusic.models.Reproductor;

public class ColorReproductorV extends ReproductorDecorator {

    public ColorReproductorV(IReproductor reproductorDecorado){
        super(reproductorDecorado);

    }

    @Override
    public void comprarReproductor(Reproductor reproductor) {
        reproductorDecorado.comprarReproductor(reproductor);
        reproVerde(reproductor);
    }

    public void reproVerde(Reproductor reproductor){
        System.out.println("de Color Verde");
    }
}
