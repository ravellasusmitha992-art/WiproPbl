<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Prime Numbers</title>
</head>
<body>

<h2>Prime Numbers</h2>

<%
    java.util.ArrayList<Integer> primes =
        (java.util.ArrayList<Integer>) request.getAttribute("primes");

    if (primes != null) {
        for (Integer prime : primes) {
%>

            <p><%= prime %></p>

<%
        }
    }
%>

</body>
</html>