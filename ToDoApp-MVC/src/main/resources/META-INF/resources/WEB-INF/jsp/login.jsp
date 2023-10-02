<!DOCTYPE html>
<html>
	<head>
        <link href="webjars/bootstrap/5.3.1/css/bootstrap.min.css" rel="stylesheet">
		<title>Login Page</title>
	</head>
	<body>
		<div class="container">
			<h2>Login</h2>
			<form action="/login" method="post">
				<label for="username">Username:</label>
				<input type="text" id="username" name="username" required>
				<br>
				<br>

				<label for="password">Password:</label>
				<input type="password" id="password" name="password" required>
				<br>
				<br>

				<input type="submit" value="Login">
			</form>
		</div>
	</body>
</html>
