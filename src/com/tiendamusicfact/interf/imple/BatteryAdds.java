package com.tiendamusicfact.interf.imple;

import com.tiendamusicfact.interf.IReproductorfact;

public class BatteryAdds implements IReproductorfact {
    private String highBat;
    private String lowBat;

    public BatteryAdds() {
        this.highBat = "8 Horas";
        this.lowBat = "5 Horas";
    }

    public String getHighBat() {
        return highBat;
    }

    public void setHighBat(String highBat) {
        this.highBat = highBat;
    }

    public String getLowBat() {
        return lowBat;
    }

    public void setLowBat(String lowBat) {
        this.lowBat = lowBat;
    }

    @Override
    public void mostrarAdds1() {
        System.out.println(getHighBat());
    }

    @Override
    public void mostrarAdds2() {
        System.out.println(getLowBat());
    }
}
