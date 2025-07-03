<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Employee"%>
<%@page import="dao.EmpDao"%>
<%@page import="java.util.*"%>

<%@include file="header.jsp" %>

<%
    List<Employee> list = EmpDao.getAllemployee();
    request.setAttribute("list", list);
%>

<!-- Load Google Font -->
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;600&display=swap" rel="stylesheet">

<!-- Extra Custom Styles -->
<!--<style>
    body {
        font-family: 'Poppins', sans-serif;
        background: linear-gradient(135deg, #e0c3fc, #8ec5fc);
        min-height: 100vh;
        padding-top: 50px;
    }

    .card-custom {
        background: rgba(255, 255, 255, 0.85);
        border-radius: 15px;
        padding: 30px;
        box-shadow: 0 10px 30px rgba(0, 0, 0, 0.1);
    }

    h1 {
        font-weight: 600;
        text-shadow: 1px 1px 3px #00000022;
    }

    .table thead {
        background-color: #007bff;
        color: white;
    }

    .table td, .table th {
        vertical-align: middle;
    }

    .btn-outline-primary:hover {
        background-color: #007bff;
        color: white;
    }

    .btn-outline-danger:hover {
        background-color: #dc3545;
        color: white;
    }

    .btn-group .btn {
        margin-right: 5px;
    }

    .table-hover tbody tr:hover {
        background-color: #f1f1f1;
    }
</style>-->

<!-- Main Content -->
<div class="container">

    <div class="card-custom">
        <h1 class="text-center text-primary mb-4"> Our Employees </h1>
<a class="nav-link" href="addEmpForm.jsp"><i class="bi bi-person-plus-fill me-1"></i>Register EMP</a>
        <div class="table-responsive">
            <table class="table table-striped table-hover align-middle rounded overflow-hidden">

                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Email</th>
                        <th>Role</th>
                        <th>Salary</th>
                        <th>Actions</th>
                    </tr>
                </thead>

                <tbody>
                    <c:forEach items="${list}" var="s">
                        <tr>
                            <td>${s.id}</td>
                            <td>${s.name}</td>
                            <td>${s.email}</td>
                            <td>${s.role}</td>
                            <td>$${s.salary}</td>
                            <td>
                                <div class="btn-group" role="group">
                                    <a href="editEmpform.jsp?id=${s.id}" class="btn btn-sm btn-outline-primary">Edit</a>
                                    <a href="deleteEmp.jsp?id=${s.id}" 
                                       class="btn btn-sm btn-outline-danger"
                                       onclick="return confirm('Are you sure you want to delete this employee?');">Delete</a>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>

            </table>
        </div>
    </div>

</div>

<%--<%@include file="footer.jsp" %>--%>
