<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>Change password </title>
	</head>
	<body>
		<h3>Change Password</h3>
		<s:form action="changepassword" namespace="/" >
		<s:text name="user.currentPassword"></s:text>
		<br>
		<s:password name="currentPass" />
		<s:fielderror fieldName="currentPass"></s:fielderror>
		<s:text name="user.newPassword"></s:text>
		<br>
		<s:password name="newPass" />
		<s:fielderror fieldName="newPass"></s:fielderror>
		<br>
		<s:text name="user.re_enterPassword"></s:text>
		<br>
		<s:password name="reenterPass" />
		<s:fielderror fieldName="reenterPass"></s:fielderror>
		<br>
		<s:submit value="Submit" name="save" />
	</s:form>
	</body>
</html>