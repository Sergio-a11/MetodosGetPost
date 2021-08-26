<%-- 
    Document   : usuarioVTA
    Created on : 19/08/2021, 09:18:16 AM
    Author     : Sergio Cruz
--%>

<%@page import="modelo.dto.UsuarioDTO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Usuarios</title>
    </head>
    <body>
        <h1>Lista de usarios</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Usuario</th>
                    <th>Correo</th>
                    <th>Rol</th>
                </tr>
            </thead>
            <tbody>
                
                    <% Object lista = request.getAttribute("lista"); 
                    if(lista != null)
                    {
                        List<Object> listObj = (List) lista; 
                    
                        for(Object i: listObj)
                        {
                            UsuarioDTO usu = (UsuarioDTO)i;
         
                    %>
                    <tr>
                    <td><%=usu.getId()%></td>
                    <td><%=usu.getNombre()%></td>
                    <td><%=usu.getCorreo()%></td>
                    <td><%=usu.getRol()%></td>
                    </tr>
                    <%}
                        }
                        else{%>
            <h2>No hay datos</h2>
                        <%
                        }%>
            </tbody>
        </table>
    </body>
</html>
