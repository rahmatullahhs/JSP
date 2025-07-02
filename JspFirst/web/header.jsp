<!doctype html>
<html lang="en">
<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Bootstrap Icons (optional) -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.5/font/bootstrap-icons.css" rel="stylesheet">

    <title>jsp First</title>

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

<nav class="navbar navbar-expand-lg navbar-custom sticky-top">
    <div class="container-fluid">
        <a class="navbar-brand" href="#"><i class="bi bi-cloud-fill me-2"></i>Welcome To Cloud</a>

        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ms-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="index.jsp"><i class="bi bi-house-door-fill me-1"></i>Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addEmpForm.jsp"><i class="bi bi-person-plus-fill me-1"></i>Register EMP</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="bi bi-gear-fill me-1"></i>Services</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#"><i class="bi bi-chat-dots-fill me-1"></i>Feedback</a>
                </li>
            </ul>
        </div>
    </div>
</nav>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>
