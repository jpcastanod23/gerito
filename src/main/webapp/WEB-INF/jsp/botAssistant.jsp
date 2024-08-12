<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<link rel="stylesheet" href="../css/bot.css" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="../js/chat.js"></script>


<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>

    </title>
</head>
<body class="bot-assistant-page">
<div class="chat">
    <div class="chat-header">
        <div class="header-title"><span>Digital invite maker</span></div>
        <div class="header-introduction">I'm here to help :)</div>
    </div>

    <c:choose>
        <c:when test="${!isTemplateSelected}">
            <div class="full-chat" id="full-chat">
                <div class="bot-text">
                    <div class="text">Hello, it's a pleasure to assist you, let's start ... what's your name?</div>
                </div>
                <div class="user-text">
                    <div class="text" id="textUser"></div>
                </div>
            </div>
        </c:when>
        <c:otherwise>
            <div class="full-chat" id="full-chat">
                <div class="bot-text">
                    <div class="text">${userName}, you have been choosed the template # ${img} for ${speakers} speakers,
                        in the image below you can see the empty template to have a better view of where it will be each
                        field
                        once you are ready, please click on next to fill the required fields to create your invitation
                    </div>
                </div>
                <div class="bot-text">
                    <img onclick="imgOnClick(this)" class="img-template" id="imgTemplate"
                         src="../images/templates/template${speakers}-${img}.png/">
                </div>
                <div onclick="modalOnClick()" id="imgModal" class="img-modal">
                    <img class="modal-content" id="img01">
                    <div id="caption"></div>
                </div>
                <div class="speakers-container img-container">
                    <button onclick="location.href='/fillTemplate?speakers=' + ${speakers} + '&img=${img}'"
                            class="speakers-button">Next</button>

                </div>
            </div>
        </c:otherwise>
    </c:choose>
    <div class="user-interaction">
        <div class="user-input">
            <label>
                <input class="input-text" type="text" id="name" <c:if test="${isTemplateSelected}"> disabled</c:if>
                       placeholder="Type an answer"/>
            </label>
        </div>
    </div>
</div>
</body>
</html>


