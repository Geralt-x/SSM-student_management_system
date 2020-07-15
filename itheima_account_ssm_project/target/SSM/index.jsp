<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2020/6/3
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



<a href="account/findAll"><button>查询所有用户信息</button></a>
<br>

<h3>测试保存:提交数据到数据库保存</h3>
<form action="account/save" method="post">
    姓名：<input type="text" name="name" /><br/>
    金额：<input type="text" name="money" /><br/>
    <input type="submit" value="保存"/><br/>
</form>
</body>
</html>
