<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Add New Employee - Kora Style</title>
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
            .form-actions {
                display: flex;
                justify-content: space-between;
                margin-top: 20px;
            }
            button {
                flex: 1;
                padding: 10px;
                font-size: 15px;
                border: none;
                border-radius: 5px;
                cursor: pointer;
                transition: background-color 0.3s;
                color: white;
            }
            .save-btn {
                background-color: #0066cc;
                margin-right: 10px;
            }
            .save-btn:hover {
                background-color: #004c99;
            }
            .reset-btn {
                background-color: #6c757d;
            }
            .reset-btn:hover {
                background-color: #5a6268;
            }
            .back-link {
                display: block;
                text-align: center;
                margin-top: 20px;
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
            <h2>Add New Employee</h2>
            <form action="employeeservlet" method="post">
                <label for="name">Name</label>
                <input name="name" type="text" id="name" placeholder="Enter name" required>

                <label for="designation">Designation</label>
                <input name="designation" type="text" id="designation" placeholder="Enter designation" required>

                <label for="salary">Salary</label>
                <input name="salary" type="number" id="salary" placeholder="Enter salary" required>

                <div class="form-actions">
                    <button name="action" value="save" type="submit" class="save-btn">Save</button>
                    <button type="reset" class="reset-btn">Reset</button>
                </div>
            </form>
            <a href="index.jsp" class="back-link">← Back to Employee List</a>
        </div>
    </body>
</html>