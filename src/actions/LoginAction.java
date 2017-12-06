package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controleur.Action;

public class LoginAction implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
System.out.println("suis dans LoginAction");
		
		
		String nom = request.getParameter("login");
		
		
		if(nom.equals("titi")){
			return "/Page1.jsp";
		}
		else {
			
			return "/erreur.jsp";
		}
	}

	
	
}
