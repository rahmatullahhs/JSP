<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="model.Student"%>
<%@page import="dao.StudentDao"%>
<%@page import="java.util.*"%>

<%@include file="header.jsp" %>

<%
    List<Student> list = StudentDao.getAllstudent();
    request.setAttribute("list", list);
%>

  <style>
   
        body {
            font-family: Arial, sans-serif;
            padding: 20px;
        }
        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }
        th, td {
            border: 1px solid #ccc;
            padding: 10px;
            text-align: left;
        }
        th {
            background-color: #f4f4f4;
        }
        .actions button {
            margin-right: 5px;
            padding: 5px 10px;
        }
    </style>
</head>
<body>

    <h2>Student List</h2>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Subject</th>
                <th>Fee</th>
                <th>Actions</th>
            </tr>
        </thead>
        <tbody>
            <tbody>
                    <c:forEach items="${list}" var="s">
                        <tr>
                            <td>${s.id}</td>
                            <td>${s.name}</td>
                            <td>${s.email}</td>
                            <td>${s.subject}</td>
                            <td>$${s.fee}</td>
                            <td>
                                <div class="btn-group" role="group">
                                    <a href="editStuForm.jsp?id=${s.id}" class="btn btn-sm btn-outline-primary">Edit</a>
                                    <a href="deletStu.jsp?id=${s.id}" 
                                       class="btn btn-sm btn-outline-danger"
                                       onclick="return confirm('Are you sure you want to delete this Student?');">Delete</a>
                                </div>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
    </table>


<%@include file="footer.jsp" %>
