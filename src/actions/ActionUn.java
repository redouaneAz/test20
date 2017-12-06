package actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controleur.Action;

public class ActionUn implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		return "/Page1.jsp";
	}

}
