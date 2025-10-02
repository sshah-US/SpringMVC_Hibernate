<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="UTF-8">
    <title>Personal Info</title>
</head>
<body style="background-color: #FFEBCD;">

    <!-- Error message placeholder -->
    <c:if test="${not empty error}">
        <h2 style="color:red; font-size: 18px; font-weight: bold;">${error}</h2>
    </c:if>
    <nav style="background-color: #DEB887;">
        <div class="container-fluid d-flex align-items-center justify-content-between mt-5">
            <div class="d-flex align-items-center">
                <h2 class="h4 mb-2 mt-2 fw-bold text-white ms-2">Personal Information</h2>
            </div>
        </div>
    </nav>

    <br /><br />
    
    <div class="row">
        <div class="col-4" style="margin-left: 10rem;">

            
            <form:form action="pInfo" method="post" modelAttribute="allInfo">

                <div class="mb-3">
                    <form:label path="fname" cssClass="form-label">First Name:</form:label>
                    <form:input path="fname" cssClass="form-control" autocomplete="off"/>
                </div>

                <div class="mb-3">
                    <form:label path="mname" cssClass="form-label">Middle Name:</form:label>
                    <form:input path="mname" cssClass="form-control" autocomplete="off"/>
                </div>

                <div class="mb-3">
                    <form:label path="lname" cssClass="form-label">Last Name:</form:label>
                    <form:input path="lname" cssClass="form-control" autocomplete="off"/>
                </div>

                <div class="mb-3">
                    <label class="form-label">Gender:</label><br/>
                    <form:radiobutton path="gender" value="Male" />
                    <label for="male">Male</label>
                    <form:radiobutton path="gender" value="Female" />
                    <label for="female">Female</label>
                </div>

                <div class="d-flex justify-content-center">
                    <button type="submit" class="btn"
                        style="background-color: #DEB887; border-color: #DEB887; color: #fff;">
                        Submit
                    </button>
                </div>

            </form:form>

        </div>
        <div class="col-8"></div>
    </div>
</body>
</html>
