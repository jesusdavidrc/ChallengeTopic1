package com.tiendamusicfact;

import com.tiendamusicfact.interf.IReproductorfact;

public class App {
    public static void main(String[] args) {
        Reproductor2 fabricar = new Reproductor2();
        System.out.println("_______________________________");
        System.out.println("Reproductor de Musica Portatil");
        System.out.println("_______________________________");


        IReproductorfact reproAdd1 = fabricar.getAdds("bat");
        reproAdd1.mostrarAdds1();
        IReproductorfact reproAdd2 = fabricar.getAdds("stor");
        reproAdd2.mostrarAdds1();
        IReproductorfact reproAdd3 = fabricar.getAdds("col");
        reproAdd3.mostrarAdds1();

    }
}
