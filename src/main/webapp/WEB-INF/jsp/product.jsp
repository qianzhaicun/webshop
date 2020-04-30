<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type"
	content="text/html; charset=ISO-8859-
1">
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
	<script
src="https://ajax.googleapis.com/ajax/libs/angularjs/1.0.1/angular.min.
js">
</script>
<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1>Products</h1>
			</div>
		</div>
	</section>
	<section class="container">
		<div class="row">


			<div class="col-sm-6 col-md-3" style="padding-bottom: 15px">
				<div class="thumbnail">
					<div class="col-md-5">
						<img
							src="<c:url value="/resource/images/${product.productId}.jpg">
</c:url>"
							alt="image" style="width: 100%" />
					</div>
					<div class="caption">

						<h3>${product.name}</h3>
						<p>${product.description}</p>
						<p>${product.unitPrice}</p>
						<p>${product.category}</p>
						<p>${product.manufacturer}</p>

						<p>Available ${product.unitsInStock} units in stock</p>
					</div>
				</div>
			</div>

		</div>
		<div class="row">
			<div class="col-md-5">
				<h3>${product.name}</h3>
				<p>${product.description}</p>
				<p>
					<strong>Item Code : </strong><span class="label labelwarning">${product.productId}</span>
				</p>
				<p>
					<strong>manufacturer</strong> : ${product.manufacturer}
				</p>
				<p>
					<strong>category</strong> : ${product.category}
				</p>
				<p>
					<strong>Availble units in stock </strong> : ${product.unitsInStock}
				</p>

				<h4>${product.unitPrice}USD</h4>
				<p>
					<a href="#" class="btn btn-warning btn-large"> <span
						class="glyphicon-shopping-cart glyphicon"></span> Order Now
					</a>
				</p>
			</div>
		</div>
	</section>
</body>
</html>