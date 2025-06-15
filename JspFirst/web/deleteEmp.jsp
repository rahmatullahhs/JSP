<jsp:useBean class="model.Employee"  id="s" />
<%@page  import="dao.EmpDao" %>
<jsp:setProperty  name="s" property="*" />

<%
        
      EmpDao.deletEmp(s.getId());
       
      response.sendRedirect("index.jsp");
    
           


%>