package com.tiendamusicfact.interf.imple;

import com.tiendamusicfact.interf.IReproductorfact;

public class StorageAdds implements IReproductorfact {
    private String highStorage;
    private String lowStorage;

    public StorageAdds() {
        this.highStorage = "16 GB Almacenaniento";
        this.lowStorage = "8 GB Almacenamiento";
    }

    public String getHighStorage() {
        return highStorage;
    }

    public void setHighStorage(String highStorage) {
        this.highStorage = highStorage;
    }

    public String getLowStorage() {
        return lowStorage;
    }

    public void setLowStorage(String lowStorage) {
        this.lowStorage = lowStorage;
    }

    @Override
    public void mostrarAdds1() {
        System.out.println(getHighStorage());
    }

    @Override
    public void mostrarAdds2() {
        System.out.println(getLowStorage());
    }
}