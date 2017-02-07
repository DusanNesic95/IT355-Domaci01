<%@ taglib prefix="t" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Lista hotela</h1>
            <c:if test="${!empty hoteli}">
                <table>
                    <tr>
                        <th width="500"> Naziv hotela</th>
                        <th width="500"> Adresa hotela</th>
                        <th width="500"> Broj zvezdica</th>
                    </tr>
                    <c:forEach items="${hoteli}" var="hotel">
                        <div class="row">
                            <tr>
                                <td>${hotel.naziv}</td>
                                <td>${hotel.adresa}</td>
                                <td>${hotel.brojZvezdica}</td>
                                <td><a href="<c:url value='/edithotel/${hotel.hotelId}' />">Izmeni</a></td>
                                <td><a href="<c:url value='/deletehotel/${hotel.hotelId}' />">Obrisi</a></td>
                            </tr>
                        </div>
                    </c:forEach>
                </table>
            </c:if>
        </div>
    </body>
</html>
<%@include file="footer.jsp" %>