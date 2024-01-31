<%@page import="com.examQuestion.pack.Model.Question"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Question preview</h1>

<% Question question = (Question)request.getAttribute("question");%>
<p>
 Test ID <%=question.getTestId() %>
 Question ID :<%=question.getQuestionId() %><br>
 Question : <%= question.getQuestion() %><br>
 A: <%= question.getOptionA()%>        B:<%= question.getOptionB()%>
 C: <%= question.getOptionC()%>        D:<%= question.getOptionD()%><br>
 
 Answer: <%= question.getAnswer()%>
</p>
<form action="update">
Update Test <br>
Question Id<input type="Text" placeholder=<%=question.getQuestionId() %> name="qId"><br>
Test ID  <input type ="text" name ="test"><br>
Question <input type="text" name ="question"><br>
A: <input type ="text" name ="a"><br>
B: <input type ="text" name ="b"><br>
C: <input type ="text" name ="c"><br>
D: <input type ="text" name ="d"><br>
Answer: <input type ="text" name ="answer"><br>
<input type ="submit">
</form>

<br>
<br>
<form action="delete">
Delete question <br>
<input type="Text" placeholder=<%=question.getQuestionId() %> name="qId"><br>
<input type = "submit" value ="Delete">
</form>

</body>
</html>