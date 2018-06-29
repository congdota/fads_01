<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<sx:head/>
		<title>Login Page</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
	<style type="text/css">
	.login-form {
		width: 340px;
    	margin: 50px auto;
	}
    .login-form form {
    	margin-bottom: 15px;
        background: #f7f7f7;
        box-shadow: 0px 2px 2px rgba(0, 0, 0, 0.3);
        padding: 30px;
    }
    .login-form h2 {
        margin: 0 0 15px;
    }
    .form-control, .btn {
        min-height: 38px;
        border-radius: 2px;
    }
    .btn {        
        font-size: 15px;
        font-weight: bold;
    }
</style>
	</head>
	<body>
	
	<div class="login-form">
   <s:form action="login" method="post" validate="true">
        <h2 class="text-center">Log in</h2>       
        <div class="form-group">
        	<label></label>
        	<s:textfield name="users.index.username" class="form-control" placeholder="Username" />
       		<s:fielderror fieldName="username" />
        </div>
        <div class="form-group">
        	<s:password name="password" class="form-control" placeholder="Password"></s:password><br>
        </div>
        <div class="form-group">
            <s:submit value="Submit" class="btn btn-primary btn-block"></s:submit>
        </div>
        <div class="clearfix">
            <label class="pull-left checkbox-inline"><input type="checkbox"> Remember me</label>
            <a href="#" class="pull-right">Forgot Password?</a>
        </div>        
    </s:form>
    <p class="text-center"><a href="#">Create an Account</a></p>
</div>
	
		<%-- <h2>Welcome User, please login below</h2>
		<s:form action="login" method="post" validate="true">
			<s:text name="users.index.username"></s:text><br>
			<s:textfield name="username"></s:textfield><br>
			<s:fielderror fieldName="username" />
			<s:text name="users.index.password"></s:text><br>
			<s:password name="password"></s:password><br>
			<s:fielderror fieldName="password" />
			<s:submit value="Submit" align="center"></s:submit>
		</s:form>
		
		<s:url var="vietnam" namespace="/" action="locale">
			<s:param name="request_locale">vn</s:param>
		</s:url>
		<s:url var="english" namespace="/" action="locale">
			<s:param name="request_locale">en</s:param>
		</s:url>
	
		<s:a href="%{english}">English</s:a>
		<s:a href="%{vietnam}">Vietnamese</s:a> --%>
</body>
</html>