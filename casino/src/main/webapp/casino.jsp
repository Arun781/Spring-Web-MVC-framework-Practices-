<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="casino.css">
</head>
<body style="color:red">
<form action="goa" method="post">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="Name"><b>Name</b></label>
    <input type="text" placeholder="Name" name="name" id="Name" required>

    <label for="Cruise"><b>"Cruise"</b></label>
    <input type="text" placeholder="Cruise" name="cruise" id=""Cruise"" required>

    <label for="EntryFee"><b>EntryFee</b></label>
    <input type=text placeholder="EntryFee" name="entryFee" id="EntryFee" required>
    <hr>
	<input type="radio" id="Free" name="foodFree" value="Yes">
	<label for="FoodFree">FoodFree</label><br>
	<input type="radio" id="Free" name="freeAlcohol" value="No">
	<label for="FreeAlcohol">FreeAlcohol</label><br>
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    <button type="submit" class="registerbtn">Register</button>
  </div>

  <div class="container signin">
    <p>Already have an account? <a href="#">Sign in</a>.</p>
  </div>
</form>
</body>
</html>