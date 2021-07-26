<%@ page import="dev.juniorpi.instagram.securities.Regex" %>
<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<!DOCTYPE HTML>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Instagram login</title>
    <link rel="stylesheet" href="/resources/stylesheets/common.css">
    <link rel="stylesheet" href="/resources/stylesheets/user/register.css">
    <link rel="shortcut icon" href="/resources/images/instagram_logo.png">
    <script src="/resources/scripts/user/register.js"></script>
</head>
<body>
<main>
    <div>
        <section>
            <div>
                <div class="photo">
                    <img src="/resources/images/iphone.png">
                </div>
                <div class="main_right">
                    <div class="register">
                        <img src="/resources/images/instagram_logo_text.png">
                        <strong class="text">친구들의 사진과 동영상을 보려면 가입하세요.</strong>
                        <div class="line"></div>
                        <form id="registerForm">
                            <div class="email">
                                <label>
                                    <input type="text" name="email" maxlength="100" required pattern="^.{1,}$" data-regex="<%=Regex.EMAIL%>">
                                    <span>이메일</span>
                                    <div class="xicon"><img src="/resources/images/icon_x.png"></div>
                                    <div class="checkicon"><img src="/resources/images/icon_check.png"></div>
                                </label>
                            </div>
                            <div class="name">
                                <label>
                                    <input type="text" name="name" maxlength="10" required pattern="^.{1,}$" data-regex="<%=Regex.NAME%>">
                                    <span>이름</span>
                                    <div class="xicon"><img src="/resources/images/icon_x.png"></div>
                                    <div class="checkicon"><img src="/resources/images/icon_check.png"></div>
                                </label>
                            </div>
                            <div class="nickname">
                                <label>
                                    <input type="text" name="nickname" maxlength="20" required pattern="^.{1,}$" data-regex="<%=Regex.NICKNAME%>">
                                    <span>별명</span>
                                    <div class="xicon"><img src="/resources/images/icon_x.png"></div>
                                    <div class="checkicon"><img src="/resources/images/icon_check.png"></div>
                                </label>
                            </div>
                            <div class="password">
                                <label>
                                    <input type="password" name="password" maxlength="100" required pattern="^.{1,}$" data-regex="<%=Regex.PASSWORD%>">
                                    <span>비밀번호</span>
                                    <div class="xicon"><img src="/resources/images/icon_x.png"></div>
                                    <div class="checkicon"><img src="/resources/images/icon_check.png"></div>
                                </label>
                            </div>
                            <div class="passwordCheck">
                                <label>
                                    <input type="password" name="passwordCheck" maxlength="100" required pattern="^.{1,}$" data-regex="<%=Regex.PASSWORD%>">
                                    <span>비밀번호확인</span>
                                    <div class="xicon"><img src="/resources/images/icon_x.png"></div>
                                    <div class="checkicon"><img src="/resources/images/icon_check.png"></div>
                                </label>
                            </div>
                            <div class="security">
                                <label>
                                    <input type="text" name="security" maxlength="10" required pattern="^.{1,}$" data-regex="<%=Regex.SECURITY_CODE%>">
                                    <span>확인코드</span>
                                    <div class="xicon"><img src="/resources/images/icon_x.png"></div>
                                    <div class="checkicon"><img src="/resources/images/icon_check.png"></div>
                                </label>
                            </div>
                            <div class="register_button">
                                <input type="submit" value="가입" disabled>
                            </div>
                        </form>
                    </div>
                    <div class="login">
                        계정이 있으신가요?&nbsp;&nbsp;
                        <a href="login"><strong>로그인</strong></a>
                    </div>
                </div>
            </div>
        </section>
        <footer>
            <div>소개 블로그 채용 정보 도움말 API 개인정보처리방침 약관 인기 계정 해시태그 위치</div>
            <div>ⓒ 2021 어쩌고 저쩌고</div>
        </footer>
    </div>
</main>
</body>
</html>