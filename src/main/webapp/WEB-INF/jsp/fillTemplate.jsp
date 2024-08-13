<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="../css/form.css" type="text/css">


<!DOCTYPE html>
<html class="fill-page">
<head>
    <meta charset="UTF-8">
    <title>Create invitation</title>
</head>
<body>
<div class="form">
    <h2>Create Invitation</h2>
    <form:form cssClass="form-template" action="createTemplate?img=${img}&spkrs=${speakers}" method="post" enctype="multipart/form-data"
               modelAttribute="template">
        <form:label path="title">Title:</form:label>
        <form:input path="title"/><br/>
        
        <c:choose>
            <c:when test="${speakers == 2 and img == 3}">
            </c:when>
            <c:otherwise>
                <form:label path="description">Description:</form:label>
                <form:input path="description"/><br/>
            </c:otherwise>
        </c:choose>


        <form:label path="place">Place:</form:label>
        <form:input path="place"/><br/>

        <form:label path="date">Date:</form:label>
        <form:input path="date"/><br/>

        <form:label path="time">Time:</form:label>
        <form:input path="time"/><br/>


        <c:forEach items="${template.speakers}" var="speaker" varStatus="counter">
            <h2>${counter.index + 1}° Speaker's info</h2>
            <form:label path="speakers[${counter.index}].name">Name:</form:label>
            <form:input path="speakers[${counter.index}].name"/><br/>
            <form:label path="speakers[${counter.index}].role">Role:</form:label>
            <form:input path="speakers[${counter.index}].role"/><br/>
            <label for="speakers[${counter.index}]">Image:</label>
            <input type="file" id="speakers[${counter.index}].file" name="speakers[${counter.index}].file" accept="image/jpeg, image/png">


        </c:forEach>

        <div class="button-container">
        <form:button id="button-template">Create template</form:button>
        </div>
    </form:form>
</div>
</body>