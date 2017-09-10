<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/10 0010
  Time: 10:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>DateBindTest</title>
</head>
<body>
<form action="register" method="post">
    <table>
        <tr>
            <td><label>名字:</label></td>
            <td><label for="name"></label><input type="text" id="name" name="name"/></td>
        </tr>
        <tr>
            <td><label>生日:</label></td>
            <td><label for="birthday"></label><input type="text" id="birthday" name="birthday"/></td>
        </tr>
        <tr>
            <td><input type="submit" id="submit" value="登录"></td>
        </tr>
    </table>
</form>
</body>
</html>
