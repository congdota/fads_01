<%@include file="/includedTags.jsp"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Sign Page</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css"
	rel="stylesheet" id="bootstrap-css">
<script
	src="//netdna.bootstrapcdn.com/bootstrap/3.1.0/js/bootstrap.min.js"></script>
<script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


</head>
<body>
	<div class="container">
		<div id="loginbox"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2 m-t-50">
		</div>
		<div id="signupbox" style="margin-top: 50px"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Sign Up</div>
					<div
						style="float: right; font-size: 85%; position: relative; top: -10px">
						<a id="signinlink" href="#"
							onclick="$('#signupbox').hide(); $('#loginbox').show()">Sign
							In</a>
					</div>
				</div>
				<div class="panel-body">
					<c:url var="signUpUrl" value="/signUp" />
					<form action="${signUpUrl}" method="post" id="loginform"
						class="form-horizontal" role="form">
						<input type="hidden" name="${_csrf.parameterName}"
							value="${_csrf.token}" />
						<div id="signupalert" style="display: none"
							class="alert alert-danger">
							<p>Error:</p>
							<span></span>
						</div>

						<div class="form-group">
							<label for="username" class="col-md-3 control-label">User
								name</label>
							<div class="col-md-9">
								<s:textfield name="user.username" placeholder="Enter username"
									class="form-control" id="username"></s:textfield>
								<s:fielderror fieldName="user.username" />
							</div>
						</div>

						<div class="form-group">
							<label for="password" class="col-md-3 control-label">Password</label>
							<div class="col-md-9">
								<s:password name="user.password" placeholder="Enter Password"
									class="form-control"></s:password>
								<s:fielderror fieldName="user.password" />
							</div>
						</div>
						<div class="form-group">
							<label for="reenterPass" class="col-md-3 control-label">Confirm
								Password</label>
							<div class="col-md-9">
								<s:password name="reenterPass"
									placeholder="Re-Enter Password" class="form-control"></s:password>
								<s:fielderror fieldName="reenterPass" />
							</div>
						</div>
						<div class="form-group">
							<label for="fullname" class="col-md-3 control-label">Full
								name</label>
							<div class="col-md-9">
								<s:textfield name="user.fullname" placeholder="Enter fullname"
									class="form-control" id="fullname"></s:textfield>
								<s:fielderror fieldName="user.fullname" />
							</div>
						</div>

						<div class="form-group">
							<label for="image" class="col-md-3 control-label">Upload
								image</label>
							<div class="col-md-9">
								<%-- <s:file name="myFiles" label="Select a File to upload" /> --%>
								<input type="file" name="myFiles" />
								<s:fielderror fieldName="myFiles"></s:fielderror>
							</div>
						</div>

						<div class="form-group">
							<label for="icode" class="col-md-3 control-label">Birthday</label>
							<div class="col-md-9">
								<sx:datetimepicker name="user.birthday"
									displayFormat="dd-MMM-yyyy" />
								<s:fielderror fieldName="user.birthday" />
							</div>
						</div>

						<div class="form-group">
							<!-- Button -->
							<div class="col-md-offset-3 col-md-9">
								<s:submit type="submit" name="submit" value="Submit"
									class="btn btn-primary"></s:submit>
								<span style="margin-left: 8px;">or</span>
							</div>
						</div>

						<div style="border-top: 1px solid #999; padding-top: 20px"
							class="form-group">

							<div class="col-md-offset-3 col-md-9">
								<button id="btn-fbsignup" type="button" class="btn btn-primary">
									<i class="icon-facebook"></i>   Sign Up with Facebook
								</button>
							</div>

						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
</html>