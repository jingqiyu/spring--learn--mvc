<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/9/10 0010
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>dataBindSuccess</title>
</head>
<body>
登录名: ${requestScope.emp.name} <br/>
生日: <fmt:formatDate value="${requestScope.emp.birthday}" pattern="yyyy年MM月"/>

</body>
</html>
