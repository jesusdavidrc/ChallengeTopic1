package com.tiendaonline;

import com.tiendaonline.observer.ProductoOne;
import com.tiendaonline.observer.ProductoThree;
import com.tiendaonline.observer.ProductoTwo;
import com.tiendaonline.observer.Subject;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new ProductoOne(subject);
        new ProductoTwo(subject);
        new ProductoThree(subject);

        System.out.println("Los precios actuales son:");
        subject.setDolarToday(4.1);
        System.out.println("--------------------------------");
        System.out.println("Los precios de ahora son:");
        subject.setDolarToday(3.30);
    }
}
