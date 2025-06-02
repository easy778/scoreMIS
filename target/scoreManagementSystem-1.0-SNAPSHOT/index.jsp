<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>
        body, html {
            margin: 0;
            padding: 0;
            width: 100%;
            height: 100%;
            overflow: hidden;
            font-family: 'Arial', sans-serif;
        }
        body {
            animation: gradient 5s infinite;
            background: linear-gradient(270deg, #d9c8ff, #fffcd6);
            background-size: 400% 400%;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        @keyframes gradient {
            0% {
                background-position: 0% 50%;
            }
            50% {
                background-position: 100% 50%;
            }
            100% {
                background-position: 0% 50%;
            }
        }
        .background-text {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            font-size: 48px;
            color: rgba(255, 255, 255, 0.7); /* 半透明白色 */
            font-weight: bold;
            z-index: -1; /* 确保文字在登录框后面 */
        }
        .login-container {
            background: rgba(255, 255, 255, 0.8); /* 半透明背景 */
            padding: 20px;
            border-radius: 15px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            width: 350px;
            text-align: center;
            animation: fadeIn 1s ease-in-out; /* 渐显动画 */
            transition: transform 0.3s ease-in-out;
        }
        .login-container:hover {
            transform: scale(1.02); /* 鼠标悬停时放大效果 */
        }
        .login-container h1 {
            margin-bottom: 20px;
            color: #333;
            font-size: 24px;
            font-weight: bold;
        }
        .login-container .input-group {
            position: relative;
            margin-bottom: 15px;
        }
        .login-container .input-group i {
            position: absolute;
            top: 12px;
            left: 10px;
            color: #999;
            transition: color 0.3s ease-in-out;
        }
        .login-container .input-group input {
            width: 100%;
            padding: 12px 40px; /* 为图标留出空间 */
            border: 1px solid #ccc;
            border-radius: 8px;
            box-sizing: border-box;
            font-size: 14px;
            transition: border-color 0.3s ease-in-out;
        }
        .login-container .input-group input:focus {
            border-color: #007BFF;
            outline: none;
        }
        .login-container .input-group input:focus + i {
            color: #007BFF;
        }
        .login-container .input-group i.toggle-password {
            right: 10px;
            left: auto;
            cursor: pointer;
        }
        .login-container button {
            width: 100%;
            padding: 12px;
            background-color: #069831;
            color: white;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            font-size: 14px;
            transition: background-color 0.3s ease-in-out;
        }
        .login-container button:hover {
            background-color: #0056b3;
        }
        .login-container p {
            margin-top: 10px;
            font-size: 12px;
            color: #666;
        }
        .login-container p a {
            color: #007BFF;
            text-decoration: none;
            font-weight: bold;
        }
        .login-container p a:hover {
            text-decoration: underline;
        }
        @keyframes fadeIn {
            from { opacity: 0; }
            to { opacity: 1; }
        }
    </style>
    <script>
        document.addEventListener("DOMContentLoaded", function() {
            const passwordInput = document.getElementById("password");
            const togglePasswordIcon = document.querySelector(".toggle-password");

            togglePasswordIcon.addEventListener("click", function() {
                if (passwordInput.type === "password") {
                    passwordInput.type = "text";
                    togglePasswordIcon.classList.remove("fa-eye");
                    togglePasswordIcon.classList.add("fa-eye-slash");
                } else {
                    passwordInput.type = "password";
                    togglePasswordIcon.classList.remove("fa-eye-slash");
                    togglePasswordIcon.classList.add("fa-eye");
                }
            });
        });
    </script>
</head>
<body>
<div class="login-container">
    <h1>登录</h1>
    <form action="login.do" method="post">
        <div class="input-group">
            <i class="fas fa-user"></i>
            <input type="text" name="id" placeholder="请输入ID" required>
        </div>
        <div class="input-group">
            <i class="fas fa-lock"></i>
            <input type="password" id="password" name="password" placeholder="请输入密码" required>
            <i class="fas fa-eye toggle-password"></i>
        </div>
        <button type="submit">登录</button>
    </form>

</div>
</body>
</html>