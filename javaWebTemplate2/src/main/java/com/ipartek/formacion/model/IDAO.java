package com.ipartek.formacion.model;

import java.util.List;

public interface IDAO<P>
{

	List<P>getAll();
	
	/**
	 * recupera un pojo por su identificador
	 * @param id identificador
	 * @return pojo si lo encuentra, si no mull
	 */
	
	P getById(int id);
	
	/**
	 * Elimina
	 * @param id identificador
	 * @return pojo eliminado
	 * @throws Exception si no se puede eliminar o no encontrado
	 */
	
	P delete(int id) throws Exception;
	
	/**
	 * actualiza
	 * @param id identificador
	 * @return pojo contiene los datos a modificar
	 * @throws Exception si no se puede modificar o no lo encuentra
	 */
	
	P update(P pojo) throws Exception;
	
	/**
	 * Crea un nuevo pojo
	 * @param pojo a crear
	 * @return pojo creado con el id nuevo
	 * @throws Exception si no puede crearse
	 */
	
	P create(P pojo) throws Exception;

	
}
