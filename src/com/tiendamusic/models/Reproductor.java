package com.tiendamusic.models;

public class Reproductor {
    private int idReproductor;
    private String marca;

    public Reproductor(){

    }

    public Reproductor(int idReproductor, String marca) {
        this.idReproductor = idReproductor;
        this.marca = marca;
    }

    public int getIdReproductor() {
        return idReproductor;
    }

    public void setIdReproductor() {
        this.idReproductor = idReproductor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Reproductor{" +
                "ID" + idReproductor +
                ", Marca'" + marca + '\'' +
                '}';
    }
}
