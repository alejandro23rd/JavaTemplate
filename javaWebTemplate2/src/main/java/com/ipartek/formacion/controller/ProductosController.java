package com.ipartek.formacion.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ProductosController
 */
@WebServlet("/productos")
public class ProductosController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{	
		doAction(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doAction(request, response);
	}
	
	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		//parametros
		String nombre = request.getParameter("nombre");
		String precio = request.getParameter("precio");
		String descripcion = request.getParameter("descripcion");
		String descuento = request.getParameter("descuento");
		
		if(nombre != null && precio != null && descripcion != null && descuento != null)
		{
			
		}
	}

}
