package com.tiendaonline.observer;

public class ProductoThree extends Usuario{

    private String nombre = "Laptop HP";
    private double precio = 123;

    public ProductoThree(Subject sujeto){
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
