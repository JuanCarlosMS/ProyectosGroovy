<%--
  Created by IntelliJ IDEA.
  User: Sintelti
  Date: 16/07/2015
  Time: 05:02 PM
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title></title>
</head>

<body>
<g:form action="save" >
    <label for="apellido">Last Name</label>
    <g:textField name="lastName" value="${persona.segundoNombre}"/>
    <br/>
    <label for="nombre">First Name</label>
    <g:textField name="firstName" value="${persona.primerNombre}"/>
    <br/>
    <label for="age">Age</label>
    <g:textField name="age" value="${persona.age}"/>
    <br/>
    <g:submitButton name="create" value="Save" />
</g:form>
</body>
</html>