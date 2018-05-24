<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<style>
    ul {
    list-style-type: none;
    margin: 0;
    padding: 0;
    overflow: hidden;
    background-color: #333;
}
li {
    float: left;
}
li a {
    display: block;
    color: #FFDAB9;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
}
li a:hover {
    background-color: #111;
}
#miragex {
  opacity: 0.9;
}
     .center {
    position: absolute;
    left: 40%;
    top: 40%;
    width: 20%;
    text-align: center;
    font-size: 18px;
    background-color: black;
    opacity: 0.8;
    border-radius: 12px;
    color: #FFDAB9;
}
      div.container {
    position: relative;
    top: 500px;
    background-color: black;
    opacity: 0.85;
    color: #FFDAB9
      }
    </style>
    
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">
    
    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
       <link rel="stylesheet" href="qunit-2.4.1.css">
    <script src="typeit.js"></script>
     
    <div id="qunit-fixture"></div>
    <script src="qunit-2.4.1.js"></script>
    <script src="tests.js"></script>
    <script src="typeit.js"></script>

     <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
   
    <script src="js/bootstrap.min.js"></script>
    
     <!-- Custom styles for this template -->
    <link href="style.css" rel="stylesheet">
    
    <!-- NAVBAR
================================================== -->
      <ul>
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="#news">What's On</a></li>
  <li><a href="#contact">About Us</a></li>
  <li><a href="#about">Places To Go</a></li>
  </ul>
</body>

  <title>Bootstrap Example</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
    
<title>${movie.title}</title>
</head>



<body>

<center><img src= ${movie.posterUrl} height="275" width="150">
<h1>${movie.title}</h1>
<p>${movie.rating}</p>
<p>${movie.releaseYear}</p>
<p>${movie.director}</p>
<p>${movie.actors}</p>
<p>${movie.actors}</p>

<li><a href="2DTicketBooking.html">Showing Time: 14:30. 2D</a></li>
<li><a href="3DTicketBooking.html">Showing Time: 16:30. 3D</a></li>
<li><a href="2DTicketBooking.html">Showing Time: 18:30. 2D</a></li>
<li><a href="ImaxTicketBooking.html">Showing Time: 20:30. Imax</a></li>
</center>


</html>