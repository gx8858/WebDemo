<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>OA</title>
</head>
<body>
    <h4>相对路径</h4>
    <!-- 
        * 先访问index.jsp  http://localhost:8080/test/index.jsp
        * 访问demo1写法      http://localhost:8080/test/demo1
     -->
    <a href="demo1">index点击跳转demo1</a> 
    <br>
    <a href="./demo1">index点击跳转./demo1</a>
     
    <h4>index文件的绝对路径</h4>
    <a href="http://localhost:8080/test/demo1">index</a><br>
    <a href="/test/demo1">index</a>
</body>
</html>