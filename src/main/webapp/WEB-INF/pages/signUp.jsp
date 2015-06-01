<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>곰의 쇼핑몰 -회원가입-</title>
    <link rel="stylesheet" href="/resources/css/bootstrap-3.3.4-dist/css/bootstrap.css"/>
</head>
<body>
<div class="container">
    <form action="signUpAction" method="post">
        <div class="form-horizontal">
            <div class="form-group ">
                <label for="inputId" class="col-xs-3 control-label">ID</label>
                <div class="col-xs-9">
                    <input type="text" class="form-control" id="inputId" name="id" placeholder="아이디"/>
                </div>
            </div>
            <div class="form-group ">
                <label for="inputPassword" class="col-xs-3 control-label">Password</label>
                <div class="col-xs-9">
                    <input type="password" class="form-control" id="inputPassword" name="password" placeholder="패스워드"/>
                </div>
            </div>
            <div class="form-group ">
                <label for="inputName" class="col-xs-3 control-label">이름</label>
                <div class="col-xs-9">
                    <input type="text" class="form-control" id="inputName" name="name" placeholder="이름"/>
                </div>
            </div>
            <div class="form-group ">
                <label for="inputType" class="col-xs-3 control-label">권한</label>
                <div class="col-xs-9">
                    <select name="type" id="inputType">
                        <option value="buyer">구매자</option>
                        <option value="seller">판매자</option>
                    </select>
                </div>
            </div>
            <div class="form-group text-center">
                <button type="submit" class="btn btn-default">회워가입</button>
                <button type="button" class="btn btn-default col-xs-offset-1"><a href="/productList">취소</a></button>
            </div>
        </div>
    </form>
</div>
</body>
</html>