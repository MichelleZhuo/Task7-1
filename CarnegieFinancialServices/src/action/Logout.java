package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Logout extends ActionSupport{
	public String out(){
		ActionContext.getContext().getSession().put("username", "");
		return "out";
	}

}
