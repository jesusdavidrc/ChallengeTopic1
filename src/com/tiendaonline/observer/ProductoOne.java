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
        double precioFinal = sujeto.getDolarToday() * precio;
        precioFinal = Math.round(precioFinal * 100) / 100d;
        System.out.println(nombre+" Precio $: "+ precioFinal +" Soles");
    }
}
