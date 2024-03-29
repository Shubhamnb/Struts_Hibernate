package com.bridge.action;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Result;

import com.bridge.dao.DaoImpl;
import com.bridge.dao.IDao;
import com.bridge.pojo.User;

@Action(value="register",results={@Result(name="success",location="/login.jsp")})
public class RegisterAction {
	private String name;  
	private String email;
	private String contact;
	private String password;
	
	
    public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName()
    {  
       return name;  
     }  
    public void setName(String name) 
    {  
       this.name = name;  
     }  
    public String execute()  
    {  
    	User user =new User();
    	user.setName(name);
    	user.setEmail(email);
    	user.setContact(contact);
    	user.setPassword(password);
    	
    	IDao dao = new DaoImpl();
    	
    	if(dao.register(user))
    		return "success";
    	else
    		return "failure";
     }  
}
