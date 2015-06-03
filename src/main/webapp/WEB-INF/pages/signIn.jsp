<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>곰의 쇼핑몰 -로그인-</title>
    <link rel="stylesheet" href="/resources/css/bootstrap-3.3.4-dist/css/bootstrap.css"/>
</head>
<body>
<div class="container" style="height: 200px;width: 400px ;margin-top: 100px">
    <form class="form-horizontal" action="/signInAction" method="post">
        <div class="form-group ">
            <label for="inputId" class="col-xs-3 control-label">ID</label>
            <div class="col-xs-9">
                <input type="text" class="form-control" id="inputId" name="id" placeholder="아이디"/>
            </div>
        </div>
        <div class="form-group">
            <label for="inputPassword" class="col-xs-3 control-label">PASSWOARD</label>
            <div class="col-xs-9">
                <input type="password" class="form-control" id="inputPassword" name="password" placeholder="패스워드"/>
            </div>
        </div>
        <div class="form-group text-center">
            <button type="submit" class="btn btn-default">로그인</button>
            <a href="/productList" class="btn btn-default col-xs-offset-1">취소</a>
        </div>
    </form>
</div>
</body>
</html>