var input_txt_filtro = document.getElementById("filtrar-receitas");

// 'input' event: toda vez que um conteúdo é inserido / removido
input_txt_filtro.addEventListener("input", function(){
	var tabelaTodasReceitas = document.getElementById("tabela-todas-receitas");
	var receitas = tabelaTodasReceitas.querySelectorAll(".receita");
	
	var regex = new RegExp(this.value, "i"); // "i": case-insensitive
	
	if(this.value.length > 0){
		for(var i=0;  i < receitas.length; i++){
			var receita = receitas[i];
			var nomeReceita = receita.querySelector(".info-nome-receita").textContent;
			
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
