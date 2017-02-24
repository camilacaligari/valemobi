<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="assets/estilo.css">
<link href="https://fonts.googleapis.com/css?family=Playfair+Display:400,400i|Roboto+Condensed:400,700" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de Produto</title>
</head>
<body>
	<div class="card" id="card">
		<div class="row">
			<div class="col-md-9">
				<h1 class="ls-titulo">Lista de produtos</h1>
			</div>
			<div class="col-md-3">
				<div >
					<a href="index.jsp"><button class="btn-index">Cadastrar</button></a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-12 lista" id="lista">
				<table class="table">
					<tr>
						<th>Código</th>
						<th>Tipo de mercadoria</th>
						<th>Nome</th>
						<th>Quantidade</th>
						<th>Preço</th>
						<th>Tipo de negociação</th>
					</tr>
					<c:forEach var="produto" items="${lista }">
					<tr>
						<td>${produto.codigoProduto}</td>
						<td>${produto.nome}</td>
						<td>${produto.quantidade}</td>
						<td>${produto.preco}</td>
						<td>${produto.tipoNegocio.nome}</td>
						<td>${produto.tipoMercadoria.nome}</td>
					</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>

	<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
		crossorigin="anonymous"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
		crossorigin="anonymous"></script>
	<script type="text/javascript" src="assets/script.js"></script>
</body>
</html>