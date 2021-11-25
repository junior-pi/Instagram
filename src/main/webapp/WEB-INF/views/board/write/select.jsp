<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>write page</title>
    <link rel="stylesheet" href="/resources/stylesheets/common.css">
    <link rel="stylesheet" href="/resources/stylesheets/board/header.css">
    <link rel="stylesheet" href="/resources/stylesheets/board/write/select.css">
    <link rel="shortcut icon" href="/resources/images/instagram_logo.png">
    <!-- <script src="/resources/scripts/class.ajax.js"></script> -->
    <script src="/resources/scripts/board/select.js"></script>
</head>
<body>
<%@ include file="/WEB-INF/parts/header.jsp" %>
<main>
    <section>
        <div>
            <span>새 게시물</span>
            <img src="#" alt="사진 이미지">
        </div>
        <form id="selectForm" enctype="multipart/form-data" method="post">
            <label>
                <span hidden>사진업로드</span>
                <input type="file" name="file" required accept="image/*">
            </label>
        </form>
    </section>
</main>
</body>
</html>