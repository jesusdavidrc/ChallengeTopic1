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
        System.out.println(nombre+" Precio $: "+ (sujeto.getEstado() * precio));
    }
}
