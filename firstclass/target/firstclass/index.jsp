<%--
  Created by IntelliJ IDEA.
  User: fanlun
  Date: 2018/3/13
  Time: 11:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
    <%
        pageContext.setAttribute("App_path", request.getContextPath());
    %>
</head>

<style type="text/css">
    .box {
        width: 400px;
        height: 300px;
        margin: 200px auto;
        display: block;
        position: relative;
    }

    .btn_style {
        width: 100px;
        height: 30px;
        display: block;
        position: absolute;

        text-decoration: none;
        text-align: center;
        line-height: 30px;
        color: #ffffff;
        background-color: #058;
    }

    #btn_reset {
        right: 50px;
    }

    #btn_reset:hover {
        background-color: #047;
    }

    #btn_login {
        margin-left: 50px;
    }

    #btn_login:hover {
        background-color: #047;
    }
</style>

<script type="text/javascript">
    function reset() {
        document.getElementById("userName").value = "";
        document.getElementById("password").value = "";
        document.getElementById("error").innerHTML = "";
    }

    function login() {
        document.getElementById("form").submit();
    }
</script>

<body>

<a href="/ap.html">ap</a>
<br/>

<div align="center" class="box">
    <form id="form" method="post" action="/login.html">
        userName :
        <input type="text" value="${username}" name="username"/>
        <p/>
        password:
        <input type="password" value="${password}" name="password" id="password"/>
        <br/>
        <p/>
        code:
        <input type="text" value="" name="code"/>
        <br/>
        <p/>
    </form>
    <a class="btn_style" id="btn_login" href="javascript:login()">登陆</a>
    <br/>
    <a class="btn_style" id="btn_reset" href="javascript:reset()">重置</a>
    <br/>
    <font id="error" color="red">${error}</font>
</div>
</body>
</html>
