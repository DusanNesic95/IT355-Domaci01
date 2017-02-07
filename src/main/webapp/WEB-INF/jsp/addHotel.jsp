<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@include file="header.jsp" %>
<c:url var="addHotel" value="/addHotel" ></c:url>
<div class="container">
    <h1>Dodaj hotel</h1>
    <c:url var="post_url" value="/addHotel/" />
    <form:form method="POST" action="${post_url}" modelAttribute="hotel">
        <% String success = (String) request.getAttribute("successMsg");%><%= (success != null) ? "<div class=\"alert alert-success\">"+success+"</div>" : "" %>
        <div class="form-group">
            <form:label path="naziv">Naziv hotela</form:label>
            <form:input type="text" id="naziv" class="form-control" placeholder="Naziv hotela" path="naziv" />
        </div>
        <div class="form-group">
            <form:label path="adresa">Adresa hotela</form:label>
            <form:input type="text" id="adresa" class="form-control" placeholder="Adresa" path="adresa" />
        </div>
        <div class="form-group">
            <form:label path="brojZvezdica">Broj zvezdica</form:label>
            <form:input type="text" id="brojZvezdica" class="form-control" placeholder="Broj zvezdica" path="brojZvezdica" />
        </div>
        <button type="submit" class="btn btn-primary">Dodaj hotel</button>
    </form:form>
</div>
<%@include file="footer.jsp" %>