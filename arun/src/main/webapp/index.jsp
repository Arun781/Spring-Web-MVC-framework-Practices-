<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Arun</title>
<link rel="stylesheet" href="Bio.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
	integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
	integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
	integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
	crossorigin="anonymous"></script>


</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-dark">
		<a class="navbar-brand" href="#"> <img alt=""
			src="https://x-workz.in/static/media/Logo.cf195593dc1b3f921369.png"
			height="100px" width="100px"></a>

		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Link</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-toggle="dropdown" aria-haspopup="true"
					aria-expanded="false"> Dropdown </a>
					<div class="dropdown-menu" aria-labelledby="navbarDropdown">
						<a class="dropdown-item" href="#">Action</a> <a
							class="dropdown-item" href="#">Another action</a>
						<div class="dropdown-divider"></div>
						<a class="dropdown-item" href="#">Something else here</a>
					</div></li>
				<li class="nav-item dropdown"><a class="nav-link disabled"
					href="#">Disabled</a></li>
			</ul>
		</div>
	</nav>
	<br>
	<div class="email" >
		<form action="email" method="get">
		Click here to get your Mail id:-
		<button>click for email</button>
		<h6>${email}</h6>
		</form>
	</div>
	
	
	<div class="addar">
		<form action="addar" method="get">
		Click here to get your Addar number :-
		<button>click for addar</button>
		<h6>${addar}</h6>
		</form>
	</div>
	<div class="number">
		<form action="number" method="get">
		Click here to get your number :-
		<button>click for number</button>
		<h6>${number}</h6>
		</form>
	</div>
	
	<div class="age">
		<form action="age" method="get">
		Click here to get your age :-
		<button>click for age</button>
		<h6>${age}</h6>
		</form>
	</div>
	
	<div class="dob">
		<form action="dob" method="get">
		Click here to get Date Of Birth and Time :-
		<button>click for dob</button>
		<h6>${dob}</h6>
		</form>
	</div>
	
	<div class="salary">
		<form action="salary" method="get">
		Click here to get Salary:-
		<button>click for Salary</button>
		<h6>${salary}</h6>
		</form>
	</div>
	
	<div class="friends">
		<form action="friends" method="get">
		Click here to get FriendsList:-
		<button>click for friends</button>
		<ul>
		</ul>
		</form>
	</div>
	
	<div class="dtos">
		<form action="educationDTO" method="get">
		<h6>Displaying the educationDTO :-${education}</h6>
		<button>click for education</button>
		<br>
		<label>School Name :- ${education.schoolName}</label>
		<br>
		<label>School Dist :- ${education.schoolDist}</label>
		<br>
		<label>School Taluk :- ${education.schoolTaluk}</label>
		<br>
		<label>School Location :- ${education.schoolLocation}</label>
		<br>
		<label>Diploma College Name :- ${education.diplomaClgName}</label>
		<br>
		<label>Diploma College Location :- ${education.diplomaClgLocation}</label>
		<br>
		<label>Diploma College Taluk:- ${education.diplomaClgTaluk}</label>
		<br>
		<label>Diploma College Dist:- ${education.diplomaClgDist}</label>
		<br>
		<label>Degree College Name :- ${education.degreeClgName}</label>
		<br>
		<label>Degree College Location :- ${education.degreeClgLocation}</label>
		<br>
		<label>Degree College Taluk:- ${education.degreeClgTaluk}</label>
		<br>
		<label>Degree College Dist:- ${education.degreeClgDist}</label>
		</form>
		
		<form action="chat" method="get">
		<h6>Displaying the Chat Detailes:-</h6>
		<button>Click for chats</button>
		<br>
		<label>Chat Name:-${chats.name}</label>
		<br><label>Chat Name:-${chats.name}</label>
		<br><label>Chat Price:-${chats.price}</label>
		<br><label>Chat famousChat:-${chats.famousChat}</label>
		<br><label>Chat pincode:- ${chats.pincode}</label>
		<br><label>Chat phoneNum:-${chats.phoneNum}</label>
		<br><label>Chat spicy:-${chats.spicy}</label>
		<br><label>Chat tasty:-${chats.tasty}</label>
		<br><label>Chat Lemons:-${chats.lemons}</label>
		<br><label>Chat location:-${chats.location}</label>
		<br><label>Chat dist:-${chats.dist}</label>
		<br><label>Chat taluk:-${chats.taluk}</label>
		<br><label>Chat place:-${chats.place}</label>
		</form>
		
		<form action="mobile" method="get">
		<h6>Displaying the Detailes of the phone.....</h6>
		<button>Click of mobile</button>
		<br><label>Mobile Model :- ${call.model}</label>
		<br><label>Mobile CompanyName :- ${call.companyName}</label>
		<br><label>Mobile RAM :- ${call.ram}</label>
		<br><label>Mobile ROM :- ${call.rom}</label>
		<br><label>Mobile Cost :- ${call.cost}</label>
		</form>
		
		<form action="drinks" method="get">
		<h6>Displaying the Beverages...</h6>
		<button>Click for Beverage</button>
		<br><label>Beverage Name:-${chillout.name}</label>
		<br><label>Beverage cold:-${chillout.cold}</label>
		<br><label>Beverage hot:-${chillout.hot}</label>
		<br><label>Beverage price:-${chillout.price}</label>
		<br><label>Beverage location:-${chillout.location}</label>
		<br><label>Beverage dist:-${chillout.dist}</label>
		<br><label>Beverage taluk:-${chillout.taluk}</label>
		<br><label>Beverage place:-${chillout.place}</label>
		</form>
		
		<form action="family" method="get">
		<h6>Displaying Family Details..</h6>
		<button>Click for Family</button>
		<br><label>FatherName :-${affection.fatherName}</label>
		<br><label>MotherName :-${affection.motherName}</label>
		<br><label>BrotherName :-${affection.brotherName}</label>
		<br><label>DistName :-${affection.distName}</label>
		<br><label>TalukName :-${affection.talukName}</label>
		<br><label>VillageName :-${affection.villageName}</label>
		<br><label>PincodeNum:-${affection.pincodeNum}</label>
		<br><label>Caste :-${affection.caste}</label>
		<br><label>YearlyIncome :-${affection.yearlyIncome}</label>
		<br><label>FatherOccupation :-${affection.fatherOccupation}</label>
		<br><label>MotherOccupation :-${affection.motherOccupation}</label>
		<br><label>BrotherOccupation :-${affection.brotherOccupation}</label>
		</form>
	</div>	
	
	<div class="List">
	
	<form action="friends" method="get">
	<h6>Displaying Friends</h6>
	<button>Click for friends</button>
	<ol>
	<c:forEach items="${names}" var="item">
	<li>${item}</li>
	</c:forEach>
	</ol>
	</form>
	</div>
		
	<div class="places">
	<form action="places">
	<h6>Most Visted Places...</h6>
	<button>click for places</button>
	<ol>
	<c:forEach items="${visited}" var="item">
	<li>${item}</li>
	</c:forEach>
	</ol>
	</form>
	</div>
		
	<div class="skills">
	<form action="skills" method="get">
	<h6>List of Skills Having</h6>
	<button>click here for Skills</button>
	<ol>
	<c:forEach items="${softSkills}" var="item">
	<li>${item}</li>
	</c:forEach>
	</ol>
	</form>
	</div>	
</body>
</html>