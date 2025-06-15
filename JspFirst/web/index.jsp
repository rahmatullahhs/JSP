<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Employee"%>
<%@page import="dao.EmpDao"%>
<%@page import="java.util.*"%>


<%@include file="header.jsp" %>


<%

    List<Employee> list = EmpDao.getAllemployee();
    request.setAttribute("list", list);

%>

<div class="container">



    <h1 class="text-primary text-center">All Employees</h1> 

    <table class="table table-striped">

        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Role</th>
                <th>Salary</th>
            </tr>
        </thead>

        <tbody>
            <c:forEach items="${list}" var="s">
                <tr>
                    <td>${s.getId()}</td>
                    <td>${s.getName()}</td>
                    <td>${s.getEmail()}</td>
                    <td>${s.getRole()}</td>
                    <td>${s.getSalary()}</td>
                    <td>
                        <button type="submit" class="btn btn-primary">Edit</button>
                        <button type="submit" class="btn btn-warning">Delete</button>
                    </td>

                </tr>

            </c:forEach>

        </tbody>


    </table>

</div>





<%@include file="footer.jsp" %>