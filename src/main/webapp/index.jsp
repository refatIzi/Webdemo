<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Form - Modal</title>
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
<!-- Form-->
<div class="form">
    <div class="form-toggle"></div>
    <div class="form-panel one">
        <div class="form-header">
            <h1>Account Login</h1>
        </div>
        <div class="form-content">
            <form method="post" action="authorization">
                <div class="form-group">
                    <label for="username">Username</label>
                    <input type="text" id="username" name="username" required="required"/>
                </div>
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" id="password" name="password" required="required"/>
                </div>
                <div class="form-group">
                    <label class="form-remember">
                        <a class="form-recovery" href="http://localhost:8080/registration">Registration</a>
                    </label>
                    <a class="form-recovery" href="http://localhost:8080/account">Forgot Password?</a>
                </div>
                <div class="form-group">
                    <button type="submit">Log In</button>
                </div>
            </form>
        </div>
    </div>
</div>
<div class="pen-footer"><a href="http://localhost:8080" target="_blank">
  <i class="material-icons">arrow_backward</i>View
    on Behance</a><a href="http://localhost:8080" target="_blank">View on Github<i
        class="material-icons">arrow_forward</i></a></div>
</body>
</html>