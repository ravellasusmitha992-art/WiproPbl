<!DOCTYPE html>
<html>
<head>

    <title>AJAX Email Availability</title>

    <style>

        body {
            font-family: Arial, sans-serif;
            background-color: #f2f2f2;
        }

        .container {
            width: 500px;
            margin: 50px auto;
            padding: 25px;
            background-color: white;
            border-radius: 8px;
            box-shadow: 0px 0px 10px #aaa;
        }

        h2 {
            text-align: center;
        }

        label {
            display: block;
            margin-top: 12px;
            font-weight: bold;
        }

        input, select {
            width: 100%;
            padding: 9px;
            margin-top: 5px;
            box-sizing: border-box;
        }

        #emailMessage {
            display: block;
            margin-top: 5px;
            font-weight: bold;
        }

    </style>


    <script>

        function checkEmail() {

            var email = document.getElementById("email").value.trim();

            var message = document.getElementById("emailMessage");

            // Email validation
            var emailPattern =
                /^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,}$/;

            if (!emailPattern.test(email)) {

                message.innerHTML = "Invalid Email Id";

                return;
            }


            // AJAX request
            var xhr = new XMLHttpRequest();

            xhr.onreadystatechange = function() {

                if (xhr.readyState == 4 &&
                    xhr.status == 200) {

                    message.innerHTML = xhr.responseText;
                }
            };


            xhr.open(
                "GET",
                "checkEmail?email=" +
                encodeURIComponent(email),
                true
            );

            xhr.send();
        }

    </script>

</head>

<body>

<div class="container">

    <h2>Profile Registration</h2>


    <form>

        <label>Email</label>

        <input type="text"
               id="email"
               name="email"
               onblur="checkEmail()">

        <span id="emailMessage"></span>


        <label>Password</label>

        <input type="password"
               name="password">


        <label>Date of Birth</label>

        <input type="date"
               name="dateofbirth">


        <label>Gender</label>

        <select name="gender">

            <option value="">Select Gender</option>

            <option value="Male">Male</option>

            <option value="Female">Female</option>

        </select>


        <label>City</label>

        <input type="text"
               name="city">


        <label>Pincode</label>

        <input type="text"
               name="pincode">


        <label>Mobile</label>

        <input type="text"
               name="mobile">

    </form>

</div>

</body>
</html>