<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="games" method="post">
<label> NameOfBeach </label>         
<input type="text" name="nameOfBeach" size="15"/> <br> <br>  
<label> NumOfBeachs: </label>     
<input type="text" name="numOfBeachs" size="15"/> <br> <br>  
<label> EntryfeeOfBeach: </label>         
<input type="text" name="entryfeeOfBeach" size="15"/> <br> <br>
GamesToPlay :  
</label>   
<select>  
<option value="Course">Games</option>  
<option value="BCA">VollyBall</option>  
<option value="BBA">HandBall</option>  
<option value="B.Tech">FootBall</option>  
<option value="MBA">Cricket</option>  
<option value="MCA">Kabbaddi</option>  
<option value="M.Tech">Dance</option>  
</select>  
<label> 
<br>
<br>  
If Clean Activate button :  
</label><br>  
Yes<input type="radio" name="clean" value="Yes"/>  <br> 
No<input type="radio" name="clean" value="No"/>  <br> 
<br>
<br>
<button>Activate</button>
</form>
</body>
</html>