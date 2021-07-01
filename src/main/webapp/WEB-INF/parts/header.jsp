<%@ page language="java" contentType="text/html" pageEncoding="UTF-8" trimDirectiveWhitespaces="true" %>
<header>
    <form>
        <label>
            <span hidden>검색</span>
            <input maxlength="50" name="keyword" type="text" required pattern="^[ㄱ-ㅎ|가-힣|a-z|A-Z|0-9|]{1,}$">
            <span class="holder">
                    <img alt src="/resources/board/images/search.png">
                    <span>검색</span>
                </span>
        </label>
    </form>
    <div>
        <img alt="Instagram" src="/resources/images/instagram_logo_text.png">
        <div class="spring"></div>
        <ul>
            <li>
                <a href="#">
                    <img src="/resources/images/board/home_selected.png" alt="home">
                </a>
            </li>
            <li>
                <a href="direct">
                    <img src="/resources/images/board/direct_line.png" alt="direct">
                    <img class="clicked" src="/resources/images/board/direct_selected.png">
                </a>
            </li>
            <li>
                <a href="#">
                    <img src="/resources/images/board/write_line.png" alt="write">
                </a>
            </li>
            <li>
                <a href="#">
                    <img src="/resources/images/board/like_line.png" alt="like">
                </a>
            </li>
            <li class="profile">
                <a href="#">
                    <img src="/resources/images/board/user.png" alt="user">
                </a>
            </li>
        </ul>
    </div>
</header>