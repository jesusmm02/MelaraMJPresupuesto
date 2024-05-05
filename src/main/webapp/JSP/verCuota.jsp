<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="bootstrap-5.3.3-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file="../INC/cabecera.inc"%>
        <div style="margin-left: 20px">
            <h2 style="text-align: center">Resultado de Seguros</h2>
            <% if (request.getAttribute("cuotaEdificio") != null && (double)request.getAttribute("cuotaEdificio") > 0) { %>
                <p>Cuota del seguro de edificios: <%= request.getAttribute("cuotaEdificio") %></p>
            <% } %>
            <% if (request.getAttribute("cuotaContenido") != null && (double)request.getAttribute("cuotaContenido") > 0) { %>
                <p>Cuota del seguro de contenido: <%= request.getAttribute("cuotaContenido") %></p>
            <% } %>
            <% if (request.getAttribute("cuotaTotal") != null && (double)request.getAttribute("cuotaTotal") > 0) { %>
                <p>Cuota total: <%= request.getAttribute("cuotaTotal") %></p>
            <% } %>
        </div>
        <%@include file="../INC/pie.inc"%>
    </body>
</html>
