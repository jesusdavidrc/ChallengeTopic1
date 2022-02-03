package com.tiendamusic.decorator;

import com.tiendamusic.interfaces.IReproductor;
import com.tiendamusic.models.Reproductor;

public class DuracionBatH extends ReproductorDecorator {

    public DuracionBatH(IReproductor reproductorDecorado){
        super(reproductorDecorado);

    }

    @Override
    public void comprarReproductor(Reproductor reproductor) {
        reproductorDecorado.comprarReproductor(reproductor);
        duracionHigh(reproductor);
    }

    public void duracionHigh(Reproductor reproductor){
        System.out.println("Ademas de una Bateria de 8 Horas de duracion");
    }

}
