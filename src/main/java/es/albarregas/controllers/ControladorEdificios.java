package es.albarregas.controllers;

import es.albarregas.beans.EdificioBean;
import es.albarregas.beans.EleccionBean;

import es.albarregas.models.CalcularCuota;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Jesús
 */
@WebServlet(name = "ControladorEdificios", urlPatterns = {"/ControladorEdificios"})
public class ControladorEdificios extends HttpServlet {


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
        
        EdificioBean edificio = new EdificioBean();

        try {
            // Recuperar los valores seleccionados en el formulario
            String tipoEdificio = request.getParameter("tipoEdificio");
            String numHabitaciones = request.getParameter("numHabitaciones");
            String fechaConstruccion = request.getParameter("fechaConstruccion");
            int tipoConstruccion = Integer.parseInt(request.getParameter("tipoConstruccion"));
            String valorMercado = request.getParameter("valorMercado");

            // Asignar los valores al bean
            edificio.setTipoEdificio(new String[]{tipoEdificio});
            edificio.setNumHabitaciones(new String[]{numHabitaciones});
            edificio.setFechaConstruccion(new String[]{fechaConstruccion});
            edificio.setTipoConstruccion(new int[]{tipoConstruccion});
            edificio.setValorMercado(new String[]{valorMercado});

            // Setear el bean como atributo de solicitud para pasar los datos a las JSP
            request.setAttribute("edificio", edificio);
            
            // Obtener la elección del usuario
            EleccionBean eleccion = (EleccionBean) request.getSession().getAttribute("eleccion");

            if (eleccion != null && eleccion.getEleccion() != null) {
                // Si se ha seleccionado solo el seguro de edificios
                if (eleccion.getEleccion()[0] == 1) {
                    request.getRequestDispatcher("./ControladorSeguros").forward(request, response);
                } 
                // Si se han seleccionado ambos seguros
                else if (eleccion.getEleccion()[0] == 3) {
                    // Guardar el bean de edificio en la sesión para usarlo más tarde
                    request.getSession().setAttribute("edificio", edificio);
                    // Redirigir al formulario de contenido
                    request.getRequestDispatcher("./JSP/formularioContenido.jsp").forward(request, response);
                }
            }
        } catch (Exception e) {
            // Manejo de cualquier otra excepción que pueda ocurrir
            request.getRequestDispatcher("../JSP/index.jsp").forward(request, response);
        }
        
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
