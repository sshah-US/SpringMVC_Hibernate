<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>
<%@ taglib uri="jakarta.tags.fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Success</title>
    <style>
        body {
            background-color: #FFEBCD;
            font-family: Arial, sans-serif;
        }
        .section-title {
            color: blue;
            font-weight: bold;
            margin-top: 20px;
        }
        .field-label {
            font-weight: bold;
            color: #333;
        }
    </style>
</head>
<body>

    <!-- Set current date -->
    <c:set var="now" value="<%= new java.util.Date() %>" />

    <h2 class="section-title">Today's Date:</h2>
    <p><fmt:formatDate value="${now}" pattern="yyyy-MM-dd HH:mm:ss"/></p>

    <h2 class="section-title">================ You entered the following values ==================</h2>
    <br>

    <div>
        <span class="field-label">First Name:</span> ${allInfo.fname}<br>
        <span class="field-label">Middle Name:</span> ${allInfo.mname}<br>
        <span class="field-label">Last Name:</span> ${allInfo.lname}<br>
        <span class="field-label">Gender:</span> ${allInfo.gender}<br>
        <span class="field-label">Address:</span> ${allInfo.address}<br>
        <span class="field-label">City:</span> ${allInfo.city}<br>
        <span class="field-label">State:</span> ${allInfo.state}<br>
        <span class="field-label">Country:</span> ${allInfo.country}<br>
        <span class="field-label">Phone No.:</span> ${allInfo.phno}<br>
        <span class="field-label">Bank Name:</span> ${allInfo.bname}<br>
        <span class="field-label">Account No.:</span> ${allInfo.acnum}<br>
        <span class="field-label">SSN:</span> ${allInfo.ssn}<br>
    </div>

    <h2 class="section-title">================ End of the display =============================</h2>

</body>
</html>
