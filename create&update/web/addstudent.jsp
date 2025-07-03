<jsp:useBean class="model.student"  id="s" />
<%@page  import="dao.studentdao" %>
<jsp:setProperty  name="s" property="*" />

<%
        
        int result=studentdao.saveStudent(s);
        if(result > 0){
             response.sendRedirect("index.jsp");
    
            }
            else{
    response.sendRedirect("error.jsp");
    }


%>