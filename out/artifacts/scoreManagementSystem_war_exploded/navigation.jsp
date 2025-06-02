<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<style>
    .navigation {
        position: fixed;
        top: 0;
        left: 0;
        width: 200px;
        height: 100%;
        background: rgba(244, 233, 255, 0.8);
        padding: 20px;
        box-shadow: 2px 0 5px rgba(0, 0, 0, 0.1);
        z-index: 1000;
    }
    .navigation a {
        text-decoration: none;
        color: #333;
        display: block;
        margin: 10px 0;
        border-bottom:1px skyblue solid ;
        font-size: 16px;
        font-weight: bold;
        padding: 10px 0;
    }
    .navigation a:hover {
        color: #007BFF;
    }
</style>
<div class="navigation">
    <a href="myInfo.jsp" >个人中心</a>
    <a href="add_student.jsp" >添加学生信息</a>
    <a href="delete_student.jsp" >删除学生信息</a>
    <a href="query_student.jsp" >查询学生信息</a>
    <a href="modify_student.jsp" >修改学生信息</a>
</div>