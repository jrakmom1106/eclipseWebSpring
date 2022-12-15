<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
     <link href="/assets/css/login.css" rel="stylesheet" type="text/css"/>
    <link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@400;500;700&display=swap" rel="stylesheet">
    <script src="https://kit.fontawesome.com/53a8c415f1.js" crossorigin="anonymous"></script>
   
</head>
<body>
    <div class="wrap">
        <div class="login">
            <h2>Log-in</h2>
            <div class="login_sns">
            <li><a href=""><i class="fab fa-instagram"></i></a></li>
            <li><a href=""><i class="fab fa-facebook-f"></i></a></li>
            <li><a href=""><i class="fab fa-twitter"></i></a></li>
            </div>
            <form action="/loginProcessing" method="post">
            <div class="login_id">
                <h4>E-mail</h4>
                <input type="text" name="username" id="username" />
            </div>
            <div class="login_pw">
                <h4>Password</h4>
                <input type="password" name="password" id="password" />
            </div>
            
            <div class="submit">
                <input type="submit"  value="로그인"/>
            </div>
            </form>
        </div>
    </div>
    
    <script>
    	
    </script>