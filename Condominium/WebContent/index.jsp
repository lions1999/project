<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<!------ Include the above in your HEAD tag ---------->

<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.8/css/all.css">

<html>
<head>
    <title>Login page</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <link href="css/style.css" rel="stylesheet">
    <style>
.card{
	margin: auto;
  	width: 30%;
  	border: 3px solid green;
  	padding: 10px;
}
 	</style>
</head>

<body>
<p></p>

<div class="card">
<article class="card-body">
	<a href="Register.jsp" class="float-right btn btn-outline-primary" >Sign up</a>
	<h4 class="card-title mb-4 mt-1">Sign in</h4>
	<p>
		<a href="" class="btn btn-block btn-outline-info"> <i class="fab fa-google"></i>   Login via Google</a>
		<a href="" class="btn btn-block btn-outline-primary"> <i class="fab fa-facebook-f"></i>   Login via facebook</a>
	</p>
	<hr>
	<form>
    <div class="form-group">
        <input name="" class="form-control" placeholder="Email or login" type="email">
    </div> <!-- form-group// -->
    <div class="form-group">
        <input class="form-control" placeholder="******" type="password">
    </div> <!-- form-group// -->                                      
    <div class="row">
        <div class="col-md-6">
            <div class="form-group">
                <button type="submit" class="btn btn-primary btn-block"> Login  </button>
            </div> <!-- form-group// -->
        </div>
        <div class="col-md-6 text-right">
            <button type="submit" class="btn btn-primary btn-block"> Clear  </button>
        </div>                                            
    </div> <!-- .row// -->                                                                  
</form>
</article>
</div> <!-- card.// -->
</body>
</html>
