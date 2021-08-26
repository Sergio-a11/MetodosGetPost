/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.dao.ContactoDAO;
import modelo.dto.ContactoDTO;

/**
 *
 * @author Sergio Cruz
 */
public class ContactoCTO extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String accion = request.getParameter("accion");
        ContactoDAO dao = new ContactoDAO();
        switch (accion) {
            case "agregar": {
                String nombre = request.getParameter("txtnombre");
                String email = request.getParameter("txtemail");
                String asunto = request.getParameter("txtasunto");
                String mensaje = request.getParameter("txtcomentario");

                ContactoDTO dto = new ContactoDTO(nombre, email, asunto, mensaje);

                boolean res = dao.crear(dto);

                if (res) {
                    PrintWriter out = response.getWriter();
                    out.println("<html><head><title>Respuesta</title></head>");
                    out.println("<body><h1>Mensaje Enviado Exitosamente</h1>"
                            + "<a href=\"index.jsp\">HOME</a>"
                            + "</body></html>");
                }
                break;
            }

            case "listar": {
                List<ContactoDTO> lista = dao.readAll();

                PrintWriter out = response.getWriter();
                out.println("<html><head><title>Respuesta</title>");
                out.println("<style>table, th, td { border: 1px solid black; border-collapse: collapse; padding: 5px; } th, td{ padding: 15px; }</style>");
                out.println("</head><body><table><caption>Lista de mensajes</caption>");
                out.println("<th>Nombre</th>");
                out.println("<th>Email</th>");
                out.println("<th>Asunto</th>");
                out.println("<th>Comentario</th>");
                for (ContactoDTO i : lista) {
                    out.println("<tr>");
                    out.println("<td>" + i.getNombre() + "</td>");
                    out.println("<td>" + i.getEmail() + "</td>");
                    out.println("<td>" + i.getAsunto()+ "</td>");
                    out.println("<td>" + i.getComentario() + "</td>");
                    out.println("</tr>");
                }
                out.println("</table></body></html>");

                break;
            }
        }
    }

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
        processRequest(request, response);
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
        processRequest(request, response);
        //request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "re loco";
    }// </editor-fold>

}
