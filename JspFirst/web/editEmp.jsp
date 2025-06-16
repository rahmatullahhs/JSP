<jsp:useBean class="model.Employee"  id="rahmat" />
<%@page  import="dao.EmpDao" %>
<jsp:setProperty  name="rahmat" property="*" />

<%
        
        int result=EmpDao.updateEmployee(rahmat);
        if(result > 0){
             response.sendRedirect("index.jsp");
    
            }
            else{
    response.sendRedirect("error.jsp");
    }


%>
