<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>添加学生信息</title>
    <style>
        body {
            margin: 0;
            padding: 0;
            font-family: 'Arial', sans-serif;
            background: linear-gradient(135deg, #74ebd5, #acb6e5), url('images/1.jpg') no-repeat center center fixed;
            background-size: cover;
            display: flex;
            height: 100vh;
            overflow: hidden;
        }
        .content-container {
            flex: 1;
            margin-left: 220px; /* 确保内容在导航栏右侧 */
            padding: 20px;
            background: rgba(255, 255, 255, 0.8);
            border-radius: 15px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            height: 100%;
            overflow: auto;
            text-align: center;
        }
        .content-container h1 {
            margin-bottom: 20px;
            color: #333;
            font-size: 24px;
            font-weight: bold;
        }
        .content-container form {
            display: flex;
            flex-direction: column;
            align-items: center;
            align-items: flex-start; /* 文字靠左 */
        }
        .content-container label {
            margin-bottom: 5px;
            font-weight: bold;
            text-align: left;
        }
        .form-wrapper {
            max-width: 200px;
            width: 100%;
            margin: 0 auto;
            padding: 20px;
        }

        .content-container input {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        .content-container button {
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
        .content-container button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
<jsp:include page="navigation.jsp" />
<div class="content-container">
    <h1>添加学生信息</h1>
    <div class="form-wrapper">
    <form action="add_student" method="post">
        <label for="studentId">学生ID：</label>
        <input type="text" id="studentId" name="studentId" required><br>
        <label for="name">姓名：</label>
        <input type="text" id="name" name="name" required><br>
        <label for="password">密码：</label>
        <input type="password" id="password" name="password" required><br>
        <label for="birthday">生日：</label>
        <input type="date" id="birthday" name="birthday" required><br>
        <label for="gender">性别：</label>
        <input type="radio" id="male" name="gender" value="男" required> 男
        <input type="radio" id="female" name="gender" value="女" required> 女<br>
        <label for="email">邮箱：</label>
        <input type="email" id="email" name="email" required><br>
        <label for="phone">电话：</label>
        <input type="text" id="phone" name="phone" required><br>
        <label for="address">地址：</label>
        <input type="text" id="address" name="address" required><br>
        <label for="department">所属系部：</label>
        <input type="text" id="department" name="department" required><br>
        <button type="submit">添加</button>
    </form>
</div>
</div>
</body>
</html>