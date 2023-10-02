<!DOCTYPE html>
<html lang="en">

<head>
    <link href="webjars/bootstrap/5.3.1/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Todo</title>
</head>

<body>
    <div class="container">
        <h1>Add a New Todo</h1>

        <form id="todo-form" method="post">
      

            <div>
                <label for="todo">username:</label>
                <input type="text" id="todo" name="username" required>
    
            </div>

            <div>
                <label for="todo">discription:</label>
                <input type="text" id="todo" name="discription" >
    
            </div>

            <button class="btn btn-success" type="submit">Add Todo</button>
        </form>
    </div>
    <script src="webjars/bootstrap/5.3.1/js/bootstrap.bundle.min.js">
    </script>
    <script src="resources/webjars/jquery/3.6.0/jquery.min.js">
    </script>
</body>

</html>