<%--
  Created by IntelliJ IDEA.
  User: Sintelti
  Date: 13/07/2015
  Time: 04:35 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Renderisar Dominio</title>
</head>

<body>
    <table>
        <tr>
            <td>Nombre</td>
            <td>Edad</td>
        </tr>
        <g:each in="${list}" var="person">
        <tr>
            <td>${person.segundoNombre}, ${person.primerNombre}</td>
            <td>${person.age}</td>
        </tr>
            </g:each>
    </table>
</body>
</html>