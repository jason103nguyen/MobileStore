<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="width:50%; margin: auto;">
	<div style="background-color: #EEEEEE; padding: 20px">
		<h1>Products</h1>
		<p>All the available products in our store</p>
	</div>

	<div>
		<table>
			<tr>
				<th>Name</th>
				<th>Unit price</th>
			</tr>
			
			<c:forEach items="${listPhone}" var="phone">
				<tr>
					<td>${phone.getName()}</td>
					<td>${phone.getUnitPrice()}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>

