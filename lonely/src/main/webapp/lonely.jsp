<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ArunVeerapur</title>
<link rel="stylesheet" href="lonely.css">
</head>
<body>
<form action="lonely" method="post">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" id="email" required>

    <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="psw" id="psw" required>

    <label for="pswrepeat"><b>Repeat Password</b></label>
    <input type="password" placeholder="Repeat Password" name="pswrepeat" id="pswrepeat" required>
    <hr>
    
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>
    
    <button type="submit" class="Register">Register</button>
  </div>
  
  <div class="container signin">
    <p>Already have an account<a href="#">Sign in</a>....</p>
  </div>
</form>
</body>
</html>