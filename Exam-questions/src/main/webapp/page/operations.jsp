<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="registerQuestion">
Register question<br>
Test ID  <input type ="text" name ="test"><br>
Question <input type="text" name ="question"><br>
A: <input type ="text" name ="a"><br>
B: <input type ="text" name ="b"><br>
C: <input type ="text" name ="c"><br>
D: <input type ="text" name ="d"><br>
Answer: <input type ="text" name ="answer"><br>
<input type ="submit">
</form><br>

<br>

<form action="getIndi">
Get Individual Test info<br>
Question Id <input type="text" name ="qId"><br>
<input type ="submit">
</form> 

<br>
<br>

<form action="getAll">
Get Information of All questions
<input type ="submit">
</form>

<br>
<br>

<form action="getAllByTest">
Get All questions of test ID
<input type="text" name ="testId"><br>
<input type ="submit">
</form>

<br>
<br>

<form action="update">
Update Question <br>
Question Id <input type ="text" name ="qId">
Test ID  <input type ="text" name ="test"><br>
Question <input type="text" name ="question"><br>
A: <input type ="text" name ="a"><br>
B: <input type ="text" name ="b"><br>
C: <input type ="text" name ="c"><br>
D: <input type ="text" name ="d"><br>
Answer: <input type ="text" name ="answer"><br>
</form>

<br>
<br>
<form action="delete">
Delete question <br>
Question Id<input type="Text" name="qId"><br>
<input type = "submit" value ="Delete">
</form>


</body>
</html>