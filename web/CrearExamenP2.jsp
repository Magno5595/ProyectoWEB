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
        
        
        <label>Examen lectura</label>
        <s:form action="AddExamenlectura.action" >
            
            <sx:autocompleter size="1" list="lista4" name="examenes"></sx:autocompleter>
            <s:textfield name="descripcion" key="Que tienen que hacer?"/>
            
            <s:textfield name="pregunta1" key="Pregunta 1"/>
            
            
            <s:textfield name="respuesta1" key="respuesta 1"/>
            <s:textfield name="respuesta2" key="respuesta 2"/>
            <s:textfield name="respuesta3" key="respuesta 3"/>
            <s:textfield name="respuesta4" key="respuesta 4"/>
            <s:checkbox name="si1" key="respuesta 1 correcta?"/>
            <s:checkbox name="si2" key="respuesta 2 correcta?"/>
            <s:checkbox name="si3" key="respuesta 3 correcta?"/>
            <s:checkbox name="si4" key="respuesta 4 correcta?"/>
            
            <s:submit value="Crear" />
            <s:actionmessage  />
        </s:form>
    
        
            <label>Examen escritura</label>

        <s:form action="AddExamenescritura.action" >
            <sx:autocompleter size="1" list="lista4" name="examenes"></sx:autocompleter>
            <s:textfield name="descripcion" key="Que tiene que hacer?"/>
            <s:submit value="Crear" />
            <s:actionmessage  />
        </s:form>
    </body>
</html>
