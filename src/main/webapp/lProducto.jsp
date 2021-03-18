<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Listar Bien</title>
	<script src="resources/js/jquery-3.5.1.min.js"></script>
	<script src="resources/js/jquery.validate.min.js"></script>
	<script src="resources/js/datatables.min.js"></script>
	<script src="resources/js/tablaProducto.js"></script>
	
	<link rel="stylesheet" href="resources/css/datatables.min.css">
</head>
<body>
	<p> </p>
		
		  <h2>Lista de bienes</h2>
		  <table  id = "listarBien" class="display" style="width:100%">
		    <thead >
		      <tr>
		      	<th>Codigo</th>
		        <th>Nombre</th>
		        <th>Categoria</th>
		      </tr>
		    </thead>
		  </table>

</body>
</html>