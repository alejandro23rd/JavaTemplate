<h1>Formulario de Productos</h1>

<form action="productos" method="post">

	<input type="text" name="nombre" value="${nombre}" placeholder="Dime tu nombre" required>
	<br>
	<input type="text" name="precio" value="${precio}" placeholder="Dime el precio" required>
	<br>
	<input type="text" name="descripcion" value="${descripcion}" placeholder="Dime la descripcion" required>
	<br>	
	<input type="text" name="descuento" value="${descuento}" placeholder="Dime el descuento" required>
	<br>
	<!-- falta poner la foto -->
	<input type="submit" value="Registrar">

</form>