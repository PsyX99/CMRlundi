<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html >

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>Grayscale - Start Bootstrap Theme</title>

<!-- Bootstrap Core CSS -->
<link
	href="<%=request.getContextPath()%>/resources/theme_bootstrap/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Custom CSS -->
<link
	href="<%=request.getContextPath()%>/resources/theme_bootstrap/css/grayscale.css"
	rel="stylesheet">

<!-- Custom Fonts -->
<link
	href="<%=request.getContextPath()%>/resources/theme_bootstrap/font-awesome/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href="<%=request.getContextPath()%>/resources/theme_bootstrap/css/styleHome.css"
	rel="stylesheet" type="text/css">
<link
	href="http://fonts.googleapis.com/css?family=Lora:400,700,400italic,700italic"
	rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
</head>


<body id="page-top" data-spy="scroll" data-target=".navbar-fixed-top">
	<!-- Navigation -->
	<nav class="navbar navbar-custom navbar-fixed-top" role="navigation">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-main-collapse">
					<i class="fa fa-bars"></i>
				</button>
				<a class="navbar-brand page-scroll" href="#page-top"> <i><img
						src="<%= request.getContextPath()%>/resources/theme_bootstrap/img/logointi.png"
						height="40px"></i> INTI Formation
				</a>
			</div>

			<!-- Recueillir les liens de navigation, les formulaires et autres contenu -->
			<div class="collapse navbar-collapse navbar-right navbar-main-collapse">
				<ul class="nav navbar-nav">
					<li class="hidden"><a href="#page-top"></a></li>
					<li><a href="<c:url value="/listClient"/>">Particulier</a></li>
					<li><a href="<c:url value="/listEmploye"/>">Entreprise</a></li>
					<li><a href="<c:url value="/lancerCampagne"/>">Lancer Campagne</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<!-- Intro Header -->
	<header class="intro">
		<div class="intro-body">
			<div class="container">
				<div class="row">
					<div class="col-md-8 col-md-offset-2">
						<h1 class="brand-heading"></h1>
						<p class="intro-text"></p>
						<a href="#about" class="btn btn-circle page-scroll"> <i
							class="fa fa-angle-double-down animated"></i>
						</a>
					</div>
				</div>
			</div>
		</div>
	</header>


<!--  ex : Ajouter client  -->











<!--ex : FIN Ajouter un client-->


<!-- Afficher liste des Clients-->










<!--FIN Afficher Liste des Clients--> 



<section id="about" class="container content-section text-center">
		<p>...............................</p>
		
	</section>

	<!-- Contact Section -->
	<section id="contact" class="container content-section text-center">
		<div class="row">
			<div class="col-lg-8 col-lg-offset-2">
				<p>N'hésitez pas à nous contacter par mail:    
					<a href="mailto:feedback@startbootstrap.com">   CRM@gmail.com</a>
				</p>
				<ul class="list-inline banner-social-buttons">
					<li><a href="https://www.definitions-marketing.com/definition/campagne-marketing/"
						class="btn btn-default btn-lg"><i
							class="fa fa-google-plus fa-fw"></i><span class="network-name"> Une campagne marketing ?</span></a>
					</li>
				</ul>
			</div>
		</div>
	</section>

	<!-- Footer -->
	<footer>
		<div class="container text-center">
			<p>Copyright &copy; Adaming 2017</p>
		</div>
	</footer>

	<!-- jQuery -->
	<script
		src="<%=request.getContextPath()%>/resources/theme_bootstrap/js/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script
		src="<%=request.getContextPath()%>/resources/theme_bootstrap/js/bootstrap.min.js"></script>

	<!-- Plugin JavaScript -->
	<script
		src="<%=request.getContextPath()%>/resources/theme_bootstrap/js/jquery.easing.min.js"></script>


	<!-- Custom Theme JavaScript -->
	<script
		src="<%=request.getContextPath()%>/resources/theme_bootstrap/js/grayscale.js"></script>

</body>

</html>
