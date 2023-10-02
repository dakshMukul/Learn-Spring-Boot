<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

	<html>

	<head>
		<link href="webjars/bootstrap/5.3.1/css/bootstrap.min.css" rel="stylesheet">
		<meta charset="UTF-8">
		<title>Todo list page</title>
	</head>

	<body>
		<div class="container">
			<h2> Your todos</h2>

			<table class="table">
				<thead>
					<tr>
						<th>id</th>
						<th>Description</th>
						<th>target Date</th>
						<th>Is Done</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${todos}" var="todos">
						<tr>
							<td>${todos.id}</td>
							<td>${todos.discription}</td>
							<td>${todos.targetDate}</td>
							<td>${todos.done}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a href="add-todo" class="btn btn-success">Add ToDo</a>
		</div>
		<script src="webjars/bootstrap/5.3.1/js/bootstrap.bundle.min.js">
		</script>
		<script src="resources/webjars/jquery/3.6.0/jquery.min.js">
		</script>
	</body>

	</html>