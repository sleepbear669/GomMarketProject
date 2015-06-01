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
            <button type="button" class="btn btn-default" ><a href="/signUp.gom">회원가입</a></button>
            <button type="button" class="btn btn-default">로그인</button>
        </div>
    </c:if>
    <c:if test="${user == null}">
        <div class="row">
            <span>${product.seller_id}님 안녕하세요.</span>
            <button type="button" class="btn btn-default"><a href="productRegister">상품등록</a></button>
            <button class="btn btn-default pull-right">로그아웃</button>
        </div>
    </c:if>
    <table class="table">
        <thead>
        <tr >
            <th class="col-md-1">상품이미지</th>
            <th class="col-md-5">상품명</th>
            <th class="col-md-2">가격</th>
            <th class="col-md-2">판매자</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${productList}" var="product">
            <tr>
                <td><img src="/resources/image/${product.image}"  class="img-responsive" alt="이미지 엄슴"/></td>
                <td>${product.product_name} </td>
                <td>${product.price} </td>
                <td>
                    <div>${product.seller_id}</div>
                    <div class="btn-group" role="group">
                        <button><a href="modify?id=${product.product_id}">수정</a></button>
                        <button><a href="remove?id=${product.product_id}">삭제</a></button>
                    </div>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>