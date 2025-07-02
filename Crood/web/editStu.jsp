<jsp:useBean class="model.Student"  id="rahmat" />
<%@page  import="dao.StudentDao" %>
<jsp:setProperty  name="rahmat" property="*" />

<%
        
        int result=StudentDao.updateStudent(rahmat);
        if(result > 0){
             response.sendRedirect("index.jsp");
    
            }
            else{
    response.sendRedirect("error.jsp");
    }


%>
