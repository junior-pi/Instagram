<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Instagram Direct</title>
    <link rel="shortcut icon" href="/resources/images/instagram_logo.png">
    <link rel="stylesheet" href="/resources/stylesheets/talk/direct.css">
    <link rel="stylesheet" href="/resources/stylesheets/board/header.css">
    <link rel="stylesheet" href="/resources/stylesheets/common.css">
</head>
<body>
<%@ include file="/WEB-INF/parts/header.jsp" %>
<main>
    <div>
        <section>
            <div class="left">
                <div class="user">
                    <span>nickname</span>
                    <a href="#">
                        <img src="/resources/images/talk/send_message.png">
                    </a>
                </div>
                <div class="friend">
                    <ul>
                        <li>
                            <a href="#">
                                <img src="/resources/images/board/user.png">
                                <div>
                                    <span>nickname</span>
                                    <span>메세지가 도착했습니다.</span>
                                </div>
                            </a>
                        </li>
                        <li>
                            <a href="#">
                                <img src="/resources/images/board/user.png">
                                <div>
                                    <span>nickname</span>
                                    <span>메세지가 도착했습니다.</span>
                                </div>
                            </a>
                        </li>
                    </ul>

                </div>
            </div>
        </section>
    </div>
</main>
</body>
</html>