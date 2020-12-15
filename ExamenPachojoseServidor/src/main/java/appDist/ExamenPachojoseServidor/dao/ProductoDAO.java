package appDist.ExamenPachojoseServidor.dao;

import java.sql.Connection;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import appDist.ExamenPachojoseServidor.modelo.Producto;

@Stateless
public class ProductoDAO {
	
	@Inject
	private Connection conexion;
	
	@Inject
	private EntityManager em;
	
	@Inject
	private Producto producto; 
	
	public boolean insertar(Producto producto) {
		em.persist(producto);
		return true;
	}
	
	
	public boolean actualizar(Producto entity) {
		producto.setNombre(entity.getNombre());
		producto.setDetalle(entity.getDetalle());
		producto.setCosto(entity.getCosto());
		producto.setStock(entity.getStock());
		em.merge(producto);
		return true;
	}
	
	
	public List<Producto> listaproductos(){
		String jpql = "Select p from Producto p";
		Query q = em.createQuery(jpql,Producto.class);
		return (List<Producto>) q.getResultList();
	}
	
	public Producto buscar(String nombre) {
		producto=em.find(Producto.class, nombre);
		return producto;
	}

}
