<jsp:useBean class="model.Student"  id="s" />
<%@page  import="dao.StudentDao" %>
<jsp:setProperty  name="s" property="*" />

<%
        
        int result=StudentDao.saveStu(s);
        if(result > 0){
             response.sendRedirect("index.jsp");
    
            }
            else{
    response.sendRedirect("error.jsp");
    }


%>
