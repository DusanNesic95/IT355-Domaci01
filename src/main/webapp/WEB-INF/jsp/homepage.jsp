<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Domaci 01</title>
</head>
<body>
	<c:url value="/j_spring_security_logout" var="logoutUrl" />
	<form action="${logoutUrl}" method="get" id="logoutForm">
		<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	</form>
	<script>
      	function formSubmit() {
          	document.getElementById("logoutForm").submit();
		} 
	</script>
	<c:if test="${pageContext.request.userPrincipal.name != null}">
		<h2>
			Username je : ${pageContext.request.userPrincipal.name} | <a href="javascript:formSubmit()"> Logout</a>
		</h2>
	</c:if>

	<h2>Dusan Nesic</h2>
	<h3>${indeks}</h3>
</body>
</html>