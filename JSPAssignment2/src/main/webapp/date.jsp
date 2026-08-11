<html>
<head>
    <title>Today's Date and Time</title>
</head>

<body>

    <h2>Today's Date and Time</h2>

    <%
        java.time.LocalDateTime now = java.time.LocalDateTime.now();

        java.time.format.DateTimeFormatter format =
            java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        out.println("Date and Time: " + now.format(format));
    %>

</body>
</html>