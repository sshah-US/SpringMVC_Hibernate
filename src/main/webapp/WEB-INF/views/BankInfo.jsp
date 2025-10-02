<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="UTF-8">
<title>Bank Info</title>
</head>
<body>
<body style="background-color: #FFEBCD;">

	<!-- Error message placeholder -->
    <c:if test="${not empty error}">
        <h2 style="color:red; font-size: 18px; font-weight: bold;">${error}</h2>
    </c:if>
    
	<nav style="background-color: #DEB887;">
		<div
			class="container-fluid d-flex align-items-center justify-content-between mt-5">

			<div class="d-flex align-items-center">
				<h2 class="h4 mb-2 mt-2 fw-bold text-white ms-2">Bank
					Information</h2>
			</div>

		</div>
	</nav>

	<br />
	<br />
	<div class="row">
		<div class="col-4" style="margin-left: 10rem;">
			
			<form:form action="bInfo" method="post" modelAttribute="allInfo">

				<div class="mb-3">
					<form:label path="bname" cssClass="form-label">Bank name:</form:label>
					<form:input path="bname" id="bname" cssClass="form-control"
						autocomplete="off" />
				</div>

				<div class="mb-3">
					<form:label path="acnum" cssClass="form-label">Account Number:</form:label>
					<form:input path="acnum" id="acnum" cssClass="form-control"
						autocomplete="off" />
				</div>

				<div class="mb-3">
					<form:label path="ssn" cssClass="form-label">SSN:</form:label>
					<form:input path="ssn" id="ssn" cssClass="form-control"
						autocomplete="off" />
				</div>
				


				<div class="d-flex justify-content-center">
					<button type="submit" class="btn"
						style="background-color: #DEB887; border-color: #DEB887; color: #fff;">
						Submit</button>
				</div>

			</form:form>
		</div>

		<div class="col-8"></div>
	</div>
</body>
</html>