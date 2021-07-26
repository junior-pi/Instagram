<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<!DOCTYPE HTML>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Instagram profile</title>
    <link rel="shortcut icon" href="/resources/images/instagram_logo.png">
    <link rel="stylesheet" href="/resources/stylesheets/board/header.css">
    <link rel="stylesheet" href="/resources/stylesheets/common.css">
    <link rel="stylesheet" href="/resources/stylesheets/profile/userprofile.css">
</head>
<body>
<%@ include file="/WEB-INF/parts/header.jsp" %>
<main>
    <div>
        <div class="head">
            <div>
                <img src="/resources/images/board/user.png">
            </div>
            <div class="right">
                <div>
                    <h2>USERNAME</h2>
                    <img alt="setting">
                </div>
                <div>
                    <span>게시물</span>
                    <span>팔로워</span>
                    <span>팔로우</span>
                </div>
            </div>
        </div>
    </div>

</main>
</body>
</html>