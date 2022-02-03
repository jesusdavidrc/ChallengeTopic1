package com.tiendaonline.observer;

public class ProductoOne extends Usuario{

    private String nombre = "Computadora Desktop";
    private double precio = 100;

    public ProductoOne(Subject sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println(nombre+" Precio $: "+ (sujeto.getEstado() * precio));
    }
}
