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
        <p ><span id="name">제주대학교</span>님의 상품</p>
    </div>
    <form action="" class="form-horizontal">
        <div class="form-group ">
            <label for="inputImg" class="col-lg-2 control-label">상품이미지</label>
            <div class="row col-xs-4">
                <input type="file" class="form-control" id="inputImg" />
            </div>
            <img src="http://www.onlifezone.com/files/attach/images/5947198/782/023/010/2.jpg" class="col-xs-offset-1" alt="" style="width: 100px; height: 100px;"/>
        </div>
        <div class="form-group ">
            <label for="inputProduct" class="col-xs-2 control-label">상품명</label>
            <div class="col-xs-4">
                <input type="text" class="form-control" id="inputProduct" value="곰곰곰" />
            </div>
        </div>
        <div class="form-group ">
            <label for="inputPrice" class="col-xs-2 control-label">가격</label>
            <div class="col-xs-4">
                <input type="text" class="form-control" id="inputPrice" value="15000"/>
            </div>
        </div>
        <div class="form-group ">
            <label for="inputDescribe" class="col-xs-2 control-label">상품상세설명</label>
            <div class="col-xs-9">
                <textarea rows="5" cols="5" class="form-control" id="inputDescribe" >
                    상품A는 품질이 좋습니니다.
                    상품A는 가격이 저렴합니다.
                </textarea>
            </div>
        </div>
        <div class="text-center">
            <button class="btn btn-default">등록</button>
            <button class="btn btn-default">취소</button>
        </div>
    </form>
</div>
</body>
</html>