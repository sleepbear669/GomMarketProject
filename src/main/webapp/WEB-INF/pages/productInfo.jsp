<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>곰의 쇼핑몰 -상품 정보-</title>
    <link rel="stylesheet" href="/resources/css/bootstrap-3.3.4-dist/css/bootstrap.css"/>
</head>
<body>
<div class="container">
    <div class="row head" >
        <div class="col-lg-6"><h1>품질좋은 상품A% 할인판매</h1></div>
        <button class="btn btn-default col-md-1 col-xs-offset-1">목록</button>
        <button class="btn btn-default col-md-1 col-xs-offset-1">수정</button>
    </div>
    <div class="row">
        <img src="http://www.onlifezone.com/files/attach/images/5947198/782/023/010/2.jpg" alt="" class="img-responsive col-xs-4"/>
        <p>가격: <span id="price">15000</span></p>
        <p>이름: <span id="name" >제주대학교</span></p>
        <button class="btn btn-default">구매</button>
    </div>
    <div id="explain">
        <h2>상품상세설명</h2>
        <div>
            상품A는 품질이 좋습니니다.<br>
            상품A는 가격이 저렴합니다.<br>
        </div>
    </div>
</div>
</body>
</html>