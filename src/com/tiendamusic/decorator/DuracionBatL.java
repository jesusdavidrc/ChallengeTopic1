package com.tiendamusic.decorator;

import com.tiendamusic.interfaces.IReproductor;
import com.tiendamusic.models.Reproductor;

public class DuracionBatL extends ReproductorDecorator {

    public DuracionBatL(IReproductor reproductorDecorado){
        super(reproductorDecorado);

    }

    @Override
    public void comprarReproductor(Reproductor reproductor) {
        reproductorDecorado.comprarReproductor(reproductor);
        duracionLow(reproductor);
    }

    public void duracionLow(Reproductor reproductor){
        System.out.println("Ademas de una Bateria de 5 Horas de duracion");
    }

}
