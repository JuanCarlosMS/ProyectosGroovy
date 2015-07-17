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
<g:each in="${personas}" var="personas" status="i">
    <h3>${i+1}. ${personas.primerNombre}, ${personas.segundoNombre}</h3>
    <p>
        Age: ${personas.edad}
    </p>

</g:each>
</body>
</html>