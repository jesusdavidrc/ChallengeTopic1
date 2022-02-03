package com.tiendamusic.decorator;

import com.tiendamusic.interfaces.IReproductor;
import com.tiendamusic.models.Reproductor;

public class StorageReproductorL extends ReproductorDecorator {

    public StorageReproductorL(IReproductor reproductorDecorado){
        super(reproductorDecorado);

    }

    @Override
    public void comprarReproductor(Reproductor reproductor) {
        reproductorDecorado.comprarReproductor(reproductor);
        reproGrande(reproductor);
    }

    public void reproGrande(Reproductor reproductor){
        System.out.println("con un almacenamiento de 16GB");
    }

    public void reproPeque(Reproductor reproductor){
        System.out.println("con un almacenamiento de 8GB");
    }
}
