<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Prestige Computers</title>
<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="http://code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<link
	href="//netdna.bootstrapcdn.com/bootswatch/3.1.0/united/bootstrap.min.css"
	rel="stylesheet">
<link href="../public/css/colorbox.css" rel="stylesheet">
<script
	src="//maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery.colorbox/1.6.3/jquery.colorbox-min.js"></script>
<style>
body {
	background: url("../public/img/backdrop.png");
	font: 400 15px Lato, sans-serif;
}

.centered-form .panel {
	background: rgba(255, 255, 255, 0.8);
	box-shadow: rgba(0, 0, 0, 0.3) 20px 20px 20px;
}

.panel:hover {
	box-shadow: 5px 0px 40px rgba(0, 0, 0, .2);
}

.centered-form {
	margin-top: 60px;
}

.register:hover {
	box-shadow: 0px 0px 0px rgba(0, 0, 0, 0);
}

.register {
	display: block;
}
</style>
</head>
<body>
  	<jsp:include page="../components/navbar.jsp"/>

	<!--- Sales --->
	<div class="container">
		<h2>
			<a href="../index.jsp">Home</a> >> <a href="printers.jsp">Printers</a>
		</h2>
		<p>Showing 8 items in Printers</p>
		<hr>
		<br>
		<div class="row">
			<div class="col-xs-6 col-sm-6 col-md-3 text-center leftspan">
				<a href="#"><img
					src="../public/img/website/categories/3dprinting.jpg"
					class="img-responsive center-block" alt="3D Printing">3D
					Printing</a>
			</div>
			<div class="col-xs-6 col-sm-6 col-md-3 text-center leftspan">
				<a href="#"><img
					src="../public/img/website/categories/inkcartridges.jpg"
					class="img-responsive center-block" alt="Ink Cartridges">Ink
					Cartridges</a>
			</div>
			<div class="col-xs-6 col-sm-6 col-md-3 text-center leftspan">
				<a href="#"><img
					src="../public/img/website/categories/inkjet.jpg"
					class="img-responsive center-block" alt="Inkjet Printers">Inkjet
					Printers</a>
			</div>
			<div class="col-xs-6 col-sm-6 col-md-3 text-center leftspan">
				<a href="#"><img
					src="../public/img/website/categories/labelmakers.jpg"
					class="img-responsive center-block" alt="Label Makers">Label
					Makers</a>
			</div>
			<div class="col-xs-6 col-sm-6 col-md-3 text-center leftspan">
				<a href="#"><img
					src="../public/img/website/categories/largeformatprinters.jpg"
					class="img-responsive center-block" alt="Large Format Printers">Large
					Format Printers</a>
			</div>
			<div class="col-xs-6 col-sm-6 col-md-3 text-center leftspan">
				<a href="#"><img
					src="../public/img/website/categories/laserprinters.jpg"
					class="img-responsive center-block" alt="Laser Printers">Laser
					Printers</a>
			</div>
			<div class="col-xs-6 col-sm-6 col-md-3 text-center leftspan">
				<a href="#"><img
					src="../public/img/website/categories/multifunctionprinters.jpg"
					class="img-responsive center-block" alt="Multifunction Printers">Multifunction
					Printers</a>
			</div>
			<div class="col-xs-6 col-sm-6 col-md-3 text-center leftspan">
				<a href="#"><img
					src="../public/img/website/categories/tonerdrum.jpg"
					class="img-responsive center-block" alt="Toner & Drum">Toner
					& Drum</a>
			</div>
		</div>
	</div>

	<br>
	<br>
	<footer class="container-fluid text-center">
		<p>Copyright 2016, Prestige Computers</p>
		<form class="form-inline">
			Get deals: <input type="email" class="form-control" size="50"
				placeholder="Email Address">
			<button type="button" class="btn btn-danger">Sign Up</button>
		</form>
	</footer>

</body>
</html>