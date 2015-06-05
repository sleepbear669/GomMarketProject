<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>곰 쇼핑몰 -장바구니-</title>
    <link rel="stylesheet" href="/resources/css/bootstrap-3.3.4-dist/css/bootstrap.css"/>
</head>
<body>
<div class="container">
    <div class="row">
        <p><span>${user.name}</span>님의 장바구니</p>
    </div>
    <table class="table">
        <thead>
        <tr >
            <th class="col-md-1">상품이미지</th>
            <th class="col-md-5">상품명</th>
            <th class="col-md-3">가격</th>
            <th class="col-md-2">판매자</th>
            <th class="col-md-1"></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productList}" var="product">
            <tr>
                <td><img src="/resources/image/${product.image}"  class="img-responsive" alt="이미지 엄슴"/></td>
                <td><a href="productInfo?id=${product.product_id}">${product.product_name}</a>  </td>
                <td>${product.price} </td>
                <td>${product.seller_id}</td>
                <td><a href="" class="btn btn-default">주문취소</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
    <p class="text-center">총가격 <span id="price">15000</span></p>
</div>
</body>
</html>