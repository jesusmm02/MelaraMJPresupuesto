package es.albarregas.controllers;

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
@WebServlet(name = "ControladorEleccion", urlPatterns = {"/ControladorEleccion"})
public class ControladorEleccion extends HttpServlet {

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
        
        try {

            String[] seguros = request.getParameterValues("seguro");

            if (seguros != null && seguros.length > 0) {
                for (String seguro : seguros) {
                    switch (seguro) {
                        case "edificios":
                            request.getRequestDispatcher("../JSP/edificios.jsp").forward(request, response);
                            return;
                        case "contenido":
                            request.getRequestDispatcher("../JSP/contenido.jsp").forward(request, response);
                            return;
                    }
                }
            } else {
                // Si la opción seleccionada no es válida o no se selecciona ninguna, redirige a una página de error o a la página principal.
                request.getRequestDispatcher("../JSP/error.jsp").forward(request, response);
            } 
        } catch(NullPointerException e){
        // Manejo de cualquier otra excepción que pueda ocurrir
        request.getRequestDispatcher("../JSP/error.jsp").forward(request, response);
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
