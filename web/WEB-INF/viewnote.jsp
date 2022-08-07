<%-- 
    Document   : viewnote
    Created on : 13-Jul-2022, 12:24:28 PM
    Author     : Kaden
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Note</title>
    </head>
    <body>
        <h1>Simple Note Keeper</h1>
        <h2>View Note</h2>
        <p><b>Title: </b>${note.title}</p>
        <br><br>
        <p><b>Contents: </b></p>
        <br>
        <p>${note.content}</p>
        
        <br><br>
        <a href="note?edit">Edit</a>
        
    </body>
</html>
