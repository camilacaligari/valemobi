function marcacao(){

	var txtCod, ddlTipoMercadoria, txtNome, txtPreco, txtQtd, ddlNegocio;

	txtCod = document.getElementById("cd-mercadoria").value;
    document.getElementById("codigo").innerHTML = txtCod;

    ddlTipoMercadoria = document.getElementById("tp-mercadoria").value;
    document.getElementById("tipo").innerHTML = ddlTipoMercadoria;

    txtNome = document.getElementById("nm-mercadoria").value;
    document.getElementById("titulo").innerHTML = txtNome;

    txtPreco = document.getElementById("valor").value;
    document.getElementById("tp-preco").innerHTML = "R$ " + txtPreco;
}

function incrementarMais()
{
    var mais = parseInt(document.getElementById('qt-mercadoria').value, 10);
    mais = isNaN(mais) ? 0 : mais;
    mais++;
    document.getElementById('qt-mercadoria').value = mais;

    txtQtd = document.getElementById("qt-mercadoria").value;
    document.getElementById("qtd").innerHTML = txtQtd;
}

function incrementarMenos()
{
    var menos = parseInt(document.getElementById('qt-mercadoria').value, 10);
    menos = isNaN(menos) ? 0 : menos;
    menos--;
    document.getElementById('qt-mercadoria').value = menos;

    txtQtd = document.getElementById("qt-mercadoria").value;
    document.getElementById("qtd").innerHTML = txtQtd;
}


function validaForm() {
    
    var codigo = document.forms["myForm"]["cd-mercadoria"].value;
    if ((codigo == "") || (codigo == " ")) {
        alert("O campo Código não pode ser deixado em branco");
        document.getElementById("cd-mercadoria").style.borderBottom = "2px solid #f93b5e";
        return false;
    }

    var tipoMercadoria = document.forms["myForm"]["tp-mercadoria"].value;
    if (tipoMercadoria == "") {
        alert("O campo Tipo de Mercadoria não pode ser deixado em branco");
        document.getElementById("tp-mercadoria").style.borderBottom = "2px solid #f93b5e";
        return false;
    }

    var nome = document.forms["myForm"]["nm-mercadoria"].value;
    if ((nome == "") || (nome == " ")) {
        alert("O campo Nome da Mercadoria não pode ser deixado em branco");
        document.getElementById("nm-mercadoria").style.borderBottom = "2px solid #f93b5e";
        return false;
    }

    var valor = document.forms["myForm"]["valor"].value;
    if ((valor == "") || (valor == " ")) {
        alert("O produto precisa ter um Preço!");
        document.getElementById("valor").style.borderBottom = "2px solid #f93b5e";
        return false;
    }

    var quantidade = document.forms["myForm"]["qt-mercadoria"].value;
    if (quantidade <= 0) {
        alert("A quantidade do produto não pode ser igual a zero ou negativa.");
        document.getElementById("qt-mercadoria").style.borderBottom = "2px solid #f93b5e";
        return false;
    }

    var negocio = document.forms["myForm"]["tp-negocio"].value;
    if (negocio == "") {
        alert("O Tipo do Negócio precisa ser preenchido!");
        document.getElementById("tp-negocio").style.borderBottom = "2px solid #f93b5e";
        return false;
    }


}