package com.alvaro.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.alvaro.model.Inventario;

public class inventarioDAO {
public List<Inventario> inventariolista() {
		
		List<Inventario> Listapr = new ArrayList<>();
		
		
		EntityManager em;
		EntityManagerFactory emf;
		emf = Persistence.createEntityManagerFactory("Practica1JPA");
		em = emf.createEntityManager();
		
		try {
			
			em.getTransaction().begin();
	
			Listapr = em.createQuery("from inventario").getResultList();
			em.getTransaction().commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);					
		}		
		return Listapr;
	}
public void agregarDatos(Inventario pr) {
	
	EntityManager em;
	EntityManagerFactory emf;
	emf = Persistence.createEntityManagerFactory("Practica1JPA");
	em = emf.createEntityManager();
	
	em.getTransaction().begin();
	em.persist(pr);
	em.flush();
	em.getTransaction().commit();
			
}

public void actualizarDatos(Inventario pr) {
	EntityManager em;
	EntityManagerFactory emf;
	emf = Persistence.createEntityManagerFactory("Practica1JPA");
	em = emf.createEntityManager();
	
	pr.getId();
	pr.getNombreProducto();
	pr.getPrecioProducto();
	pr.getCantidadProducto();
	pr.getTotalProducto();
	
	em.getTransaction().begin();
	em.merge(pr);
	em.flush();
	em.getTransaction().commit();
	
}
public void eliminarDatos(Inventario pr) {
	EntityManager em;
	EntityManagerFactory emf;
	emf = Persistence.createEntityManagerFactory("Practica1JPA");
	em = emf.createEntityManager();

	em.getTransaction().begin();		
	pr=em.getReference(Inventario.class, pr.getId());
	em.remove(pr);
	em.flush();
	em.getTransaction().commit();
	
	
}


}
