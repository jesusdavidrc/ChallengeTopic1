package com.tiendaonline.observer;

public class ProductoOne extends Usuario{

    private String nombre = "Computadora Desktop";
    private double precio = 100;


    public ProductoOne(Subject sujeto){
        String msg = "Te has subscrito al producto "+ nombre;
        this.sujeto = sujeto;
        this.sujeto.agregar(this, msg);
    }

    @Override
    public void actualizar() {
        double precioFinal = sujeto.getDolarToday() * precio;
        precioFinal = Math.round(precioFinal * 100) / 100d;
        System.out.println(nombre+" Precio $: "+ precioFinal +" Soles");
    }
}
