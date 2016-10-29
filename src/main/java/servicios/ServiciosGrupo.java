package servicios;

import java.util.Scanner;

import com.empleartec.redsocial.redsocial.Datos;
import com.empleartec.redsocial.redsocial.Grupo;
import com.empleartec.redsocial.redsocial.Usuario;

import interfaces.GroupServices;

public class ServiciosGrupo implements GroupServices {

	//METODOS
	
	public void crearGrupo(Datos datos) {
		
		String nombre = null;
		Grupo nuevo = new Grupo(datos.getUsuarios().get(datos.getIndexLogin()), nombre);
		datos.setGrupos(nuevo);
				
	}

	public void agregarParticipantes(Grupo grupo, Usuario participante) {
		grupo.getParticipantes().add(participante);
				
	}

	public void eliminarParticipantes(Grupo grupo, Usuario participante) {
		
		grupo.getParticipantes().remove(participante);
	}
	
	public void buscarUsuario(Datos datos) {
		Scanner s = new Scanner(System.in);
		System.out.println("Ingrese Nombre a buscar: ");
		String nombreaB = s.nextLine();
		boolean a = false;
		for (Usuario i : datos.getUsuarios()){
				if (i.getNombre().contains(nombreaB)){
					a = true;
					// MUESTRA LISTA USUARIOS Y AGREGA SI QUIERE
				}	
		}
		if ( a == false){
			System.out.println("NO EXISTE USUARIO");
		}
		s.close();
	}
	
	public void abandonarGrupo() {
		// TODO Auto-generated method stub
		
	}

	public void eliminarGrupo() {
		// TODO Auto-generated method stub
	}
}
