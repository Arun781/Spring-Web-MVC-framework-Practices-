<!DOCTYPE html>
<html lang="en-us">
    <head>
        <meta charset="UTF-8">
        <title>Responsive Registaration Form</title>
        <link rel="stylesheet" href="./responsiveRegistration.css">
        <script type="text/javascript" lang="javascript" src="./responsiveRegistaration.js"></script>
        <link rel="stylesheet" href="Worries.css">
    </head>
       
    <body class="body">
    <div >
    <form action="war" method="post">
        <h1>Student Registaration Form</h1>
        <div class="container">
            <div class="row">
                <div class="col-10">
                    <label for="fname">First Name:</label>
                </div>
                <div class="col-90">
                    <input type="text" id="fname" name="firstname" placeholder="Enter your first name">
                </div>
            </div>
            <div class="row">
                <div class="col-10">
                    <label for="lname">Last Name:</label>
                </div>
                <div class="col-90">
                    <input type="text" id="lname" name="lastname" placeholder="Enter your last name">
                </div>
            </div>
            <div class="row">
                <div class="col-10">
                    <label for="email">Email:</label>
                </div>
                <div class="col-90">
                    <input type="email" id="email" name="email" placeholder="it should contain @,.">
                </div>
            </div>
            <div class="row">
                <div class="col-10">
                    <label for="mobile">Mobile:</label>
                </div>
                <div class="col-90">
                    <input type="tel" id="mobile" name="mobile" placeholder="only 10 digits are allowed">
                </div>
            </div>
            <div class="row">
                <div class="col-10">
                    <label for="gender" required name="gender">Gender:</label>
                </div>
                <div class="col-90">
                    <input type="radio" id="male" name="gender" value="male"/>Male
                    <input type="radio" id="female" name="gender" value="female"/>Female
                </div>
            </div>
            <div class="row">
                <div class="col-10">
                    <label for="dob">Date Of Birth:</label>
                </div>
                <div class="col-90">
                    <input type="Date" id="dob" name="dob">
                </div>
            </div>
            <div class="row">
                <div class="col-10">
                    <label for="address">Address:</label>
                </div>
                <div class="col-90">
                    <textarea name="address" id="address" cols="30" rows="10"></textarea>
                </div>
            </div>
            <div class="row">
                <div class="col-10">
                    <label for="city">City:</label>
                </div>
                <div class="col-90">
                    <input type="text" id="city" name="city" maxlength="10">
                </div>
            </div>
            <div class="row">
                <div class="col-10">
                    <label for="pincode">Area PIN:</label>
                </div>
                <div class="col-90">
                    <input type="number" id="pin" name="pin" maxlength="6">
                </div>
            </div>
            <div class="row">
                <div class="col-10">
                    <label for="state">State:</label>
                </div>
                <div class="col-90">
                    <input type="text" id="state" name="state">
                </div>
            </div>
            <div class="row">
                <div class="col-10">
                    <label for="qualification" required >Qualification:</label>
                </div>
                <div class="col-90">
                    <select name="qualification" id="qualification">
                        <option value=" ">Select Qualification:</option>
                        <option value="Graduation">Graduation</option>
                        <option value="BTech.">BTech.</option>
                        <option value="MTech.">MTech.</option>
                        <option value="MCA">MCA</option>
                        <option value="BCA">BCA</option>
                    </select>
                </div>
            </div>
            <form action="radio">
            <div class="row">
                <div class="col-10">
                    <label for="specialization">Specialization:</label>
                </div>
                <div class="col-90">
                    <input type="radio" class="specialization" id="cs" name="CS" value="Computer Science">
                      <label for="Computer Science">Computer Science</label><br>
                    <input type="radio" class="specialization" id="it" name="IT" value="Information Technology">
                    <label for="Information Technology">Information Technology</label><br>
                    <input type="radio" class="specialization" id="ca" name="CA" value="Computer Architecture">
                    <label for="Computer Architecture">Computer Architecture</label><br>
                    <input type="radio" class="specialization" id="tc" name="TC" value="Tele Communication">
                    <label for="Tele Communication">Tele Communication</label><br>
                    <input type="radio" class="specialization" id="me" name="ME" value="Mechanical Engi">
                    <label for="Mechanical Engi">Mechanical Engi</label><br>
                    <input type="radio" class="specialization" id="ce" name="CE" value="Civil Engi">
                    <label for="Civil Engi">Civil Engi</label><br>
                    
                </div>
            </div>
            </form>
            <div class="row">
                <div class="col-10">
                    <label for="password">Password:</label>
                </div>
                <div class="col-90">
                    <input type="password" id="password" name="password" maxlength="8">
                </div>
            </div>
            <div class="row">
                <button>Registered</button>
            </div>  
        </div>
        </div>  
        </form>
    </body>
</html>