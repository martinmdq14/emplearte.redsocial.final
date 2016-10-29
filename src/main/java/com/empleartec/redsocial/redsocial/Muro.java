package com.empleartec.redsocial.redsocial;

import java.util.List;
import java.util.ArrayList;

public class Muro {
	
	//	ATRIBUTOS
	
	private List<Publicacion> publicaciones = new ArrayList<Publicacion>();
	
	//	CONTRUCTOR
	
	public Muro(){
		
	}
	
	//	GETTERS Y SETTERS
	
	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(Publicacion publicacion) {
		  this.publicaciones.add(publicacion);	  
	}
	
}
