<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<link rel="stylesheet" href="../css/form.css" type="text/css">


<!DOCTYPE html>
<html class="fill-page">
<head>
    <meta charset="ISO-8859-1">
    <title>Create invitation</title>
</head>
<body>
<div class="form">
    <h2>Create Invitation</h2>
    <form:form cssClass="form-template" action="createTemplate" method="post" modelAttribute="template">
        <form:label path="title">Title:</form:label>
        <form:input path="title"/><br/>

        <form:label path="description">Description:</form:label>
        <form:input path="description"/><br/>

        <form:label path="place">Place:</form:label>
        <form:input path="place"/><br/>
        <%--
                <form:label path="date">Date:</form:label>
                <form:input path="date"/><br/>

                <form:label path="time">Time:</form:label>
                <form:input path="time"/><br/>
                --%>

                <c:forEach items="${template.speakers}" var="speaker" varStatus="counter">
                    <h2>${counter.index + 1}° Speaker's info</h2>
                    <form:label path="speakers[${counter.index}].name">Name:</form:label>
                    <form:input path="speakers[${counter.index}].name"/><br/>
                    <form:label path="speakers[${counter.index}].role">Role:</form:label>
                    <form:input path="speakers[${counter.index}].role"/><br/>

                </c:forEach>

                <form:button>Create template</form:button>
            </form:form>
        </div>
        </body>