<%--
  Created by IntelliJ IDEA.
  User: phuong
  Date: 02/11/2021
  Time: 8:17 SA
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body style="width:50%; margin: auto;">
<div style="background-color: #EEEEEE; padding: 20px">
  <h1>Mobile Store</h1>
</div>

<div>
  <form action="login" method="post">
    <table>
      <tr>
        <td>Please sign in</td>
      </tr>

      <tr>
        <td><input type="text" placeholder="User name" name="userName"></td>
      </tr>

      <tr>
        <td><input type="text" placeholder="Password" name="password"></td>
      </tr>

      <tr>
        <td><input type="submit" value="Login"></td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>
