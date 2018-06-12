<%@taglib  uri="/struts-tags" prefix="s" %>
<%@taglib prefix="sx" uri="/struts-dojo-tags"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        
        
    
        
            <label>Examen escritura</label>

        <s:form action="pruebamandarcombo.action" >
            <sx:autocompleter size="1" list="lista4" name="examen"></sx:autocompleter>
            
            
            <s:checkbox name="si1" key="respuesta 1 correcta?"/>
            <s:checkbox name="si2" key="respuesta 2 correcta?"/>
            <s:checkbox name="si3" key="respuesta 3 correcta?"/>
            <s:checkbox name="si4" key="respuesta 4 correcta?"/>
            
            <s:submit value="Crear" />
            <s:actionmessage  />
        </s:form>
    </body>
</html>