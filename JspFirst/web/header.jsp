<!doctype html>
<html lang="en">
    <head>

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">

        <title>jsp</title>

        <style>
            .navbar-custom {
                background: linear-gradient(90deg, #00c6ff, #0072ff);
            }

            .navbar-brand {
                font-weight: bold;
                font-size: 1.4rem;
                color: white !important;
            }

            .nav-link {
                color: white !important;
                font-weight: 500;
                transition: color 0.3s ease;
            }

            .nav-link:hover,
            .nav-link.active {
                color: #ffc107 !important; /* Yellow hover */
            }

            .navbar-toggler {
                border-color: rgba(255, 255, 255, 0.3);
            }

            .navbar-toggler-icon {
                background-image: url("data:image/svg+xml,%3csvg xmlns='http://www.w3.org/2000/svg' fill='%23ffffff' viewBox='0 0 30 30'%3e%3cpath stroke='rgba(255,255,255,0.7)' stroke-linecap='round' stroke-miterlimit='10' stroke-width='2' d='M4 7h22M4 15h22M4 23h22'/%3e%3c/svg%3e");
            }
        </style>
    </head>
    <body>
        <div class="text-center">
            <button><a class="text-danger text-decoration-none" href="addEmpForm.jsp"><h3>Add New Employee</h3></a></button>
             
    </div>

</body>
</html>
