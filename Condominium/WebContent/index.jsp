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
    <style>
.card{
	margin: auto;
  	width: 60%;
  	border: 3px solid;
  	padding: 10px;
  	border-color: #0d6efd;
}

.cond-blue{
	display: flex;
	color: white;
	background-color: 0d6efd;
	width: 40%;
	margin-right: -15px;
	flex-direction: column;
    justify-content: center;
	border-radius: .25rem;
}

.big{
	padding-top: 20px;
	margin: auto;
	width: 850px;
	display: flex;
	align-self: center;
}
.cond-blue h1{
	align-self: center;
	margin-bottom: -10px;
	font-size: 40px;
}

.cond-blue h5{
	align-self: center;
	font-size: 18px;
}
 	</style>
</head>

<body>

<div class = "big">

<div class="cond-blue">

	<h1>Condominium</h1>
	<h5>Manage your condominium easily</h5>
</div>

<div class="card">
<article class="card-body">
	<a href="Register.jsp" class="float-right btn btn-outline-primary" >Sign up</a>
	<h4 class="card-title mb-4 mt-1">Sign in</h4>
	
	<hr>
	<form action="Login" method="post">
	
    <div class="form-group">
        <input name="uname" class="form-control" placeholder="Email or login" type="email">
    </div> <!-- form-group// -->
    
    <div class="form-group">
        <input name="pass" class="form-control" placeholder="******" type="password">
    </div> <!-- form-group// --> 
    
    <div class="form-group">
        <input name="codiceCondominio" class="form-control" placeholder="Codice Condominio" type="codiceCondominio">
    </div> <!-- form-group// -->
                                         
    <div class="row">
        <div class="col-md-6">
            <div class="form-group">
                <button type="submit" value="login "class="btn btn-primary btn-block"> Login  </button>
            </div> <!-- form-group// -->
        </div>
        <div class="col-md-6 text-right">
            <button type="submit" class="btn btn-primary btn-block"> Clear  </button>
        </div>                                            
    </div> <!-- .row// -->                                                                  

	</form>
</article>

</div> <!-- card.// -->

</div>
</body>
</html>
