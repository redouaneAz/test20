package controleur;
import actions.ActionDebut;
import actions.LoginAction;
import actions.ActionUn;
import actions.LogoutAction;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ActionServlet
 */
public class ActionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 System.out.println("suis dans ActionServlet");
		 
		 String provenance = request.getServletPath();
		 
		 System.out.println(provenance);
		 
		 Action log = null;
		 
		 if(provenance.equals("/LoginAction.do")){
			 
			  log = new LoginAction();
		 }
		 
		 	if(provenance.equals("/ActionUn.do")){
			 
			  log = new ActionUn();
		 }
		 	
		 	if(provenance.equals("/LougoutAction.do")){
				 
				  log = new LogoutAction();
			 }
		 	if(provenance.equals("/index.html")){
				 
				  log = new ActionDebut();
			 }
		 	
		 	String jspDeSuite = log.execute(request,response);
		 	request.getServletContext().getRequestDispatcher(jspDeSuite).forward(request, response);
	}

}
