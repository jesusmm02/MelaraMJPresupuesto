package es.albarregas.controllers;

import es.albarregas.beans.ContenidoBean;
import es.albarregas.beans.EdificioBean;

import es.albarregas.models.CalcularCuota;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesús
 */
@WebServlet(name = "ControladorSeguros", urlPatterns = {"/ControladorSeguros"})
public class ControladorSeguros extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // Recuperar los datos de los beans
        EdificioBean edificio = (EdificioBean) request.getAttribute("edificio");
        ContenidoBean contenido = (ContenidoBean) request.getAttribute("contenido");
        
        // Variables para almacenar los resultados de los cálculos
        double cuotaEdificio = 0.0;
        double cuotaContenido = 0.0;
        double cuotaTotal = 0.0;
        
        // Calcular la cuota del seguro de edificios si se ha seleccionado
        if (edificio != null) {
            cuotaEdificio = CalcularCuota.calcularCuotaContinente(edificio.getTipoEdificio()[0], Integer.parseInt(edificio.getNumHabitaciones()[0]),
                    Integer.parseInt(edificio.getFechaConstruccion()[0]), edificio.getTipoConstruccion()[0] == 1 ? "madera" : "hormigon",
                    Double.parseDouble(edificio.getValorMercado()[0]));
        }
        
        // Calcular la cuota del seguro de contenido si se ha seleccionado
        if (contenido != null) {
            cuotaContenido = CalcularCuota.calcularCuotaContenido(contenido.isCubrirDanos(), Double.parseDouble(contenido.getCantidadASegurar()[0]),
                    contenido.getFranquicia()[0]);
        }
        
        // Calcular la cuota total
        cuotaTotal = cuotaEdificio + cuotaContenido;
        
        // Pasar los resultados a la vista JSP
        request.setAttribute("cuotaEdificio", cuotaEdificio);
        request.setAttribute("cuotaContenido", cuotaContenido);
        request.setAttribute("cuotaTotal", cuotaTotal);
        
        // Redirigir a la vista para mostrar los resultados
        request.getRequestDispatcher("./JSP/resultadoSeguros.jsp").forward(request, response);
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
