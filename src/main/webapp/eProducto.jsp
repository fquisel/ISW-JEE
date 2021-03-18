<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Eliminar Producto</title>
	<script src="resources/js/jquery-3.5.1.min.js"></script>
	<script src="resources/js/jquery.validate.min.js"></script>
	<script src="resources/js/jquery.mask.min.js"></script>
	<script src="resources/js/validaCliente.js"></script>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>
	<h2>Eliminar un Producto</h2>
			<div class="col-sm-4">
				<form action ="/sanmateo/controlador/EliminarProducto" method="GET">
					<div class="modal-body">
						<div class='form-group'>
							<label> Ingrese Codigo:</label>
							<input type="text" class="form-control" placeholder="Ingrese codigo" name="id" id="id" required> 
						</div>
					</div>
					<div class="modal-footer">
						<button class="btn btn-primary" type="submit">Enviar</button>
					</div>
				</form>
			</div>
	</body>
</html>