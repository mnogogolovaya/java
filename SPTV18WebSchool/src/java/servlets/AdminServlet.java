/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entity.Person;
import entity.Journal;
import entity.Subject;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import java.util.Calendar;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import session.PersonFacade;
import session.JournalFacade;
import session.SubjectFacade;

/**
 *
 * @author User
 */
@WebServlet(name = "AdminServlet",loadOnStartup = 1, urlPatterns = {
    "/addPerson",
    "/showNewPerson",
    "/addSubject",
    "/showNewSubject",
    "/addJournal",
    "/showNewJournal",
})
public class AdminServlet extends HttpServlet {
@EJB private PersonFacade personFacade;
@EJB private SubjectFacade subjectFacade;
@EJB private JournalFacade journalFacade;

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
        response.setContentType("text/html;charset=UTF-8");
        request.setCharacterEncoding("UTF-8");
            switch (request.getServletPath()) {
                case "/showNewSubject":
                    request.getRequestDispatcher("/showNewSubject.jsp")
                            .forward(request, response);
                    break;
                case "/addSubject":
                    String subjectName = request.getParameter("subjectName");
                    String hours = request.getParameter("hours");
                    if(subjectName == null || "".equals(subjectName)
                            || hours == null || "".equals(hours)){
                        request.setAttribute("subjectName", subjectName);
                        request.setAttribute("hours", hours);
                        request.setAttribute("info", "Заполните все поля!");
                        request.getRequestDispatcher("/showNewSubject.jsp")
                                .forward(request, response);
                }
                Subject subject = new Subject();
                subject.setSubjectName(subjectName);
                subject.setHours(Integer.parseInt(hours));
                subjectFacade.create(subject);
                request.setAttribute("info", "Предмет \""+subject.getSubjectName()+"\" добавлен в базу");
                request.getRequestDispatcher("/index")
                        .forward(request, response);
                    break;
                case "/showNewPerson":
                    request.getRequestDispatcher("/showNewPerson.jsp")
                            .forward(request, response);
                    break;
                case "/addPerson":
                    String firstName = request.getParameter("firstName");
                    String secondName = request.getParameter("secondName");
                    String status = request.getParameter("status");
                    if(firstName == null || "".equals(firstName)
                            || secondName == null || "".equals(secondName)
                            || status == null || "".equals(status)){
                        request.setAttribute("firstName", firstName);
                        request.setAttribute("lastName", secondName);
                        request.setAttribute("phone", status);
                        request.setAttribute("info", "Заполните все поля!");
                        request.getRequestDispatcher("/showNewPerson.jsp")
                                .forward(request, response);
                }
                Person person = null;
                try{
                    person = new Person(firstName, secondName, status);
                    personFacade.create(person);
                } catch(Exception e) {
                    if(person != null){
                        personFacade.remove(person);
                    }
                }
                request.setAttribute("info", "Человек \""+person.getFirstName()+" "+
                    person.getSecondName()+" "+
                    person.getStatus()+"\" добавлена в базу");
                request.getRequestDispatcher("/index")
                        .forward(request, response);
                    break;
                case "/showNewJournal":
                List<Person> listPersons = personFacade.findAll();
                List<Subject> listSubjects = subjectFacade.findAll();
                request.setAttribute("listPersons", listPersons);
                request.setAttribute("listSubjects", listSubjects);
                request.getRequestDispatcher("/showNewJournal.jsp")
                        .forward(request, response);
                    break;
                /*case "/addJournal":
                String personId = request.getParameter("personId");
                String subjectId = request.getParameter("subjectId");
                if(personId == null || "".equals(personId)
                        || subjectId == null || "".equals(subjectId)){
                    request.setAttribute("personId", personId);
                    request.setAttribute("subjectId", subjectId);
                    request.setAttribute("info", "Выберите и читателя и книгу");
                }
                request.getRequestDispatcher("/index")
                            .forward(request, response);
                    break;*/
                case "/addJournal":
                    String personId = request.getParameter("personId");
                    String subjectId = request.getParameter("subjectId");
                    String mark = request.getParameter("mark");
                    if(personId == null || "".equals(personId)
                         ||subjectId == null || "".equals(subjectId)
                         ||mark == null || "".equals(mark)){
                    request.setAttribute("personid", personId);
                    request.setAttribute("subjectid", subjectId);
                    request.setAttribute("mark", mark);
                    request.setAttribute("info", "Выберите и ученика и предмет");
                    request.getRequestDispatcher("/showNewJournal")
                            .forward(request, response);
                }
                person = personFacade.find(Long.parseLong(personId));
                subject = subjectFacade.find(Long.parseLong(subjectId));
                    Journal journal = new Journal(mark, person, subject);
                    journalFacade.create(journal);
                    request.setAttribute("info", "Ученику "
                                            + person.getFirstName()
                                            + " "
                                            + person.getSecondName()
                                            + " по предмету"
                                            + subject.getSubjectName()
                                            + " была поставлена оценка"
                                            + journal.getMark()
                                    );

                request.getRequestDispatcher("/index")
                            .forward(request, response);
                break;
                
                
            
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
