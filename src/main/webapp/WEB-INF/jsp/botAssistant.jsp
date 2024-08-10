<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<link rel="stylesheet" href="../css/bot.css" type="text/css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
        <div class="header-title"><i class="fa fa-cloud"></i> <span>Welcome to your BS assistant </span></div>
        <div class="header-introduction">I'm here to help :)</div>
    </div>
    <div class="full-chat" id="full-chat">
        <div class="bot-text">
            <div class="text">Hello, it's a pleasure to assist you, let's start ... what's your name?</div>
        </div>
        <div class="user-text">
            <div class="text" id="textUser"></div>
        </div>
    </div>
    <div class="user-interaction">
        <div class="user-input">
            <label>
                <input class="input-text" type="text" id="name" placeholder="Type an answer"></input>
            </label>
        </div>
    </div>
</div>
</body>
</html>


