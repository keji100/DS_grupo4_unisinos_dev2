
function validaVenda(){
    var idCompra = $("#id_compra").val();
    if (idCompra.length == 0){
        alert("Preencha o ID");
    }else if (isNaN(idCompra)){
        alert("O valor não é numero");
    } else {
        var ulrMontar = 'http://localhost:8080/venda/'+idCompra;
        $.ajax({
            url: ulrMontar,
            method: 'GET',
        }).done(function(data){
            if(data){
                $("#informacoes").text(JSON.stringify(data));
            } else {
                $("#informacoes").text("ID não existe");
            }
        });
    }
}