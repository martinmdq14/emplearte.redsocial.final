package interfaces;
import com.empleartec.redsocial.redsocial.*;

public interface UserServices {
	
	//METODOS
	
	public void logout(Datos datos);
	public void dejarSeguir(Datos datos);
	public void agregarAmigo(Usuario user, Usuario amigo);
	public void eliminarAmigo(Usuario user, Usuario eliminar);
	public void modificarCuenta(Usuario user);
	public void muestraPantallaPrinc(Datos datos,Usuario user);
	public void login(Datos datos);
	public void registrar(Datos datos);
	public void buscarUsuario(Datos datos);
	public void publicar(Usuario user);
	public void eliminar(Datos datos);
	public void seguir(Datos datos,Usuario seguidor);
}
