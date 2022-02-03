package com.tiendamusicfact.interf.imple;

import com.tiendamusicfact.interf.IReproductorfact;

public class ColorAdds implements IReproductorfact {
    private String colorAzul;
    private String colorVerde;

    public ColorAdds() {
        this.colorAzul = "Color Azul";
        this.colorVerde = "Color Verde";
    }

    public String getColorAzul() {
        return colorAzul;
    }

    public void setColorAzul(String colorAzul) {
        this.colorAzul = colorAzul;
    }

    public String getColorVerde() {
        return colorVerde;
    }

    public void setColorVerde(String colorVerde) {
        this.colorVerde = colorVerde;
    }

    @Override
    public void mostrarAdds1() {
        System.out.println(getColorAzul());
    }

    @Override
    public void mostrarAdds2() {
        System.out.println(getColorVerde());
    }
}