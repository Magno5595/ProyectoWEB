

<%@taglib  uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista preguntas</title>
    </head>
    <body>
<table>
            <tr>
                <th>Nombre examen</th>
                <th>Texto de pregunta</th>
                <th>Pregunta</th>
                <th>Respuestas</th>
                
            </tr>
            <s:iterator value="lista5" var="unElem">
            <s:url action="PasarValoresCanvas.action" var="url1">
            <s:param name="id">
                <s:property value="%{#unElem[0]}"/>
            </s:param>
            </s:url>
            <s:url action="" var="url">
            <s:param name="id">
                <s:property value="" />
            </s:param>
            </s:url>
            
            <tr>
                <td><s:property value="%{#unElem[0]}"/></td>
                <td><s:property value="%{#unElem[1]}"/></td>
                <td><s:property value="%{#unElem[2]}"/></td>
                <td><s:property value="%{#unElem[3]}"/></td>
                <td><s:property value="%{#unElem[4]}"/></td>
            
        </s:iterator>
                <td><a href="<s:property value="#url1" />">Modificar canvas</a></td>
            </tr>
        
       
        </table>
            
               </body>
</html>