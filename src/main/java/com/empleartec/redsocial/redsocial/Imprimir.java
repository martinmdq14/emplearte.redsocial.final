package com.empleartec.redsocial.redsocial;

import java.util.Scanner;

import com.empleartec.redsocial.*;

import servicios.ServiciosUsuario;

public class Imprimir {
	
	public Imprimir(){
		
	}
	
	public void inicio(ServiciosUsuario serviceUser, Datos datos){
		
        System.out.println("BIENVENIDO!!"); //Mostrar pantalla principal
        System.out.println("Oprima 1 para loguearse"
        		+ "/n 2 para registrarse: "
        		+ "/n 3 imprimir lista usuarios");
        Scanner s = new Scanner(System.in);
        Integer opcion = s.nextInt();
        if (opcion == 1){
        	serviceUser.login(datos);
        } else if (opcion == 2){
        	serviceUser.registrar(datos);
        } else if (opcion == 3) {
        	this.imprimirListaUsuarios(datos);
        } else { System.out.println("OPCIÓN INCORRECTA");
        }
	}
	
	public void imprimirListaUsuarios(Datos datos){
		for (Usuario i : datos.getUsuarios()){
			i.toString();
			System.out.println("------------------------------------------");
		}
	}
	 
}
