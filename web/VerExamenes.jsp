<%@taglib uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <th>MENU</th>
                <th><a href="http://localhost:8003/WADPROYECTO/AddExamen.action">Crear Examen</a></th>
                
            </tr>
        <s:iterator value="lista2">
            <s:url action="" var="url">
            <s:param name="id">
                <s:property value="sid" />
            </s:param>
            </s:url>
            <s:url action="" var="url1">
            <s:param name="id">
                <s:property value="sid" />
            </s:param>
            </s:url>
            <s:url action="" var="url2">
            <s:param name="id">
                <s:property value="sid" />
            </s:param>
            </s:url>
            
            <s:url action="" var="url3">
            <s:param name="id">
                <s:property value="sid" />
            </s:param>
            </s:url>
            
            <tr>
            <td><s:property value="idexamen" /></td>
            <td><s:property value="nombreexamen" /></td>
            
            <td><a href="<s:property value="#url" />">Ver</a> </td> 
            <td><a href="<s:property value="#url1" />">Modificar</a> </td>
            <td><a href="<s:property value="#url2" />">Borrar</a> </td>
            <td><a href="<s:property value="#url3" />">Modificar Canvas</a> </td>
            </tr>
            
            
            
        </s:iterator>
    </body>
</html>
