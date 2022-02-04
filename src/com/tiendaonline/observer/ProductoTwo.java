package com.tiendaonline.observer;

public class ProductoTwo extends Usuario{

    private String nombre = "Teclados RGB";
    private double precio = 412;

    public ProductoTwo(Subject sujeto){
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
