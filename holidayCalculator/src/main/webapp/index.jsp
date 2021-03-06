<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 3/25/2016
  Time: 10:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="description" content="">
  <meta name="author" content="">
  <title>Blank Template for Bootstrap</title>
  <!-- Bootstrap core CSS -->
  <link href="bootstrap/css/bootstrap.css" rel="stylesheet">
  <!-- Custom styles for this template -->
  <link href="style.css" rel="stylesheet">
  <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body class="">
<div class="container">
</div>
<h1>Holiday On-Call Requests</h1>
<form role="form" class="">
  <div class="container">
    <label class="control-label" for="firstName">First Name:</label>
    <input type="text" class="form-control" id="firstName" placeholder="Enter First Name">
  </div>
  <div class="container">
    <label class="control-label" for="LastName">Last Name:</label>
    <input type="text" class="form-control" id="lastName" placeholder="Enter Last Name">
  </div>
  <br />
  <br />
  <p class="container"><strong style="color: red;">Select 1 Holiday in each category below:</strong></p>
  <div class="container" id="requestGroup1">
    <label class="fieldLabel" for="onCall1">Preferred On Call #1:</label>
    <select id="onCall1" class="form-control">
      <option value="1">New Year's Day</option>
      <option value="8">Martin Luther King Day</option>
      <option value="2">Memorial Day</option>
      <option value="3">July 4th</option>
      <option value="4">Labor Day</option>
      <option value="5">Thanksgiving Day</option>
      <option value="6">Christmas Eve</option>
      <option value="7">Christmas Day</option>

    </select>
  </div>
  <div class="container" id="requestGroup2">
    <label class="fieldLabel" for="onCall2">Preferred On Call #2:</label>
    <select id="onCall2" class="form-control">
      <option value="1">New Year's Day</option>
      <option value="8">Martin Luther King Day</option>
      <option value="2">Memorial Day</option>
      <option value="3">July 4th</option>
      <option value="4">Labor Day</option>
      <option value="5">Thanksgiving Day</option>
      <option value="6">Christmas Eve</option>
      <option value="7">Christmas Day</option>
    </select>
  </div>
  <div class="container" id="requestDayOffGroup">
    <label class="fieldLabel" for="dayOff">Preferred Holiday Off:</label>
    <select id="dayOff" class="form-control">
      <option value="1">New Year's Day</option>
      <option value="2">Memorial Day</option>
      <option value="3">July 4th</option>
      <option value="4">Labor Day</option>
      <option value="5">Thanksgiving Day</option>
      <option value="6">Christmas Eve</option>
      <option value="7">Christmas Day</option>
      <option value="8">New Year's Eve</option>
    </select>
  </div>
  <br />
  <div class="container">
    <button type="submit" class="btn btn-success">Submit Holiday Request</button>
  </div>
</form>
<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
<script src="assets/js/jquery.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"></script>
<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
<script src="assets/js/ie10-viewport-bug-workaround.js"></script>
</body>
</html>

