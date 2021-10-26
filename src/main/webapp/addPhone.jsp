<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="width:50%; margin: auto;">
	<div style="background-color: #EEEEEE; padding: 20px">
		<h1>Products</h1>
		<p>Add products</p>
	</div>

<div>
	<p>Add new product <hr/></p> 
	
	<div>
		<form action="add-phone">
			<table>
				<tr>
					<td>Product name</td>
					<td><input type="text" name="productName"></td>
				</tr>
				
				<tr>
					<td>Unit price</td>
					<td><input type="text" name="unitPrice"></td>
				</tr>
				
				<tr>
					<td>Unit in stock</td>
					<td><input type="text" name="unitInStock"></td>
				</tr>
				
				<tr>
					<td>Description</td>
					<td><textarea rows="3" cols="10" name="description"></textarea></td>
				</tr>
				
				<tr>
					<td>Manufacturer</td>
					<td><input type="text" name="manufacturer"></td>
				</tr>
				
				<tr>
					<td>Category</td>
					<td><input type="text" name="category"></td>
				</tr>
				
				<tr>
					<td>Condition</td>
					<td>
						<input type="radio" id="new" name="condition" value="new">
						<label for="new">New</label>
						
						<input type="radio" id="old" name="condition" value="old">
						<label for="old">Old</label>
						
						<input type="radio" id="refurbished" name="condition" value="refurbished">
						<label for="refurbished">Refurbished</label>
					</td>
				</tr>
				
				<tr>
					<td>Product Image File</td>
					<td><input type="file" name="image"></td>
				</tr>
				
				<tr>
					<td><input type="submit" value="Add Product"></td>
				</tr>
			</table>
				
		</form>
	</div>
</div>

</body>
</html>