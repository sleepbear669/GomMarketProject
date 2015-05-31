<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
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
            <p><span>허윤호</span>님의 장바구니</p>
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
            <tr>
                <td><img src="http://www.onlifezone.com/files/attach/images/5947198/782/023/010/2.jpg"  class="img-responsive" alt=""/></td>
                <td>품질좋은 어쩌구 저쪼구</td>
                <td>가격</td>
                <td>판매자는 누구?</td>
                <td>
                    <button class="btn btn-default cancel">주문취소</button>
                </td>
            </tr>
            <tr >
                <td><img src="http://www.onlifezone.com/files/attach/images/5947198/782/023/010/2.jpg"  class="img-responsive" alt=""/></td>
                <td >품질좋은 어쩌구 저쪼구</td>
                <td>가격</td>
                <td>판매자는 누구?</td>
                <td>
                    <button class="btn btn-default cancel">주문취소</button>
                </td>
            </tr>
            <tr>
                <td><img src="http://www.onlifezone.com/files/attach/images/5947198/782/023/010/2.jpg"  class="img-responsive" alt=""/></td>
                <td>품질좋은 어쩌구 저쪼구</td>
                <td>가격</td>
                <td>판매자는 누구?</td>
                <td>
                    <button class="btn btn-default cancel">주문취소</button>
                </td>
            </tr>
            </tbody>
        </table>
        <p class="text-center">총가격 <span id="price">15000</span></p>
    </div>
</body>
</html>