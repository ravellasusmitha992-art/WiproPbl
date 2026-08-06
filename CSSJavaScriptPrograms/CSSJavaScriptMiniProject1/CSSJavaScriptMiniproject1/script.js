function showDateTime()
{
setInterval(function(){

let d=new Date();

document.getElementById("datetime").innerHTML=d.toLocaleString();

},1000);

}


function startTimer()
{

setTimeout(function(){

alert("3 Minutes Past");

},180000);

}


function validateForm()
{

let fname=document.getElementById("fname").value.trim();

let lname=document.getElementById("lname").value.trim();

let password=document.getElementById("password").value;

let cpassword=document.getElementById("cpassword").value;

let mobile=document.getElementById("mobile").value.trim();

let dob=document.getElementById("dob").value.trim();

let email=document.getElementById("email").value.trim();

let gender=document.getElementsByName("gender");

let namePattern=/^[A-Za-z]+$/;

let mobilePattern=/^(\d{3}-\d{3}-\d{4}|\d{3}\.\d{3}\.\d{4}|\d{3}\s\d{3}\s\d{4})$/;

let dobPattern=/^\d{2}-\d{2}-\d{4}$/;

let emailPattern=/^[^\s@]+@[^\s@]+\.[^\s@]+$/;


if(fname=="")
{
alert("First Name Required");
return false;
}

if(!namePattern.test(fname))
{
alert("First Name must contain only letters");
return false;
}

if(lname=="")
{
alert("Last Name Required");
return false;
}

if(!namePattern.test(lname))
{
alert("Last Name must contain only letters");
return false;
}

if(password=="")
{
alert("Password Required");
return false;
}

if(password.length<6 || password.length>20)
{
alert("Password length should be between 6 and 20");
return false;
}

if(cpassword=="")
{
alert("Confirm Password Required");
return false;
}

if(password!=cpassword)
{
alert("Passwords do not match");
return false;
}

let selected=false;

for(let i=0;i<gender.length;i++)
{
if(gender[i].checked)
selected=true;
}

if(!selected)
{
alert("Select Gender");
return false;
}

if(mobile=="")
{
alert("Enter Mobile Number");
return false;
}

if(!mobilePattern.test(mobile))
{
alert("Invalid Mobile Number");
return false;
}

if(dob=="")
{
alert("Enter DOB");
return false;
}

if(!dobPattern.test(dob))
{
alert("DOB Format: DD-MM-YYYY");
return false;
}

if(email=="")
{
alert("Enter Email");
return false;
}

if(!emailPattern.test(email))
{
alert("Invalid Email");
return false;
}

alert("Registration Successful");

return true;

}