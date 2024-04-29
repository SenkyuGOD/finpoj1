<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" href="<c:url value="/css/style.css"/>">
    <link rel="stylesheet" media='screen and (max-width: 768px)' href="./CSS/mobile.css">
    <link href="https://fonts.googleapis.com/css?family=Lato|Staatliches&display=swap" rel="stylesheet">
    <link rel="shortcut icon" type="image/x-icon" href="<c:url value="/img/favicon.ico"/>">
    <script src="https://kit.fontawesome.com/85a5fdd30e.js" async></script>

    <title>NewsGrid | Article</title>
</head>

<body>
<nav id="main-nav">
    <div class="container">
        <img src="<c:url value="/img/logo.png"/>" alt="NewsMedia" class="logo">
        <div class='social'>
            <a href="http://facebook.com.br" target='blank'><i class="fab fa-facebook fa-2x"></i></a>
            <a href="http://twitter.com.br" target='blank'><i class="fab fa-twitter fa-2x"></i></a>
            <a href="http://instagram.com.br" target='blank'><i class="fab fa-instagram fa-2x"></i></a>
            <a href="http://youtube.com.br" target='blank'><i class="fab fa-youtube fa-2x"></i></a>
        </div>
        <ul>
            <li><a href="MyController?command=go_to_index_page">На главную</a></li>
            <li><a href="about.html">О нас</a></li>
        </ul>
    </div>
</nav>

<section id="article">
    <div class="container">
        <div class="page-container">
            <article class="card">
                <img src="<c:url value="/img/sport.jpg"/>" alt="article">
                <h1 class='l-heading'><c:out value="${requestScope.mainNews[1].title}" /></h1>
                <div class="meta">
                    <small>
                        <i class="fas fa-user"></i><c:out value="${requestScope.mainNews[1].author}" />
                    </small>
                    <div class="category category-ent">Спорт</div>
                </div>
                <p><c:out value="${requestScope.mainNews[1].content}" /></p>
            </article>
            <aside class="card bg-secondary">
                <h2>Присоединяйтесь к нам</h2>
                <p>Регистрируйся на нашем портале и подписывайся на новости которые тебе интересны</p>
                <a href="#" class='btn btn-dak btn-block'>Зарегистрироватсья</a>
            </aside>
            <aside id="categories" class="card">
                <h2>Категории</h2>
                <ul class="list">
                    <li><a href="#"><i class="fas fa-chevron-right"></i>Спорт</a></li>
                    <li><a href="#"><i class="fas fa-chevron-right"></i>Игры и развлечения</a></li>
                    <li><a href="#"><i class="fas fa-chevron-right"></i>Технологии</a></li>
                    <li><a href="#"><i class="fas fa-chevron-right"></i>Мода</a></li>
                </ul>
            </aside>
        </div>
    </div>
</section>

<footer id='main-footer' class='py-2'>
    <div class="container footer-container">
        <div>
            <img src="<c:url value="/img/logo_light.png"/>" alt="logo">
            <p>Наш новостной портал — ваш надежный источник актуальной информации о событиях мира. Будьте в курсе с нашими последними обновлениями!</p>
        </div>
        <div>
            <h3>Электронная рассылка</h3>
            <p>Подпишитесь на нашу рассылку и тогда вы сможете получать новости самыми первыми</p>
            <form>
                <input type="email" placeholder="Email:" required>
                <input type="submit" value="подписаться" class='btn btn-primary'>
            </form>
        </div>
        <div>
            <h3>Полезные ссылки</h3>
            <ul class='list'>
                <li><a href="#">Поддержка</a></li>
                <li><a href="#">Правила политики</a></li>
                <li><a href="#">О нас</a></li>
                <li><a href="#">Контакты</a></li>
            </ul>
        </div>
        <div>
            <p>
                Все права защищены &copy; 2019.
            </p>
        </div>
    </div>
</footer>
</body>
</html>