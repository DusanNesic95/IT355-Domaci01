<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Prikaz sobe hotela</title>
</head>
<body>

	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="get" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
	</form>
	<script>
      	function formSubmit() {
          	document.getElementById("logoutForm").submit();
		} 
	</script>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h2>
			Username je : ${pageContext.request.userPrincipal.name} | <a
				href="javascript:formSubmit()"> Logout</a>
		</h2>
	</c:if>

	<h2>Podaci o sobi</h2>
	<table>
		<tr>
			<td>Broj kreveta:</td>
			<td>${brojKreveta}</td>
		</tr>
		<tr>
			<td>Velicina:</td>
			<td>${velicina}</td>
		</tr>
		<tr>
			<td>Kupatilo:</td>
			<td>${kupatilo}</td>
		</tr>
		<tr>
			<td>TV:</td>
			<td>${tv}</td>
		</tr>
		<tr>
			<td>Klima:</td>
			<td>${klima}</td>
		</tr>
		<tr>
			<td>Cena po danu:</td>
			<td>${cenaPoDanu}</td>
		</tr>
	</table>
</body>
</html>