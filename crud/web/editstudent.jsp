<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.Employee" %>

<%
    Employee e = (Employee) request.getAttribute("employee");
%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Edit Employee - Kora Style</title>
        <style>
            body {
                font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
                background-color: #f4f6f8;
                margin: 0;
                padding: 20px;
                color: #333;
            }
            .container {
                max-width: 500px;
                margin: 50px auto;
                background-color: #fff;
                padding: 30px;
                border-radius: 10px;
                box-shadow: 0 4px 8px rgba(0,0,0,0.05);
            }
            h2 {
                text-align: center;
                margin-bottom: 25px;
                color: #444;
            }
            label {
                display: block;
                margin-top: 15px;
                font-weight: bold;
            }
            input[type="text"],
            input[type="number"] {
                width: 100%;
                padding: 10px;
                margin-top: 5px;
                border: 1px solid #ccc;
                border-radius: 5px;
                font-size: 14px;
            }
            button {
                width: 100%;
                padding: 12px;
                background-color: #0066cc;
                color: white;
                border: none;
                border-radius: 5px;
                font-size: 16px;
                margin-top: 20px;
                cursor: pointer;
                transition: background-color 0.3s;
            }
            button:hover {
                background-color: #004c99;
            }
            .back-link {
                display: block;
                text-align: center;
                margin-top: 15px;
                text-decoration: none;
                color: #0066cc;
                font-size: 14px;
            }
            .back-link:hover {
                text-decoration: underline;
            }
        </style>
    </head>
    <body>
        <div class="container">
            <h2>Edit Employee</h2>
            <form action="employeeservlet" method="post">
                <input name="id" type="hidden" value="<%= e.getId() %>">
                <input name="action" type="hidden" value="update">

                <label for="name">Name</label>
                <input name="name" type="text" id="name" value="<%= e.getName() %>" placeholder="Enter name" required>

                <label for="designation">Designation</label>
                <input name="designation" type="text" id="designation" value="<%= e.getDesignation() %>" placeholder="Enter designation" required>

                <label for="salary">Salary</label>
                <input name="salary" type="number" id="salary" value="<%= e.getSalary() %>" placeholder="Enter salary" required>

                <button type="submit">Update Employee</button>
            </form>
            <a href="index.jsp" class="back-link">← Back to Employee List</a>
        </div>
    </body>
</html>