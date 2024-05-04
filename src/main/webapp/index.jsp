<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seguros de hogar</title>
        <link href="bootstrap-5.3.3-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file="INC/cabecera.inc"%>
        <form action="<%=request.getContextPath()%>/ControladorEleccion" method="POST">
            <div style="margin-left: 20px">
                <h2 style="text-align: center">Elije un seguro</h2>
                <p><strong><em>*ES NECESARIO ELEGIR AL MENOS UN TIPO DE SEGURO*</em></strong></p>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" name="seguro" value="edificios" id="flexCheckDefault" checked>
                    <label class="form-check-label" for="flexCheckDefault">
                      Seguro de edificios
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" name="seguro" value="contenido" id="flexCheckChecked" checked>
                    <label class="form-check-label" for="flexCheckChecked">
                      Seguro de contenido
                    </label>
                </div>
                
                <button class="btn btn-primary" type="submit" style="margin-right: 20px; margin-bottom: 10px">Enviar</button>
                
            </div>
        </form>
        <%@include file="INC/pie.inc"%>
    </body>
</html>
