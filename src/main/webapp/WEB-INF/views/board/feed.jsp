<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<!DOCTYPE HTML>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Instagram</title>
    <link rel="shortcut icon" href="/resources/images/instagram_logo.png">
    <link rel="stylesheet" href="/resources/stylesheets/board/feed.css">
    <link rel="stylesheet" href="/resources/stylesheets/board/header.css">
</head>
<body>
<%@include file="/WEB-INF/parts/header.jsp"%>
<main>
    <div>
        <section>
            <div class="head">
                <a href="#">
                    <img alt src="resources/images/board/user.png">
                    <span>Someone</span>
                </a>
            </div>
            <img alt src="resources/images/board/sample.jpg">
            <div class="status">
                <ul>
                    <li>
                        <a href="#">
                            <img alt src="resources/images/board/research_line.png">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img alt src="resources/images/board/direct_line.png">
                        </a>
                    </li>
                </ul>
                <div class="spring"></div>
                <ul>
                    <li>
                        <a href="#">
                            <img alr src="resources/images/board/like_line.png">
                        </a>
                    </li>
                </ul>
            </div>
            <div class="content">
                <span class="like">좋아요 100개</span>
                <span class="content">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</span>
            </div>
            <form>
                <label>
                    <span hidden>댓글</span>
                    <input maxlength="500" name="comment" placeholder="댓글 달기..." type="text" required pattern="^[ㄱ-ㅎ|가-힣|a-z|A-Z|0-9|]{1,}$">
                    <input type="submit" value="게시">
                </label>
            </form>
        </section>
        <section>
            <div class="head">
                <a href="#">
                    <img alt src="resources/images/board/user.png">
                    <span>Someone</span>
                </a>
            </div>
            <img alt src="resources/images/board/sample.jpg">
            <div class="status">
                <ul>
                    <li>
                        <a href="#">
                            <img alt src="resources/images/board/research_line.png">
                        </a>
                    </li>
                    <li>
                        <a href="#">
                            <img alt src="resources/images/board/direct_line.png">
                        </a>
                    </li>
                </ul>
                <div class="spring"></div>
                <ul>
                    <li>
                        <a href="#">
                            <img alr src="resources/images/board/like_line.png">
                        </a>
                    </li>
                </ul>
            </div>
            <div class="content">
                <span class="like">좋아요 100개</span>
                <span class="content">Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.</span>
            </div>
            <form>
                <label>
                    <span hidden>댓글</span>
                    <input maxlength="500" name="comment" placeholder="댓글 달기..." type="text" required pattern="^[ㄱ-ㅎ|가-힣|a-z|A-Z|0-9|]{1,}$">
                    <input type="submit" value="게시">
                </label>
            </form>
        </section>
    </div>
    <aside>
        <div class="user">
            <a href="#">
                <img src="resources/images/board/user.png">
            </a>
            <a><span><strong>nickname</strong></span>
                <span>name</span>
            </a>
            <div class="spring"></div>
            <a><strong>전환</strong></a>
        </div>
    </aside>
</main>
</body>
</html>