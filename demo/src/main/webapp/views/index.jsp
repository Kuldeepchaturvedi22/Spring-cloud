<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Home Page</title>
</head>
<body>
    <h1>Welcome to Spring Boot with JSP!</h1>
   <%-- <form action="add"> --%>
   <form action="addAlien" method="post">
   <%-- Enter 1st number : <input type="text" name="num1"><br> --%>
     <%-- Enter 2nd number : <input type="text" name="num2"><br>  --%>
    Enter your id: <input type= "text" name= "aid"> <br>
    Enter your name: <input type="text" name= "aname"><br>
    <input type="submit">
    </form>
    <hr>
    <form action="getAlien" method=:"get">
    Enter your id: <input type="text" name="aid"><br>
    <input type="submit">
    </form>
     <hr>
        <form action="getAlienByName" method=:"get">
        Enter your name: <input type="text" name="aname"><br>
        <input type="submit">
        </form>
</body>
</html>
