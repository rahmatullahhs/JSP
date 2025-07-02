<jsp:useBean class="model.Student"  id="s" />
<%@page  import="dao.StudentDao" %>
<jsp:setProperty  name="s" property="*" />

<%
        
      StudentDao.deletEmp(s.getId());
       
      response.sendRedirect("index.jsp");
    
           


%>
