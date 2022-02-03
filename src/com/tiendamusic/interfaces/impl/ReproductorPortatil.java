package com.tiendamusic.interfaces.impl;

import com.tiendamusic.interfaces.IReproductor;
import com.tiendamusic.models.Reproductor;

public class ReproductorPortatil implements IReproductor {

    public ReproductorPortatil() {
        super();
    }

    @Override
    public void comprarReproductor(Reproductor reproductor) {
        System.out.println("_____________________");
        System.out.println("Reproductor de Musica Portatil");
    }

}
