package appDist.ExamenPachojoseServidor.on;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import appDist.ExamenPachojoseServidor.dao.ProductoDAO;
import appDist.ExamenPachojoseServidor.modelo.Producto;

@Stateless
public class ProductoON  implements GestionProductoONRemoto{
	
	@Inject
	private ProductoDAO productoDAO;
	
	
	public boolean insertarProducto(Producto producto) {
		productoDAO.insertar(producto);
		return true;
	}
	
	public boolean actualizar_producto (Producto producto) {
		productoDAO.actualizar(producto);
		return true;
	}
	
	public List<Producto> lista_ptoductos(){
		return productoDAO.listaproductos();	
	}
	
	public Producto buscar_producto(String nombre) {
		return productoDAO.buscar(nombre);
	}

}
