<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">

    <title>Bid Submitted</title>

    <style>

        body {
            font-family: "Times New Roman", serif;
            background-color: white;
        }

        .result-box {
            width: 650px;
            margin: 50px auto;
            padding: 20px;
            background-color: yellow;
            text-align: center;
        }

        h1 {
            font-size: 35px;
        }

        p {
            font-size: 18px;
        }

        table {
            margin: 25px auto;
            border-collapse: collapse;
            font-size: 20px;
        }

        td {
            border: 2px solid white;
            padding: 7px;
        }

        .item-name {
            background-color: black;
            color: white;
            font-weight: bold;
        }

    </style>

</head>

<body>

    <div class="result-box">

        <h1>Bid Submitted</h1>

        <p>
            Your bid is now active.
            If your bid is successful, you will be notified
            within 24 hours of the close of bidding.
        </p>

        <table>

            <tr>
                <td class="item-name">
                    ${auction.itemName}
                </td>
            </tr>

            <tr>
                <td>
                    Item ID: ${auction.itemId}
                </td>
            </tr>

            <tr>
                <td>
                    Name: ${auction.userName}
                </td>
            </tr>

            <tr>
                <td>
                    Email address: ${auction.email}
                </td>
            </tr>

            <tr>
                <td>
                    Bid price: Rs${auction.amount}
                </td>
            </tr>

            <tr>
                <td>
                    Auto-increment price: ${auction.autoIncrement}
                </td>
            </tr>

        </table>

    </div>

</body>
</html>