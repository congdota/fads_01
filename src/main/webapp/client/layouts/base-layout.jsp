<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tilesx"%>
<%@ taglib prefix="sx" uri="/struts-dojo-tags"%>
<!DOCTYPE html>
<html lang="ja">
<<<<<<< 514284cb26c19d394885cbc3abe80cedf157f916
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<sx:head />
<%-- Default CSS --%>
<tiles:importAttribute name="cssDefault" />
<c:forEach var="item" items="${cssDefault}">
	<link rel="stylesheet" href="<c:url value='${item}'/>" type="text/css" />
</c:forEach>

<%-- Default JS --%>
<tiles:importAttribute name="jsDefault" />
<c:forEach var="item" items="${jsDefault}">
	<script src="<c:url value="${item}"/>"></script>
</c:forEach>

<title><tiles:insertAttribute name="title" ignore="true" /></title>
</head>
<body>
	<tiles:insertAttribute name="header" />
	<div class="container"><tiles:insertAttribute name="body" /></div>
	<tiles:insertAttribute name="footer" />
</body>

<%-- Default CSS --%>
<tiles:importAttribute name="cssAdd" />
<c:forEach var="item" items="${cssAdd}">
	<link rel="stylesheet" href="<c:url value='${item}'/>" type="text/css" />
</c:forEach>

<%-- Addition JS --%>
<tiles:importAttribute name="jsAdd" />
<c:forEach var="item" items="${jsAdd}">
	<script src="<c:url value="${item}"/>"></script>
</c:forEach>
=======
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<sx:head/>
		<%-- Default CSS --%>
		<tiles:importAttribute name="cssDefault" />
		<c:forEach var="item" items="${cssDefault}">
			<link rel="stylesheet" href="<c:url value='${item}'/>" type="text/css" />
		</c:forEach>
		
		<%-- Default JS --%>
		<tiles:importAttribute name="jsDefault" />
		<c:forEach var="item" items="${jsDefault}">
			<script src="<c:url value="${item}"/>"></script>
		</c:forEach>
		
		<title><tiles:insertAttribute name="title" ignore="true" /></title>
	</head>
	<body>	
		<tiles:insertAttribute name="header" />
		<tiles:insertAttribute name="body" />	
		<tiles:insertAttribute name="footer" />	
	</body>
	
	<%-- Default CSS --%>
	<tiles:importAttribute name="cssAdd" />
	<c:forEach var="item" items="${cssAdd}">
		<link rel="stylesheet" href="<c:url value='${item}'/>" type="text/css" />
	</c:forEach>
	
	<%-- Addition JS --%>
	<tiles:importAttribute name="jsAdd" />
	<c:forEach var="item" items="${jsAdd}">
		<script src="<c:url value="${item}"/>"></script>
	</c:forEach>
>>>>>>> Get list News follow Category
</html>
