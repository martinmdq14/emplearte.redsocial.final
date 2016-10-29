package com.empleartec.redsocial.redsocial;

import java.util.ArrayList;
import java.util.List;



public class Datos{

	//	ATRIBUTOS
	
	private List <Usuario> usuarios = new ArrayList<Usuario>();
	private List <Grupo> grupos = new ArrayList <Grupo>();
	private int indexLogin;
	
	//	CONSTRUCTOR
	
	public Datos() {
		super();	
	}
	
	//	SETTERS Y GETTERS
	
	public List <Usuario> getUsuarios() {
		return usuarios;
	}
	
	public void setListaUsuarios(List<Usuario> usuarios){
		this.usuarios = usuarios;
	}
	
	public void setUsuarios(Usuario usuario) {
		int i;
		for ( i=0; i < usuarios.size(); i++){
			if (this.usuarios.get(i).compareTo(usuario) == 0){		//compara usuarios por nombre y email para saber si lo modifica o agrega
				this.usuarios.remove(i);									
				this.usuarios.add(i, usuario);						//elimina usuario y lo agrega modificado
				return;
			}
		}
		
		if (i == usuarios.size()){									//Si no está en la lista de usuarios lo agrega
			this.usuarios.add(usuario);
		}
		
	}
	
	public List<Grupo> getGrupos() {
		return grupos;
	}

	public void setGrupos(Grupo grupo) {
		this.grupos.add(grupo);
	}

	public int getIndexLogin() {
		return indexLogin;
	}

	public void setIndexLogin(int indexLogin) {
		this.indexLogin = indexLogin;
	}
	
	public void addUsuario(){
		Usuario user = new Usuario("tincho", 24, "12345", "tincho@gmail");
		usuarios.add(user);
		
	}
	
}
