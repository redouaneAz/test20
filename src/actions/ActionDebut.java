package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controleur.Action;

public class ActionDebut implements Action{

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		return "/Login.jsp";
	}

}
