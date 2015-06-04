<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
        <div class="col-lg-5"><h1>${product.product_name}</h1></div>
        <a href="/productList" class="btn btn-default col-md-1 col-xs-offset-1">목록</a>
        <c:if test="${user.id == product.seller_id}">
            <a href="/modify?id=${product.product_id}" class="btn btn-default col-md-1 col-xs-offset-1">수정</a>
        </c:if>
    </div>
    <div >
        <img src="/resources/image/${product.image}" alt="이미지엄슴" class="img-responsive"/>
        <p>가격: <span id="price">${product.price}</span></p>
        <p>이름: <span id="name" >${product.seller_id}</span></p>
        <a href="" class="btn btn-default">구매</a>
    </div>
    <div id="explain">
        <h2>상품상세설명</h2>
        <div>${product.contents}</div>
    </div>
</div>
</body>
</html>