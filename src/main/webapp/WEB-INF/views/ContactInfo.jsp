<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
	rel="stylesheet">
<meta charset="UTF-8">
<title>Contact Info</title>
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
				<h2 class="h4 mb-2 mt-2 fw-bold text-white ms-2">Contact
					Information</h2>
			</div>

		</div>
	</nav>

	<br />
	<br />


	<form:form action="cInfo" method="post" modelAttribute="allInfo">
		<div class="row">
			<div class="col-6" style="padding-left: 2rem;">

				<div class="mb-3">
					<form:label path="address" cssClass="form-label">Address:</form:label>
					<form:input path="address" id="address" cssClass="form-control"
						autocomplete="off" />
				</div>

				<div class="mb-3">
					<form:label path="city" cssClass="form-label">City:</form:label>
					<form:input path="city" id="city" cssClass="form-control"
						autocomplete="off" />
				</div>
			</div>

			<div class="col-6" style="padding-right: 2rem;">

				<div class="mb-3">
					<form:label path="state" cssClass="form-label">State:</form:label>
					<form:input path="state" id="state" cssClass="form-control"
						autocomplete="off" />
				</div>

				<div class="mb-3">
					<form:label path="country" cssClass="form-label">Country:</form:label>
					<form:input path="country" id="country" cssClass="form-control"
						autocomplete="off" />
				</div>
			</div>
			<div class="col-6 ms-4" style="padding-right: 2rem;">

				<div class="mb-3">
					<form:label path="phno" cssClass="form-label">Phone No.:</form:label>
					<form:input path="phno" id="phno" cssClass="form-control"
						autocomplete="off" />
				</div>
			</div>
			<div class="d-flex justify-content-center">
				<button type="submit" class="btn"
					style="background-color: #DEB887; border-color: #DEB887; color: #fff;">
					Submit</button>
			</div>

		</div>
	</form:form>

</body>

</html>