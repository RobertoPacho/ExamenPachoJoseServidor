package appDist.ExamenPachojoseServidor.vista;

import javax.inject.Inject;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//@WebServlet(name = "Principal", urlPatterns = { "/Principal" })
public class Principal {

	public static void main(String[] args) throws Exception {
		
		// System.out.println(gestionClientesON.registrarCliente(cliente));
	}


	/*
	 * protected void doGet(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { try { response.getWriter().
	 * println("<h1>Hola mundo, si estan sobreviviendo al covid as </h1>");
	 * 
	 * // Mensajes e = servicesON.DepositoSRV(new DepositoSRV("CUHA06S3", 100)); //
	 * Mensajes ee = servicesON.RetiroSRV(new RetiroSRV("CUHA06S3", 50)); //
	 * response.getWriter().println("<h1>Hjuan: " + e.getNombre() + " <> " +
	 * ee.getNombre() +"</h1>"); // // Mensajes eee =
	 * servicesON.TransferenciasInternaSRV(new TransferenciaSRV("CUHA06S3",
	 * "CUHA16S10", 100.10, "Transferenacis internas")); //
	 * response.getWriter().println("<h1>Trans: " + eee.getNombre() +"</h1>"); //
	 * response.getWriter().println(pythonON.predecirClienteCedula("0104600996"));
	 * // response.getWriter().println("<>>>>>>>");
	 * response.getWriter().println(gestionClientesON.validarCedula("0105452171"));
	 * // Solicitud s = solicitudON.listarSalicitudes().get(0); //
	 * response.getWriter().println(pythonON.predecirCliente(s)); //
	 * pythonON.getPastel();
	 * 
	 * } catch (Exception e) { response.getWriter().println(e.getMessage() +
	 * e.getLocalizedMessage() + " >>>"); System.out.println(e.getMessage() +
	 * " acaca"); } }
	 */

}
