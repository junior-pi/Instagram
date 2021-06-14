<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Instagram login</title>
    <link rel="stylesheet" href="/resources/stylesheets/common.css">
    <link rel="stylesheet" href="/resources/stylesheets/user/login.css">
    <link rel="shortcut icon" href="resources/images/instagram_logo.png">
    <script src="/resources/scripts/login.js"></script>
</head>
<body class="user-login">
<main>
    <div>
        <section>
            <div>
                <div class="photo">
                    <img src="resources/images/iphone.png">
                </div>
                <div class="main_right">
                    <div class="login">
                        <img src="resources/images/instagram_logo_text.png">
                        <form>
                            <div class="email">
                                <label>
                                    <input type="text" name="email" maxlength="100" required pattern="^.{1,}$">
                                    <span>이메일</span>
<%--                                    asdfa--%>
<%--                                    sdf--%>
<%--                                    asdf--%>

<%--                                    asdf--%>
<%--                                    asd--%>
                                </label>
                            </div>
                            <div class="password">
                                <label>
                                    <input rel="password-input" type="password" name="password" maxlength="100"  required pattern="^.{1,}$">
                                    <span>비밀번호</span>
                                </label>
                            </div>
                            <div class="login_button">
                                <input rel="loginButton" type="submit" value="로그인" disabled>
                            </div>
                        </form>
                        <div class="or">
                            <div class="or_line"></div>
                            <div class="or_text"><strong>또는</strong></div>
                            <div class="or_line"></div>
                        </div>
                        <form class="forgot">
                            <a class="forgot_email" href="#">이메일을 잊으셨나요?</a>
                            <a class="forgot_password" href="#">비밀번호를 잊으셨나요?</a>
                        </form>
                    </div>
                    <div class="register">
                        계정이 없으신가요?&nbsp;&nbsp;
                        <a href="register"><strong>가입하기</strong></a>
                    </div>
                    <div class="landing">
                        <div>1</div>
                        <div>2</div>
                        <div>3</div>
                    </div>
                </div>
            </div>
        </section>
        <footer>
            <div>소개 블로그 채용 정보 도움말 API 개인정보처리방침 약관 인기 계정 해시태그 위치</div>
            <div>ⓒ 2021 어쩌고 저쩌고</div>
        </footer>
    </div>
<%@ include file="/WEB-INF/parts/footer.jsp" %>
</body>
</html>