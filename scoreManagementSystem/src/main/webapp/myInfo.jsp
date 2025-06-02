<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>个人中心</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Arial', sans-serif;
            background: linear-gradient(135deg, #74ebd5, #acb6e5), url('images/1.jpg') no-repeat center center fixed;
            background-size: cover;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            overflow: hidden;
        }
        .personal-center-container {
            background: rgba(255, 255, 255, 0.8);
            padding: 20px;
            border-radius: 15px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            width: 400px;
            text-align: center;
            animation: fadeIn 1s ease-in-out;
            transition: transform 0.3s ease-in-out;
            margin-left: 220px; /* 确保内容在导航栏右侧 */
        }
        .personal-center-container:hover {
            transform: scale(1.02);
        }
        .personal-center-container h1 {
            margin-bottom: 20px;
            color: #333;
            font-size: 24px;
            font-weight: bold;
        }
        .personal-center-container p {
            margin-bottom: 10px;
            font-size: 16px;
            color: #555;
        }
        .personal-center-container button {
            display: block;
            width: 100%;
            padding: 12px;
            margin: 10px 0;
            background-color: #007BFF;
            color: white;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            font-size: 14px;
            transition: background-color 0.3s ease-in-out;
        }
        .personal-center-container button:hover {
            background-color: #0056b3;
        }
        @keyframes fadeIn {
            from { opacity: 0; }
            to { opacity: 1; }
        }
    </style>
</head>
<body>
<jsp:include page="navigation.jsp" />
<div class="personal-center-container">
    <h1>个人中心</h1>
    <p>用户ID: <span id="userId">123456</span></p > <!-- 假设用户ID为123456 -->
    <p>姓名: <span id="userName">张三</span></p > <!-- 假设用户名为张三 -->
    <p>角色: <span id="userRole">学生</span></p > <!-- 假设用户角色为学生 -->
    <button onclick="window.location.href='logout.jsp'">退出登录</button>
</div>
</body>
</html>