<%@taglib  uri="/struts-tags" prefix="s" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <s:form action="Usuarios" >
            <s:textfield name="sid" key="User Name" />
            <s:password name="password" key="Password" />
            <s:submit value="Login" />
            <s:actionmessage  />
        </s:form>
    </body>
</html>