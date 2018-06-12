<%-- 
    Document   : FormPregunta
    Created on : 4/06/2018, 01:30:12 AM
    Author     : Max
--%>
<%@taglib  uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <label>Agregar Examen </label>
        <s:form action="AddExamen.action" >
            <s:textfield name="nombreexamen" key="Nombre de examen"/>
            
            <s:submit value="Crear" />
            <s:actionmessage  />
        </s:form>
    
    </body>
</html>
