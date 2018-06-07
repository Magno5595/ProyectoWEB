<%-- 
    Document   : FormPregunta
    Created on : 4/06/2018, 01:30:12 AM
    Author     : Max
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <s:form action="AddExamenlectura" >
            <s:textfield name="nombreexamen" key="Nombre de examen"/>
            <s:textfield name="tipolecturaexamens"
            <s:submit value="Crear" />
            <s:actionmessage  />
        </s:form>
    
    
        <s:form action="AddExamenescritura" >
            <s:textfield name="nombreexamen" key="Nombre de examen"/>
            <s:textfield name="tipoescrituraexamens"
            <s:submit value="Crear" />
            <s:actionmessage  />
        </s:form>
    </body>
</html>
