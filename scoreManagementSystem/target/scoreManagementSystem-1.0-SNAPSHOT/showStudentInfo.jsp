<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <title>学生信息列表</title>
</head>
<body>
<h1>学生信息列表</h1>
<table border="1">
    <thead>
    <tr>
        <th>学生ID</th>
        <th>姓名</th>
        <th>性别</th>
        <th>生日</th>
        <th>邮箱</th>
        <th>电话</th>
        <th>地址</th>
        <th>所属系部</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="student" items="${requestScope.students}">
        <tr>
            <td>${student.studentId}</td>
            <td>${student.name}</td>
            <td>${student.gender}</td>
            <td>${student.birthday}</td>
            <td>${student.email}</td>
            <td>${student.phone}</td>
            <td>${student.address}</td>
            <td>${student.department}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>