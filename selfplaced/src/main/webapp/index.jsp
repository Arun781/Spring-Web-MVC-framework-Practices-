<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="selfMade" method="post">
<h1>Sending the details of fav person:-</h1>
 <pre>
FirstName<input type="text" name="fname"/>
LastName<input type="text" name="lname"/>
Please select your Gender:-
  Male<input type="radio" id="Gender" name="Gender" value="Male">
  Female<input type="radio" id="Gender" name="Gender" value="Female">
  Other<input type="radio" id="Gender" name="Gender" value="Other">
Reason
<textarea rows="5" cols="50" name="reason" placeholder="Write your reson"></textarea>
Address
<textarea rows="5" cols="50" name="textarea" placeholder="Write your Address"></textarea>
<button>Send</button>
</pre>
</form>
</body>
</html>