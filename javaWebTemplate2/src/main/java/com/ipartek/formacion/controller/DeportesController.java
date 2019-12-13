package com.ipartek.formacion.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DeportesController
 */
@WebServlet("/deportes")
public class DeportesController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}

	private void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{

		String nombre = request.getParameter("nombre");
		String email = request.getParameter("email");
		String sexo = request.getParameter("sexo");
		String deportes[] = request.getParameterValues("deportes");

		
		
		try
		{
			// comprobar que nombre, email y sexo no sean valores nulos
			if (nombre != null && email != null && sexo != null)
			{

				// comprobar que deportes no sean nulos y que sean menos 3 deportes
				if (deportes != null && deportes.length >= 3)
				{

					HashMap<String, String> hmDeportes = (HashMap<String, String>) request.getServletContext().getAttribute("deportes");
					ArrayList<String> deportesSeleccionados = new ArrayList<String>();
					for (String deporteKey : deportes)
					{

						String deporteValue = hmDeportes.get(deporteKey);
						if (deporteValue != null)
						{
							deportesSeleccionados.add(deporteValue);
						}

					}

					request.setAttribute("deportesSeleccionados", deportesSeleccionados);
					request.setAttribute("nombre", nombre);
					request.setAttribute("email", email);
					request.setAttribute("sexo", sexo);
					request.getRequestDispatcher("deportes-resumen.jsp").forward(request, response);

				} else
					
				{ // < 3 deportes

					request.setAttribute("nombre", nombre);
					request.setAttribute("deportesMarcados", Arrays.toString(deportes));
					request.setAttribute("mensaje", "Selecciona almenos 3 deportes");
					request.getRequestDispatcher("formulario-deportes.jsp").forward(request, response);

				}
			}
		}catch (Exception e)
		{
			LOG.error(e);
		}
	}
}
