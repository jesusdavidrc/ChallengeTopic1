package com.tiendamusic.decorator;

import com.tiendamusic.interfaces.IReproductor;
import com.tiendamusic.models.Reproductor;

public class ColorReproductorA extends ReproductorDecorator {

    public ColorReproductorA(IReproductor reproductorDecorado){
        super(reproductorDecorado);

    }

    @Override
    public void comprarReproductor(Reproductor reproductor) {
        reproductorDecorado.comprarReproductor(reproductor);
        reproAzul(reproductor);
    }

    public void reproAzul(Reproductor reproductor){
        System.out.println("de Color Azul");
    }

}
