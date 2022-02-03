package com.tiendamusic;

import com.tiendamusic.decorator.*;
import com.tiendamusic.interfaces.IReproductor;
import com.tiendamusic.interfaces.impl.ReproductorPortatil;
import com.tiendamusic.models.Reproductor;

public class App {
    public static void main(String[] args) {

        Reproductor reproductor = new Reproductor(1, "Apple");

        IReproductor rPortatil = new ReproductorPortatil();
        IReproductor capPortatil = new StorageReproductorS(rPortatil);
        IReproductor colPortatil = new ColorReproductorA(capPortatil);
        IReproductor batPortatil = new DuracionBatH(colPortatil);

        batPortatil.comprarReproductor(reproductor);


        Reproductor reproductor2 = new Reproductor(2, "Samsung");

        IReproductor rPortatil2 = new ReproductorPortatil();
        IReproductor capPortatil2 = new StorageReproductorL(rPortatil2);
        IReproductor colPortatil2 = new ColorReproductorV(capPortatil2);
        IReproductor batPortatil2 = new DuracionBatL(colPortatil2);

        batPortatil2.comprarReproductor(reproductor2);


    }
}
