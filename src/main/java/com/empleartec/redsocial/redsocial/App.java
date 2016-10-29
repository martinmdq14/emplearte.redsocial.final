package com.empleartec.redsocial.redsocial;

import servicios.ServiciosUsuario;

public class App 
{
    public static void main( String[] args )
    {
    	Datos datos = new Datos();
        datos.setUsuarios(new Usuario("tincho", 24, "12345", "martin@gmail"));
        ServiciosUsuario serviceUser = new ServiciosUsuario();
        Imprimir imprimir = new Imprimir();
        imprimir.inicio(serviceUser, datos);
    }
}
