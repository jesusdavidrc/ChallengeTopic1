package com.tiendaonline.observer;

public class ProductoTwo extends Usuario{

    private String nombre = "Teclados RGB";
    private double precio = 412;

    public ProductoTwo(Subject sujeto){
        this.sujeto = sujeto;
        this.sujeto.agregar(this);
    }

    @Override
    public void actualizar() {
        System.out.println(nombre+" Precio $: "+ (sujeto.getEstado() * precio));
    }
}
