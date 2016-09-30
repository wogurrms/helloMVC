<%-- 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>HelloMVC Web Application </title>
</head>
<body>

	This is the home page for shopping 

	<p> <a href="/helloMVC/home?action=login"> go to login page </a></p>
	<p> <a href="/helloMVC/home?action=register"> go to register page </a></p>

</body>
</html>

--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <title>HelloMVC Web Application</title>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>

<div class="jumbotron text-center">
  <h1>This is the home page for shopping</h1>
</div>

	<div class="container" align="center">
		<div class="row">
			<div class="col-sm-4">
				<h3>
					<a href="/helloMVC/home?action=login">Go to login page</a>
				</h3>
			</div>
			<div class="col-sm-4">
				<h3>
					<a href="/helloMVC/home?action=register">Go to register page</a>
				</h3>
			</div>
		</div>
	</div>

</body>
</html>

