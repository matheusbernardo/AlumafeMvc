function adicionaItemAOrcamento(){
var trecho = "<div class='row' id='item'>" + 
			   	"<div class='col-md-8 col-md-offset-2'>" +
			   		"<div class='box box-primary'>" +
							"<div class='box-header'>" +
								"<h5 class='box-title'>Item</h5>"+
							"</div>"+
							"<div class='box-body'>" +
								"<div class='form-group'>" +
									"<label for='altura'>Altura</label>" +
									"<input class='form-control' id='altura' placeholder='Insira a altura da peça' type='number'>" +
								"</div>" +
								"<div class='form-group'>" +
									"<label for='largura'>Largura</label>" +
									"<input class='form-control' id='largura' placeholder='Insira a largura da peça' type='number'>" +
				"</div>" +
				"<div class='form-group'>" +
					"<label>Descrição</label>" +
					"<textarea class='form-control' rows='3' placeholder='Insira a descrição da peça'></textarea>" +
				"</div>" +
				"<div class='form-group'>" +
					"<label for='preco'>Preço</label>" +
				"<input class='form-control' id=preco placeholder='Insira o preço da peça' type='number'></input>" + 
				"</div>" +
			"</div>" +
		"</div>" +
		"</div>" +
"</div>";
	
$("#orcamento").append(trecho);
}

  $(document).ready(function(){
     $('#adicionaItem').click(function(){
    	 adicionaItemAOrcamento();
     });
  });