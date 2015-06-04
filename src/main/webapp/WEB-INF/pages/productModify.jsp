<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head lang="en">
    <meta charset="UTF-8">
    <title>곰의 쇼핑몰 -상품수정-</title>
    <link rel="stylesheet" href="/resources/css/bootstrap-3.3.4-dist/css/bootstrap.css"/>
</head>
<body>
<div class="container">
    <div class="row">
        <p ><span id="name">${product.seller_id}</span>님의 상품</p>
    </div>
    <form action="/productModifyAction" class="form-horizontal" method="post">
        <input type="hidden" name="product_id" value="${product.product_id}">
        <div class="form-group ">
            <label for="inputImg" class="col-lg-2 control-label">상품이미지</label>
            <div class="col-xs-4">
                <input type="file" class="form-control" id="inputImg" name="image" />
            </div>
            <c:if test="${product != null}">
                <img src="/resources/image/${product.image}"  class="img-responsive" alt="이미지 엄슴"/>
            </c:if>
        </div>
        <div class="form-group ">
            <label for="inputProduct" class="col-xs-2 control-label">상품명</label>
            <div class="col-xs-4">
                <input type="text" class="form-control" id="inputProduct" name="product_name" value="${product.product_name}"/>
            </div>
        </div>
        <div class="form-group ">
            <label for="inputPrice" class="col-xs-2 control-label">가격</label>
            <div class="col-xs-4">
                <input type="text" class="form-control" id="inputPrice" name="price" value="${product.price}" />
            </div>
        </div>
        <div class="form-group ">
            <label for="inputDescribe" class="col-xs-2 control-label">상품상세설명</label>
            <div class="col-xs-9">
                <textarea rows="5" cols="5" class="form-control" id="inputDescribe" name="contents" >${product.contents}</textarea>
            </div>
        </div>
        <input type="hidden" name="seller_id" value="${user.id}"/>
        <div class="text-center">
            <button type="submit" class="btn btn-default">수정</button>
            <a href="/productList" class="btn btn-default">취소</a>
        </div>
    </form>
</div>
</body>
</html>