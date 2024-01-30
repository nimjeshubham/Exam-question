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
<h1>Test preview</h1>

<% Question question = (Question)request.getAttribute("question");%>
<p>
 Test ID <%=question.getTestId() %>
 Question ID :<%=question.getQuestionId() %><br>
 Question : <%= question.getQuestion() %><br>
 A: <%= question.getOptionA()%>        B:<%= question.getOptionB()%>
 C: <%= question.getOptionC()%>        D:<%= question.getOptionD()%>
 
 Answer: <%= question.getAnswer()%>
</p>
<form action="update">
Update Test <br>
Test Id<input type="Text" placeholder=<%=question.getQuestionId() %> name="testId"><br>
Subject <input type ="text" name ="subject">
Date <input type="date" name ="date">
<input type = "submit" value ="Update">
</form>

<br>
<br>
<form action="delete">
Delete Test <br>
<input type="Text" placeholder=<%=question.getQuestionId() %> name="testId"><br>
<input type = "submit" value ="Delete">
</form>

</body>
</html>