<jsp:useBean class="model.student"  id="parvej" />
<%@page  import="dao.studentdao" %>
<jsp:setProperty  name="parvej" property="*" />

<%
        
        int result=studentdao.updateStudent(parvej);
        if(result > 0){
             response.sendRedirect("index.jsp");
    
            }
            else{
    response.sendRedirect("error.jsp");
    }


%>