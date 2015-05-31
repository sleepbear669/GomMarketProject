<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
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
    <div class="row">
        <button type="button" class="btn btn-default">회원가입</button>
        <button type="button" class="btn btn-default">로그인</button>
    </div>
    <div class="row">
        <span>허윤호님 안녕하세요.</span>
        <button type="button" class="btn btn-default">상품등록</button>
        <button class="btn btn-default pull-right">로그아웃</button>
    </div>
    <table class="table">
        <thead>
            <tr >
                <th class="col-md-1">상품이미지</th>
                <th class="col-md-5">상품명</th>
                <th class="col-md-3">가격</th>
                <th class="col-md-3">판매자</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><img src="http://www.onlifezone.com/files/attach/images/5947198/782/023/010/2.jpg"  class="img-responsive" alt=""/></td>
                <td>품질좋은 어쩌구 저쪼구</td>
                <td>가격</td>
                <td>판매자는 누구?</td>
            </tr>
            <tr >
                <td><img src="http://www.onlifezone.com/files/attach/images/5947198/782/023/010/2.jpg"  class="img-responsive" alt=""/></td>
                <td >품질좋은 어쩌구 저쪼구</td>
                <td>가격</td>
                <td>판매자는 누구?</td>
            </tr>
            <tr>
                <td><img src="http://www.onlifezone.com/files/attach/images/5947198/782/023/010/2.jpg"  class="img-responsive" alt=""/></td>
                <td>품질좋은 어쩌구 저쪼구</td>
                <td>가격</td>
                <td>판매자는 누구?</td>
            </tr>
        </tbody>
    </table>
</div>
</body>
</html>