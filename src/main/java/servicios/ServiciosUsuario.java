package servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.empleartec.redsocial.redsocial.*;
import interfaces.UserServices;

public class ServiciosUsuario implements UserServices{
	
	public ServiciosUsuario(){
		
	}
	//METODOS
	
	public void agregarAmigo(Usuario user, Usuario amigo) {
		user.setAmigos(amigo, true);				//agrego amigo	
	}
	
	public void eliminarAmigo(Usuario user, Usuario eliminar) {
		user.setAmigos(eliminar, false);
	}
	
	public void modificarCuenta(Usuario user) {
		Scanner s = new Scanner(System.in);
		System.out.println("1 -- modificar Email");
		System.out.println("2 -- modificar password");
		String opcion = s.nextLine();
		if(opcion == "1"){	
			System.out.println("Ingrese nuevo email: "); opcion = s.nextLine();
			user.setEmail(opcion);
		}else if(opcion == "2"){	
			System.out.println("Ingrese nueva password: "); opcion = s.nextLine();
			user.setPw(opcion);
		} else {
			System.out.println("Opción incorrecta");
		}
		opcion = "";
		s.close();
	}
	
	public void muestraPantallaPrinc(Datos datos,Usuario user){
		  System.out.println("Que desea hacer?");
		  Scanner s = new Scanner(System.in);
		  Integer opcion = s.nextInt();
		  System.out.println("Oprima 1 para MODIFICAR CUENTA"
		            + "/n 2 para BUSCAR USUARIO "
		            + "/n 3 PUBLICAR");
		  if(opcion == 1){ 
		   modificarCuenta(user);
		   
		  }else if(opcion == 2){ 
		   buscarUsuario(datos);
		  }else if (opcion == 3){
		   publicar(user);
		  }
		  s.close();
		 }
		
	public void login(Datos datos) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese Email: ");
		String email = s.nextLine();
		System.out.println("Ingrese Clave: ");
		String pw = s.nextLine();
		boolean a = false;
		for (Usuario i : datos.getUsuarios()){
			if (email.equals(i.getEmail())){
				if (pw.equals(i.getPw())){
					datos.setIndexLogin(datos.getUsuarios().indexOf(i));
					a = true;
					muestraPantallaPrinc(datos,i);
					s.close();
					return;
				}else System.out.println("CONTRASEÑA INCORRECTA");				
			}
		}
		if ( a == false) System.out.println("NO EXISTIS O EMAIL INCORRECTO");
		s.close();	
	}
	
	public void logout(Datos datos) {
		
		
	}
	
	public void registrar(Datos datos){
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese Nombre: ");
		String nombre = s.nextLine();
		System.out.println("Ingrese Edad: ");
		int edad = s.nextInt();
		System.out.println("Ingrese Email: ");
		String email = s.nextLine();
		System.out.println("Ingrese Clave: ");
		String pw = s.nextLine();
		Usuario user = new Usuario(nombre,edad,pw,email);
		datos.setUsuarios(user);
		s.close();
	}
	
	public void buscarUsuario(Datos datos){
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese Nombre a buscar: ");
		String nombreaB = s.nextLine();
		boolean a = false;
		List <Usuario> buscados = new ArrayList<Usuario>();
		for(Usuario i : datos.getUsuarios()){
			if (i.getNombre().contains(nombreaB)){
				buscados.add(i);
				a = true;
				//System.out.println(""+buscados);
				// MUESTRA LISTA USUARIOS Y AGREGA SI QUIERE
			}	
		}
		if ( a == false){
			System.out.println("NO EXISTE USUARIO");
		}
		s.close();
	}
	
	public void publicar(Usuario user){
		  Scanner s = new Scanner(System.in);
		  System.out.println("Que desea publicar? ");    //modificacion en clase publicacion hecha
		  String texto = s.nextLine();
		  Publicacion publicacion = new Publicacion(texto);
		  user.getMuroUsuario().setPublicaciones(publicacion);
		  System.out.println("/nSe ha publicado en su muro!");
		  s.close();
	}
	
	public void eliminar(Datos datos){
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese Clave: ");
		String pw = s.nextLine();
		if(pw.equals(datos.getUsuarios().get(datos.getIndexLogin()).getPw())){
			System.out.println("Esta seguro de eliminar su cuenta? S/N "); 
			String sn = s.nextLine();
			if (sn == "s"){ 
			datos.getUsuarios().remove(datos.getIndexLogin());
			}
		}else{
			muestraPantallaPrinc(datos,datos.getUsuarios().get(datos.getIndexLogin()));
		}
		s.close();
	}

	public void seguir(Datos datos,Usuario seguidor) {
		Usuario user = datos.getUsuarios().get(datos.getIndexLogin());
		user.setSeguidores(seguidor, true);
		
		datos.getUsuarios().get(datos.getIndexLogin()).setSeguidores(seguidor, true);
	}
	
	public void dejarSeguir(Datos datos) {
		// TODO Auto-generated method stub
		
	}

}
