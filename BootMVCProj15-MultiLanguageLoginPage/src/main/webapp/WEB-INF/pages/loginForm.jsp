<%@ page isELIgnored="false" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="sp"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="frm"%>

<h1 style="color:red; text-align:center; "><sp:message code="login.title"/></h1>

<frm:form action="login" modelAttribute="signup">

<table align="center" bgcolor="cyan">
  <tr>
     <td><sp:message code="login.username"/></td>
     <td><frm:input path="username"/></td>
  </tr>
  
  <tr>
     <td><sp:message code="login.password"/></td>
     <td><frm:input path="password"/></td>
  </tr>
    
  <tr>
     <td><input type="submit" value="<sp:message code='login.submit'/>"/></td>
     <td><input type="reset" value="Cancel"/></td>
  </tr>
</table>  
</frm:form>

<br>

<center>

<a href="?lang=en_US">English</a> &nbsp;  <a href="?lang=hi_IN">हिंदी</a>

</center>
