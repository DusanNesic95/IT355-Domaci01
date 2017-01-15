<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@page language="java" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html>
<head>
    <title>Dodavanje soba</title>
</head>
<body>

<h2>Unesite informacije o sobi</h2>
<form:form method="POST" action="/IT355-Domaci01-1.0/soba/dodajSobu">
   <table>
    <tr>
        <td><form:label path="brojKreveta"><spring:message code="brojKreveta"></spring:message></form:label></td>
        <td><form:input path="brojKreveta" /></td>
    </tr>
    <tr>
        <td><form:label path="velicina"><spring:message code="velicina"></spring:message></form:label></td>
        <td><form:input path="velicina" /></td>
    </tr>
    <tr>
        <td><form:label path="kupatilo"><spring:message code="kupatilo"></spring:message></form:label></td>
        <td><form:input path="kupatilo" /></td>
    </tr>
    <tr>
        <td><form:label path="tv"><spring:message code="tv"></spring:message></form:label></td>
        <td><form:input path="tv" /></td>
    </tr>
    <tr>
        <td><form:label path="klima"><spring:message code="klima"></spring:message></form:label></td>
        <td><form:input path="klima" /></td>
    </tr>
    <tr>
        <td><form:label path="cenaPoDanu"><spring:message code="cenaPoDanu"></spring:message></form:label></td>
        <td><form:input path="cenaPoDanu" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="Dodaj sobu"/>
        </td>
    </tr>
</table>  
</form:form>
</body>
</html>