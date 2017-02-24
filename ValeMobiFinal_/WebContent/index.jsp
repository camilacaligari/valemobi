<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet" type="text/css" href="assets/estilo.css">
<link
	href="https://fonts.googleapis.com/css?family=Playfair+Display:400,400i|Roboto+Condensed:400,700"
	rel="stylesheet">
<title>Cadastro de Produto</title>
</head>
<body>
	<div class="card" id="card">
		<div class="row">
			
			<div class="col-branca col-md-6" id="col-branca">
				<div class="cab-esq">
					<div class="col-esq">
						<h4 class="tipo" id="tipo"></h4>
						<h2 class="titulo" id="titulo"></h2>
						<h5 class="codigo" id="codigo"></h5>
					</div>
					<div class="col-dir">
						<h3 class="preco" id="tp-preco"></h3>
						<span class="qtd-tag">Qtd.:</span>
						<p class="qtd" id="qtd"></p>
					</div>
				</div>
				<div class="imagem">
					<img src="assets/img/cadeira_1.png" alt="Cadeira Design Amarela">
				</div>				
			</div>
			
			
			<div class="col-preta col-md-6" id="col-preta">
				
				<h1 class="chamada">Cadastro</br>de produto</h1>
				
				<form name="myForm" action="produtoServlet" method="post" onsubmit="return validaForm()">
					<div class="row">
						<div class="col-sm-12 col-md-6">
							<input class="cd-mercadoria" type="text" name="cd-mercadoria"
								id="cd-mercadoria" placeholder="Código da mercadoria"
								oninput="marcacao()">
						</div>
						<div class="col-sm-12 col-md-6">
							<select class="tp-mercadoria" name="tp-mercadoria" id="tp-mercadoria"
								oninput="marcacao()">
								<option value="">Tipo de Mercadoria</option>
								<option value="5">Alimentos</option>
								<option value="6">Mobiliário</option>
							</select>
						</div>
					</div>
					
					<div class="row ipt-espaco">
						<div class="col-sm-12 col-md-6">
							<input class="nm-mercadoria" type="text" name="nm-mercadoria"
								id="nm-mercadoria" placeholder="Nome da mercadoria" oninput="marcacao()">
						</div>
						
						<div class="col-sm-12 col-md-6">
							<input type="text" name="valor" id="valor" placeholder="Preço" oninput="marcacao()">
						</div>
					</div>
					
					<div class="row ipt-espaco">
						<div class="col-sm-12 col-md-6">
							<label for="qt-mercadoria">Quantidade</label>
							<input type="button" onclick="incrementarMenos()" value="-" class="btn-increment" />
							<input type="text" name="qt-mercadoria" id="qt-mercadoria" value="0" class="qt-mercadoria" />
							<input type="button" onclick="incrementarMais()" value="+" class="btn-increment" />
						</div>
						
						<div class="col-sm-12 col-md-6">
							<select class="tp-mercadoria" name="tp-negocio" id="tp-negocio" name="tp-negocio">
								<option value="">Tipo de Negócio</option>
								<option value="5">Venda</option>
								<option value="6">Compra</option>
							</select>
						</div>
					</div>
					
					<div class="row">
						<div class="col-sm-12 cadastrar">
							<input type="submit" id="btn-cadastrar" name="btn-cadastrar" value="Cadastrar" onclick="return validaForm()">
						</div>
					</div>
				</form>
				
			</div>
		</div>
	</div>

<script src="https://code.jquery.com/jquery-2.2.4.min.js" integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
	 crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
<script type="text/javascript" src="assets/script.js"></script>

</body>
</html>