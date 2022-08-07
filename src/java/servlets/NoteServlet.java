
package servlets;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.File;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import packages.Note;

/**
 *
 * @author Kaden
 */
public class NoteServlet extends HttpServlet {

  
 @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
              String path = getServletContext().getRealPath("/WEB-INF/note.txt");
              // to read files
              BufferedReader br = new BufferedReader(new FileReader(new File(path)));
              String title = br.readLine();
              String content = br.readLine();
              Note notes = new Note(title, content);
              br.close();
              request.setAttribute("note", notes);
              if(request.getParameter("edit")==null){
                  getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
                  return;
              }
              else{
                   getServletContext().getRequestDispatcher("/WEB-INF/editnote.jsp").forward(request, response);
                  return; 
              }

    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String title = request.getParameter("title");
        String content = request.getParameter("content");
        
        Note notes = new Note(title, content);
        request.setAttribute("note", notes);
        
        
        String path = getServletContext().getRealPath("/WEB-INF/note.txt");
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(path, false)));
       
        pw.println(title);
        pw.println(content);
        pw.close();
   
        getServletContext().getRequestDispatcher("/WEB-INF/viewnote.jsp").forward(request, response);
        return;
    }

   
}