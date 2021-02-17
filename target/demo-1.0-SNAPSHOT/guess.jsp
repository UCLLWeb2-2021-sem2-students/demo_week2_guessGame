
<%--
<%@ page import="java.util.Random"%>
<%@ page import="domain.model.GuessGame"%>


<%! GuessGame game = new GuessGame(); %>
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Guess</title>
</head>
<body>
<h1>Thinking a number</h1>
<%--
<%
    String guessFromParameter = request.getParameter("guess");
    int guessedNumber = Integer.parseInt(guessFromParameter);
%>
<%
    String resultMessage = game.guess(guessedNumber);
%>
<h2><%=resultMessage%></h2>
 --%>
<p>You guessed <%=request.getParameter("guess")%>...</p>
<h2><%= request.getAttribute("result") %></h2>

<a href="form.jsp">Guess again</a>
</body>
</html>
