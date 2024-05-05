package es.albarregas.controllers;

import es.albarregas.beans.ContenidoBean;

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
@WebServlet(name = "ControladorContenido", urlPatterns = {"/ControladorContenido"})
public class ControladorContenido extends HttpServlet {


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
        
        ContenidoBean contenido = new ContenidoBean();

        try {
            // Recuperar los valores seleccionados en el formulario
            boolean cubrirDanos = request.getParameter("cubrirDanos") != null;
            String cantidadASegurar = request.getParameter("cantidadASegurar");
            int franquicia = Integer.parseInt(request.getParameter("franquicia"));

            // Asignar los valores al bean
            contenido.setCubrirDanos(cubrirDanos);
            contenido.setCantidadASegurar(new String[]{cantidadASegurar});
            contenido.setFranquicia(new int[]{franquicia});

            // Setear el bean como atributo de solicitud para pasar los datos a las JSP
            request.setAttribute("contenido", contenido);
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
