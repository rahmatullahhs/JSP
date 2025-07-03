<jsp:useBean class="model.student"  id="s" />
<%@page  import="dao.studentdao" %>
<jsp:setProperty  name="s" property="*" />

<%
        
      studentdao.deleteStudent(s.getId());
       
      response.sendRedirect("index.jsp");
    
           


%>