package com.tiendaonline.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private double dolarToday;

    public double getDolarToday(){
        return dolarToday;
    }

    public void setDolarToday(double dolarToday){
        this.dolarToday = dolarToday;
        notificarUsuarios();
    }

    public void agregar(Usuario usuario){
        usuarios.add(usuario);
    }

    public void notificarUsuarios(){
        for (Usuario usuario : usuarios){
            usuario.actualizar();
        }
    }
}
