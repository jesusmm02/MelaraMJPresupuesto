<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Seguros de hogar</title>
        <link href="bootstrap-5.3.3-dist/css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file="../INC/cabecera.inc"%>
        <form action="<%=request.getContextPath()%>/ControladorContenido">
            <div>
                <h2 style="text-align: center">Póliza de contenidos</h2>
                <p><strong>*Inserte la información de su contenido, y a continuación, haga clic en el botón Enviar*</strong></p>
                
                <label class="form-label" style="font-weight: bold">Cubrir daños accidentales</label>
                <div class="form-check">
                    <input class="form-check-input" type="checkbox" value="" id="flexCheckDefault">
                    <label class="form-check-label" for="flexCheckDefault"></label>
                </div>
                
                <label class="form-label" style="font-weight: bold">Cantidad que requiere asegurar:</label>
                <select class="form-select" aria-label="Default select example">
                    <option value="10000" selected>10000</option>
                    <option value="20000">20000</option>
                    <option value="30000">30000</option>
                    <option value="50000">50000</option>
                    <option value="100000">100000</option>
                </select>
                
                <label class="form-label" style="font-weight: bold">Franquicia</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1" checked>
                    <label class="form-check-label" for="flexRadioDefault1">
                      Ninguna
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2">
                    <label class="form-check-label" for="flexRadioDefault2">
                      500
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2">
                    <label class="form-check-label" for="flexRadioDefault2">
                      1000
                    </label>
                </div>
 
                
                <button class="btn btn-primary" type="submit" style="margin-right: 20px">Enviar</button>
                
            </div>
        </form>
        <%@include file="../INC/pie.inc"%>
    </body>
</html>
