<jsp:useBean class="model.Employee"  id="s" />
<%@page  import="dao.EmpDao" %>
<jsp:setProperty  name="s" property="*" />

<%
        
        int result=EmpDao.saveEmp(s);
        if(result > 0){
             response.sendRedirect("index.jsp");
    
            }
            else{
    response.sendRedirect("error.jsp");
    }


%>