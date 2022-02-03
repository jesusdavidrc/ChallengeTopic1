package com.tiendamusic.decorator;

import com.tiendamusic.interfaces.IReproductor;
import com.tiendamusic.models.Reproductor;

public class StorageReproductorS extends ReproductorDecorator {

    public StorageReproductorS(IReproductor reproductorDecorado){
        super(reproductorDecorado);

    }

    @Override
    public void comprarReproductor(Reproductor reproductor) {
        reproductorDecorado.comprarReproductor(reproductor);
        reproPeque(reproductor);
    }

    public void reproPeque(Reproductor reproductor){
        System.out.println("con un almacenamiento de 8GB");
    }
}
