package com.empleartec.redsocial.redsocial;

import java.util.ArrayList;
import java.util.List;


public class Usuario  implements Comparable<Usuario>{
	
	//	ATRIBUTOS
	
	private String pw;
	private String nombre;
	private int edad;
	private String email;
	private Muro muroUsuario;
	private List<Usuario> seguidores = new ArrayList<Usuario>();
	private List<Usuario> amigos = new ArrayList<Usuario>();
	private List<String> solicitudes = new ArrayList<String>();

	//	CONSTRUCTOR	
	
	public Usuario(String nombre,int edad,String pw,String email){
		this.nombre = nombre;
		this.edad = edad;
		this.pw = pw;
		this.email = email;
		this.muroUsuario = new Muro();
	}
	
	//	GETTERS Y SETTERS
	
	public String getEmail() {
		return email;
	}
	
	public List<Usuario> getSeguidores() {
		return seguidores;
	}
	
	public void setSeguidores(Usuario seguidor,boolean agregar) {
		if (agregar){
			this.seguidores.add(seguidor);
		} else {
			this.seguidores.remove(seguidor);
		}
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public Muro getMuroUsuario() {
		return muroUsuario;
	}
	
	public void setMuroUsuario(Muro muroUsuario) {

	}
	
	public List<Usuario> getAmigos() {
		return amigos;
	}
	
	public void setAmigos(Usuario amigo, boolean agregar) {     //agregar es true si de agrega un elemento. False si elimina elemento. 
		if (agregar) {									
			amigos.add(amigo);
		} else {
			amigos.remove(amigo);
		}
		
	}
	
	public List<String> getSolicitudes() {
		return solicitudes;
	}

	public void setSolicitudes(List<String> solicitudes) {
		this.solicitudes = solicitudes;
	}
	
	@Override 
	public int compareTo(Usuario o){
		if (this.nombre.compareTo(o.getNombre()) == 0){     //compara nombre
			return this.pw.compareTo(o.getEmail());			//compara email
		}
	}
}
