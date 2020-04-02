package com.alvaro.controlador;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alvaro.model.Cliente;

/**
 * Servlet implementation class serveletcontroller
 */
public class serveletcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public serveletcontroller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String btn1 =request.getParameter("b1");
		String btn2 =request.getParameter("b2");
		String btn3 =request.getParameter("b3");
		
		if("Insertar".equals(btn1)) {
		String id = request.getParameter("Id");
		String nom = request.getParameter("NCliente");
		String ap = request.getParameter("ACliente");
		String eda = request.getParameter("ECliente");
		String dire= request.getParameter("DCliente");
		String dui = request.getParameter("DuCliente");
		String nit = request.getParameter("NiCliente");
		String grup = request.getParameter("GCliente");
		String nota = request.getParameter("NoCliente");
		
		Cliente cl = new Cliente();
		cl.setId(Integer.parseInt(id));
		cl.setNombre(nom);
		cl.setApellido(ap);
		cl.setEdad(Integer.parseInt(eda));
		cl.setDireccion(dire);
		cl.setDui(dui);
		cl.setNit(nit);
		cl.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grup));
		cl.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(nota));
		
		EntityManager em;
		EntityManagerFactory emf;
		
		emf = Persistence.createEntityManagerFactory("AlvaroAntonioValladaresBorja");
		
		em= emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(cl);
		em.flush();
		em.getTransaction().commit();
		
		
		}
		 if("Editar".equals(btn3)) {
			 String id = request.getParameter("Id");
				String nom = request.getParameter("NCliente");
				String ap = request.getParameter("ACliente");
				String eda = request.getParameter("ECliente");
				String dire= request.getParameter("DCliente");
				String dui = request.getParameter("DuCliente");
				String nit = request.getParameter("NiCliente");
				String grup = request.getParameter("GCliente");
				String nota = request.getParameter("NoCliente");
				
				Cliente cl = new Cliente();
				cl.setId(Integer.parseInt(id));
				cl.setNombre(nom);
				cl.setApellido(ap);
				cl.setEdad(Integer.parseInt(eda));
				cl.setDireccion(dire);
				cl.setDui(dui);
				cl.setNit(nit);
				cl.setGrupoDeClaseProgramacion3Alquepertenece(Integer.parseInt(grup));
				cl.setUtimaNotaObtenidaEnProgramacion2(Double.parseDouble(nota));
				
				EntityManager em;
				EntityManagerFactory emf;
				
				emf = Persistence.createEntityManagerFactory("AlvaroAntonioValladaresBorja");
				
				em= emf.createEntityManager();
				
				em.getTransaction().begin();
				
				em.merge(cl);
				em.flush();
				em.getTransaction().commit();
				
					 
		 }
		  if("Eliminar".equals(btn2)) {
			 String id = request.getParameter("Id");
			 Cliente cl = new Cliente();
				cl.setId(Integer.parseInt(id));
				EntityManager em;
				EntityManagerFactory emf;
				
				emf = Persistence.createEntityManagerFactory("AlvaroAntonioValladaresBorja");
				
				em= emf.createEntityManager();
				
				em.getTransaction().begin();
				cl = em.getReference(Cliente.class, cl.getId());
				em.remove(cl);
				em.flush();
				em.getTransaction().commit();
			 
		 }
	 
		response.sendRedirect("index.jsp");
	}

}
