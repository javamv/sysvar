<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <body>
        <form action="verify" method="POST">
            <input name="systemVariable" />
            <input type="submit" name="Verify">Submit</input>
        </form>
        Value of this system variable is:
        <h3 id="result_text"><%= request.getAttribute("sysvarValue") %></h3>
    </body>
</html>%>