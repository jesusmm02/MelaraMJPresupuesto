package es.albarregas.controllers;

import es.albarregas.beans.EleccionBean;

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
        
        EleccionBean eleccion = new EleccionBean();

        try {

            String[] seguros = request.getParameterValues("seguro");

            if (seguros != null && seguros.length > 0) {
                int[] eleccionSeguros = new int[seguros.length];
                
                for (int i = 0; i < seguros.length; i++) {
                    
                    switch (seguros[i]) {
                        case "edificios":
                            eleccionSeguros[i] = 1;
                            request.getRequestDispatcher("./JSP/edificios.jsp").forward(request, response);
                            return;
                        case "contenido":
                            eleccionSeguros[i] = 2;
                            request.getRequestDispatcher("./JSP/contenido.jsp").forward(request, response);
                            return;
                    }
                }
                eleccion.setEleccion(eleccionSeguros);
            } else {
                request.getRequestDispatcher("../JSP/index.jsp").forward(request, response);
            }
        } catch (NullPointerException e) {
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
