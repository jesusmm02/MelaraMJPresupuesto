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
        <form action="<%=request.getContextPath()%>/ControladorEdificios">
            <div style="margin-left: 20px">
                <h2 style="text-align: center">Póliza de edificios</h2>
                <p><em>*Inserte la información de su hogar, y a continuación, haga clic en el botón <strong>Enviar</strong>*</em></p>
                
                <label class="form-label" style="font-weight: bold">Tipo de edificio:</label>
                <select class="form-select" aria-label="Default select example">
                    <option value="1" selected>Piso</option>
                    <option value="2">Casa</option>
                    <option value="3">Adosado</option>
                    <option value="4">Duplex</option>
                    <option value="5">Chalet</option>
                </select>
                
                <label class="form-label" style="font-weight: bold">Número de habitaciones:</label>
                <select class="form-select" aria-label="Default select example">
                    <option value="1" selected>1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                    <option value="5">Más de 5</option>
                </select>
                
                <label class="form-label" style="font-weight: bold">Fecha de construcción:</label>
                <select class="form-select" aria-label="Default select example">
                    <option value="1949" selected>Antes de 1950</option>
                    <option value="1950">1950-1990</option>
                    <option value="1991">1991-2005</option>
                    <option value="2006">2006-2015</option>
                    <option value="2016">Después de 2015</option>
                </select>
                
                <label class="form-label" style="font-weight: bold">Tipo de construcción:</label>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault1" checked>
                    <label class="form-check-label" for="flexRadioDefault1">
                      Madera
                    </label>
                </div>
                <div class="form-check">
                    <input class="form-check-input" type="radio" name="flexRadioDefault" id="flexRadioDefault2">
                    <label class="form-check-label" for="flexRadioDefault2">
                      Hormigón
                    </label>
                </div>
                
                <label class="form-label" style="font-weight: bold">Valor estimado en el mercado:</label>
                <select class="form-select" aria-label="Default select example">
                    <option value="25000" selected>Menos de 50000</option>
                    <option value="50001">50001-80000</option>
                    <option value="80001">80001-100000</option>
                    <option value="100001">100001-150000</option>
                    <option value="125000">Más de 150000</option>
                </select>
                
                <button class="btn btn-primary" type="submit" style="margin-right: 20px; margin-bottom: 10px">Enviar</button>
                
            </div>
        </form>
        <%@include file="../INC/pie.inc"%>
    </body>
</html>
