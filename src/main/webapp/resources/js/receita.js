/*
 * Impl. do filtro do input 'filtrar-receitas'
 */
document.getElementById("filtrar-receitas").addEventListener("input", function(){
	var tabelaTodasReceitas = document.getElementById("tabela-todas-receitas");
	var receitas = tabelaTodasReceitas.querySelectorAll(".receita");
	
	var regex = new RegExp(this.value, "i"); // "i": case-insensitive
	
	if(this.value.length > 0){
		for(var i=0;  i < receitas.length; i++){
			var receita = receitas[i];
			var nomeReceita = receita.querySelector(".nome-receita").textContent;
			
			if(!regex.test(nomeReceita)){
				receita.classList.add("no-show-filter");
			} else {
				receita.classList.remove("no-show-filter");
			}
		}
	} else {
		for(var i=0;  i < receitas.length; i++){
			var receita = receitas[i];
			receita.classList.remove("no-show-filter");
		}
	}
});

/*
 * Impl. do double-click p/ adicionar a receita a lista de compras
 */
document.getElementById("tabela-todas-receitas").addEventListener("dblclick", function(event){
	var receitaSelecionada = event.target.parentNode;
	
	var receita = document.createElement("td");
	receita.classList.add("nome-receita-adicionada");
	receita.innerHTML = receitaSelecionada.querySelector(".nome-receita").innerHTML;
	
	var receitaAdicionada = document.createElement("tr");
	receitaAdicionada.appendChild(receita);
	
	document.getElementById("tabela-receitas-adicionadas").appendChild(receitaAdicionada);
});


/*
 * 
 */
//function func_gerarListaCompras(){
//	var receitasSelecionadas_node = document.getElementById("tabela-receitas-adicionadas").querySelectorAll(".nome-receita-adicionada");
//	var receitasSelecionadas_array = new Array();
//	
//	for(var i=0; i < receitasSelecionadas_node.length; i++){
//		receitasSelecionadas_array[i] = receitasSelecionadas_node[i].innerHTML;
//	}
//	
//	$.ajax({
//        type: "POST",
//        url: "/gerarListaCompras",
//        data: receitasSelecionadas_array,
//        success: function (result) {
//            // do something.
//        },
//        error: function (result) {
//            // do something.
//        }
//    });
//	
//}


function func_gerarListaCompras(){
	var receitasSelecionadas_node = document.getElementById("tabela-receitas-adicionadas").querySelectorAll(".nome-receita-adicionada");
	var receitasSelecionadas_array = new Array();
	
	for(var i=0; i < receitasSelecionadas_node.length; i++){
		receitasSelecionadas_array[i] = receitasSelecionadas_node[i].innerHTML;
	}
	
	$.post("demo_ajax_gethint.asp", {suggest: txt}, function(result){
	      $("span").html(result);
	    });
	
}