package interfaces;

import com.empleartec.redsocial.redsocial.*;

public interface GroupServices {
	
	//	METODOS
	
	public void crearGrupo(Datos datos);
	public void agregarParticipantes(Grupo grupo, Usuario participante);
	public void buscarUsuario(Datos datos);
	public void eliminarParticipantes(Grupo grupo, Usuario participante);
	public void abandonarGrupo();
	public void eliminarGrupo();
}
