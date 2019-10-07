<%--
  Created by IntelliJ IDEA.
  User: israel
  Date: 05/10/2019
  Time: 7:36 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html lang="en">
<head>
    <title>Student Registration</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<nav class="navbar navbar-expand-md navbar-dark bg-dark">
    <a class="navbar-brand" href="#">Course Review System</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse"
            aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
</nav>

<main role="main" class="container">
    <form:form class="form-signin" modelAttribute="studentModel" action="${pageContext.request.contextPath}/saveStudent" method="POST">
        <div class="text-center mb-4">
            <h1 class="h3 mb-3 font-weight-normal">Register a Student</h1>
            <p>Student registration form <code>:placeholder-shown</code> pseudo-element.</p>
        </div>

        <div class="form-group">
            <form:label path="firstName">First Name</form:label>
            <form:input type="text" class="form-control" path="firstName" placeholder="First Name"/>
        </div>

        <div class="form-group">
            <form:label path="lastName">First Name</form:label>
            <form:input type="text" class="form-control" path="lastName" placeholder="Last Name"/>
        </div>

        <div class="form-group">
            <form:label path="age">How old are you</form:label>
            <form:input type="number" class="form-control" path="age" placeholder="Your age"/>
        </div>

        <button class="btn btn-lg btn-primary btn-block" type="submit">Register Student</button>
        <p class="mt-5 mb-3 text-muted text-center">&copy;2019</p>
    </form:form>
</main>


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>
