<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
 <html>
   <head>
      <center><h1><font color="green">Register</font></h1></center>
   </head>
   <body>
      <s:form action="register" >  
         <s:textfield name="name" label="Name" />  
         <s:textfield name="email" label="Email" />  
         <s:textfield name="contact" label="Contact" />  
         <s:textfield name="password" label="Password" />  
         <s:submit value="submit"/>  
      </s:form>  
   </body>
</html> 