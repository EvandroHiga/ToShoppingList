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
			<input class="text-box" type="text" id="filtrar-receitas" placeholder="nome da receita:">
			<table>
				<thead>
					<tr>
						<th>Receita</th>
						<th>Data</th>
						<th style="border:0px; opacity:0;"></th>
						<th style="border:0px; opacity:0;"></th>
					</tr>
				</thead>
				<tbody id="tabela-todas-receitas">
					<c:forEach items="${todasReceitas_list}" var="receita">
						<tr class="receita">
							<td class="info-nome-receita">${receita.nome_receita}</td>
							<td class="info-data-receita"><fmt:formatDate value="${receita.data_receita.time}" pattern="dd/MM/yyyy"/></td>
							<td><a href="">ver receita</a></td>
							<td><a href="">adicionar &agrave; lista de compras</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</main>
		
		<script src="<c:url value="/resources/js/receita.js" />"></script>
	</body>
</html>
