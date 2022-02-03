package com.hotdogcar;

import com.hotdogcar.decorator.PapitasTrituradas;
import com.hotdogcar.decorator.Pinia;
import com.hotdogcar.decorator.Salsa;
import com.hotdogcar.decorator.Tocino;
import com.hotdogcar.interf.IHotDog;
import com.hotdogcar.interf.impl.HotDogSimple;
import com.hotdogcar.models.HotDog;

public class App {
    public static void main(String[] args) {
        HotDog hotDog = new HotDog(1,"Pan","Salchicha");

        IHotDog oneHotDog = new HotDogSimple();
        IHotDog addExtra1 = new PapitasTrituradas(oneHotDog);
        IHotDog addExtra2 = new Pinia(addExtra1);
        IHotDog addExtra3 = new Salsa(addExtra2);
        IHotDog addExtra4 = new Tocino(addExtra3);

        addExtra4.comprarHotDog(hotDog);

    }
}
