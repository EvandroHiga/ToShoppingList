<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>:: todas as receitas ::</title>
		<link href="<c:url value="/resources/css/main.css" />" rel="stylesheet">
		<link href="<c:url value="/resources/css/table.css" />" rel="stylesheet">
	</head>
	<body>
		<header>:: todas as receitas ::</header>
		
		<main>
			<input type="text" id="filtrar-receitas" class="text-box" placeholder="nome da receita:">
			<table>
				<thead>
					<tr>
						<th>Receita</th>
						<th>Modo de Preparo</th>
  						<th class="no-show-filter"></th>
					</tr>
				</thead>
				<tbody id="tabela-todas-receitas">
					<c:forEach items="${todasReceitas_list}" var="receita">
						<tr>
							<td class="nome-receita">${receita.nomeReceita}</td>
							<td class="modo-preparo-receita">${receita.modoPreparoReceita}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			
			<hr>
			
<!--		<form action="/gerarListaCompras"> -->
				<table>
					<tbody id="tabela-receitas-adicionadas">
					</tbody>
				</table>	
				<button id="gerar-lista-compras" onclick="func_gerarListaCompras()">Gerar lista!</button>
<!--		</form> -->
		</main>
		
		<script src="<c:url value="/resources/js/receita.js" />"></script>
	</body>
</html>
