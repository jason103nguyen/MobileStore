<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<style>
		table {
			font-family: Arial, sans-serif;
			border-collapse: collapse;
			width: 100%;
		}

		td, th {
			border: 1px solid #dddddd;
			text-align: left;
			padding: 8px;
		}

		tr:nth-child(even) {
			background-color: #dddddd;
		}
	</style>
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
				<th>Unit price</th>
				<th>Unit in stock</th>
				<th>Description</th>
				<th>Manufacturer</th>
				<th>Category</th>
				<th>Condition</th>
				<th>Image</th>
			</tr>
			
			<c:forEach items="${listPhone}" var="phone">
				<tr>
					<td><c:out value="${phone.getName()}"/></td>
					<td><c:out value="${phone.getUnitPrice()}"/></td>
					<td><c:out value="${phone.getUnitInStock()}"/></td>
					<td><c:out value="${phone.getDescription()}"/></td>
					<td><c:out value="${phone.getManufacturer()}"/></td>
					<td><c:out value="${phone.getCategory()}"/></td>
					<td><c:out value="${phone.getCondition()}"/></td>
					<td><c:out value="${phone.getImage()}"/></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>

