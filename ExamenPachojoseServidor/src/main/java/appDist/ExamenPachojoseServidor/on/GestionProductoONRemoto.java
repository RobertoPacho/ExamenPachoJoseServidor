package appDist.ExamenPachojoseServidor.on;

import java.util.List;

import javax.ejb.Remote;

import appDist.ExamenPachojoseServidor.modelo.Producto;

@Remote
public interface GestionProductoONRemoto {
	
	public boolean insertarProducto(Producto producto);
	public boolean actualizar_producto (Producto producto);
	public List<Producto> lista_ptoductos();
	public Producto buscar_producto(String nombre);
	
}
