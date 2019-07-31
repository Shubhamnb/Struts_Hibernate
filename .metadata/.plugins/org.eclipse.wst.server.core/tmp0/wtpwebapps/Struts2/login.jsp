<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
 <html>
   <head>
      <center><h1><font color="green">Login</font></h1></center>
   </head>
   <body>
   <div>
      <s:form action="login" >  
         <s:textfield name="email" label="Email" value=""/>  
         <s:textfield name="password" label="Password" value=""/>  
         <s:submit value="Login"/>  
      </s:form>  
      <a href="register.jsp"><input type="button" value="Register"/></a>
      
      </div>
   </body>
</html> 