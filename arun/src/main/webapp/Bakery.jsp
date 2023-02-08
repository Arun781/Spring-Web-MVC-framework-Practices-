<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="bakery" method="post">
<h1>Bakery Details:-</h1>
 <pre>
bakeryName<input type="text" name="bakeryName"/>
bakeryOwnerName<input type="text" name="bakeryOwnerName"/>
bakeryWifeName<input type="text" name="bakeryWifeName"/>
Please select Married:-
  Male<input type="radio" id="Married" name="married" value="yes">
  
Reason
<textarea rows="5" cols="50" name="famousFor" placeholder="famousFor"></textarea>
since
<textarea rows="5" cols="50" name="since" placeholder="since"></textarea>
<button>Send</button>
</pre>
</form>
</body>
</html>