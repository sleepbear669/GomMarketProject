<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head lang="ko">
    <meta charset="UTF-8">
    <title>곰의 쇼핑몰 -상품 목록-</title>
    <link rel="stylesheet" href="/resources/css/bootstrap-3.3.4-dist/css/bootstrap.css"/>
</head>
<body>
<div class="container">
    <div class="page-header">
        <h1>곰의 쇼핑몰</h1>

    </div>
    <c:if test="${user == null}">
        <div class="row">
            <a href="/signUp.gom" class="btn btn-default">회원가입</a>
            <a href="/signIn.gom" class="btn btn-default">로그인</a>
        </div>
    </c:if>
    <c:if test="${user != null}">
        <div class="row">
            <span>${user.id}님 안녕하세요.</span>
            <c:if test="${user.isSeller()}">
                <a class="btn btn-default" href="/productRegister.gom?seller=${user.id}">상품등록</a>
            </c:if>
            <a href="/logout" class="btn btn-default pull-right">로그아웃</a>
        </div>
    </c:if>
    <table class="table">
        <thead>
        <tr >
            <th class="col-md-1">상품이미지</th>
            <th class="col-md-5">상품명</th>
            <th class="col-md-2">가격</th>
            <th class="col-md-2">판매자</th>
            <th class="col-md-2"></th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productList}" var="product">
            <tr>
                <td><img src="/resources/image/${product.image}"  class="img-responsive" alt="이미지 엄슴"/></td>
                <td><a href="productInfo?id=${product.product_id}">${product.product_name}</a>  </td>
                <td>${product.price} </td>
                <td>
                    <div>${product.seller_id}</div>
                    <c:if test="${user.id == product.seller_id}">
                        <div class="btn-group" role="group">
                            <a class="btn btn-default" href="modify?id=${product.product_id}">수정</a>
                            <a class="btn btn-default" href="remove?id=${product.product_id}">삭제</a>
                        </div>
                    </c:if>
                </td>
                <th><a href="/productCartList?buyer_id=${user.id}&id=${product.product_id}" class="btn btn-default">구매</a></th>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>