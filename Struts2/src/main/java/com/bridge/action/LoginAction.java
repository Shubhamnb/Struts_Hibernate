package com.bridge.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.bridge.dao.DaoImpl;
import com.bridge.dao.IDao;

@Action(value="login",results={@Result(name="success",location="/result.jsp"),@Result(name="failure",location="/rester.jsp")})  
public class LoginAction {  
	private String email;
	private String password;
	
	
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    public String execute()  
    {  
    	IDao dao = new DaoImpl();
    	if(dao.login(email, password))
    		return "success";
    	else
    		return "failure";
    }  
}
