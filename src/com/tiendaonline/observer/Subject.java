package com.tiendaonline.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Usuario> usuarios = new ArrayList<Usuario>();
    private int estado;

    public int getEstado(){
        return estado;
    }

    public void setEstado(int estado){
        this.estado = estado;
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
