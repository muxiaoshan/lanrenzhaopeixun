<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>
<h2>Hello World!</h2>
<div><a href="<%=request.getContextPath() %>/common/HelloSpringMVCController/handleRequest">Test spring mvc</a></div>
<div><a href="<%=request.getContextPath() %>/web/WebController/sayHello">say hello</a></div>
<div><a href="<%=request.getContextPath() %>/user/UserController/queryUserList">查看用户列表</a></div>
</body>
</html>
