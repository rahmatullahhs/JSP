<jsp:useBean class="model.Employee"  id="parvej" />
<%@page  import="dao.EmpDao" %>
<jsp:setProperty  name="parvej" property="*" />

<%
        
        int result=EmpDao.updateEmployee(parvej);
        if(result > 0){
             response.sendRedirect("index.jsp");
    
            }
            else{
    response.sendRedirect("error.jsp");
    }


%>
