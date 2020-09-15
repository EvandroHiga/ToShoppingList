<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page isELIgnored="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<html lang="pt-br">
	<head>
		<meta charset="UTF-8">
		<title>:: Todas as receitas ::</title>
		<link rel="icon" href="favicon.ico" type="image/x-icon">
		<link href="<c:url value="/resources/css/index.css" />" rel="stylesheet">
	</head>
	<body class="container">
		<header>:: Todas as receitas ::</header>
		<main>
			<section>
				<input class="text-box" type="text" id="filtrar-paciente" placeholder="Nome do paciente:">
				<table>
					<thead>
						<tr>
							<th>Nome</th>
							<th>Ingredientes</th>
							<th>Modo de preparo</th>
							<th>Data</th>
						</tr>
					</thead>
					<tbody id="tabela-pacientes">
						<c:forEach items="${todasReceitas_list}" var="receita">
							<tr class="paciente">
								<td class="info-nome">${receita.nome_receita}</td>
								<td class="info-peso">${receita.ingredientes_receita}</td>
								<td class="info-altura">${receita.modo_preparo_receita}</td>
								<td class="info-gordura"><fmt:formatDate value="${receita.data_receita.time}" pattern="dd/MM/yyyy"/></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</section>
		</main>
		<script src="<c:url value="/resources/js/filtrar-pacientes.js" />"></script>
		<script src="<c:url value="/resources/js/adicionar-paciente.js" />"></script>
<%-- 		<script src="<c:url value="/resources/js/remover-pacientes.js" />"></script> --%>
		
	</body>
</html>
