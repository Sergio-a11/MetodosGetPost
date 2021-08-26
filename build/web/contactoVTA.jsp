<%-- 
    Document   : contactoVTA
    Created on : 17/08/2021, 11:27:13 AM
    Author     : Sergio Cruz
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Página 1</title>
    </head>
    <body>
        <form action="ContactoCTO?accion=agregar" method="POST">
            <fieldset>
                <legend>Datos de contacto</legend>
                <label for="txtnombre">Nombre</label>
                <input type="text" name="txtnombre" required="true">
                <br>
                <label for="txtemail">Correo</label>
                <input type="email" name="txtemail" required="true">
                <br>
                <label for="txtasunto">Asunto</label>
                <input type="text" name="txtasunto" required="true">
                <br>
                <label for="txtcomentario">Comentario</label>
                <textarea name="txtcomentario" required="true"></textarea>
                <br>
                <input type="submit" value="Eviar Comentario">
                <input type="reset" value="Limpiar">
            </fieldset>
        </form>
    </body>
</html>