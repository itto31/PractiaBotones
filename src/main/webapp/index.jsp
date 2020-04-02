<!DOCTYPE html>
<html><link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<body>
<h2>AGREGAR DATOS</h2>
<table align="center">
	
<thead>
	

</thead>

<tbody>
	<tr>
		<td>	
			<form action="serveletcontroller" method="post">
			id:     <input type="text" name="Id"><br/>
			<br/>
			Nombre: <input type="text" name="NCliente"><br/>
			<br/>
			Apellido:<input type="text" name="ACliente"><br/>
			<br/>
			Edad:     <input type="text" name="ECliente"><br/>
			<br/>
			Direccion:<input type="text" name="DCliente"><br/>
			<br/>
			Dui:       <input type="text" name="DuCliente"><br/>
			<br/>
			Nit:       <input type="text" name="NiCliente"><br/>
			<br/>
			Grupo de programacion<input type="text" name="GCliente"><br/>
			<br/>
			Ultima nota<input type="text" name="NoCliente"><br/>
			<br/>
			<br/>
			<input type="submit" name="b1" value="Insertar" class="btn btn-info">
	        <input type="submit" name="b2" value="Eliminar" class="btn btn-info">
	        <input type="submit" name="b3" value="Editar" class="btn btn-info">
			</form>
		</td>
	</tr>
</tbody>

</table>
</body>
</html>