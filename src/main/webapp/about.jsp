<%--
  Created by IntelliJ IDEA.
  User: refat
  Date: 29.09.22
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <title>Responsive Landing Page using HTML, CSS & Javascript</title>

    <!-- ==== STYLE.CSS ==== -->
    <link rel="stylesheet" href="css/accountStyle.css"/>

</head>
<body>
<!-- ==== HEADER ==== -->
<header class="container header">
    <!-- ==== NAVBAR ==== -->
    <nav class="nav">
        <div class="logo">
            <h2>Слава Україні.</h2>
        </div>

        <div class="nav_menu" id="nav_menu">
            <button class="close_btn" id="close_btn">
                <i class="ri-close-fill"></i>
            </button>

            <ul class="nav_menu_list">
                <li class="nav_menu_item">
                    <a class="form-recovery" href="http://localhost:8080/account">Ваш акаунт</a>
                </li>
                <li class="nav_menu_item">
                    <a class="form-recovery" href="http://localhost:8080/about">О нас</a>
                </li>
                <li class="nav_menu_item">
                    <a href="#" class="form-recovery">Наші послуги</a>
                </li>
                <li class="nav_menu_item">
                    <a href="#" class="form-recovery">Контакти</a>
                </li>
            </ul>
        </div>

        <button class="toggle_btn" id="toggle_btn">
            <i class="ri-menu-line"></i>
        </button>
    </nav>
</header>

<section class="wrapper">
    <div class="container">
        <div class="grid-cols-2">
            <div class="grid-item-1">
                <h1 class="main-heading">
                     <span> (Название).</span>

                </h1>
                <p class="info-text">
                    (Название) це розробка що дає можливість захистити себе в просторі та дає можливість спілкуванню без наслідків.
                    Ми є провідною компанією в області анонімного спілкування.
                    (Название) це важлива розробка яка вам потрібна.
                </p>


            </div>
            <div class="grid-item-2">
                <div class="team_img_wrapper">
                    <img src="./img/team.svg" alt="team-img"/>
                </div>
            </div>
        </div>
    </div>
</section>

<section class="wrapper">
    <div class="container" data-aos="fade-up" data-aos-duration="1000">
        <div class="grid-cols-3">
            <div class="grid-col-item">
                <div class="icon">

                    <svg
                            fill="none"
                            viewBox="0 0 24 24"
                            stroke="currentColor"
                    >
                        <path
                                stroke-linecap="round"
                                stroke-linejoin="round"
                                stroke-width="2"
                                d="M9.75 17L9 20l-1 1h8l-1-1-.75-3M3 13h18M5 17h14a2 2 0 002-2V5a2 2 0 00-2-2H5a2 2 0 00-2 2v10a2 2 0 002 2z"></path>
                    </svg>
                </div>
                <div class="featured_info">
                    <a class="form-recovery" href="http://localhost:8080/app">
                    <span>Завантажуй наш додаток </span>
                    <p>
                        За цим посилання ви можете завантажити наш додаток що допоможіть вам спілкуватися.
                    </p>
                    </a>
                </div>
            </div>
            <div class="grid-col-item">
                <div class="icon">
                    <svg
                            fill="none"
                            viewBox="0 0 24 24"
                            stroke="currentColor"
                    >
                        <path
                                stroke-linecap="round"
                                stroke-linejoin="round"
                                stroke-width="2"
                                d="M17 14v6m-3-3h6M6 10h2a2 2 0 002-2V6a2 2 0 00-2-2H6a2 2 0 00-2 2v2a2 2 0 002 2zm10 0h2a2 2 0 002-2V6a2 2 0 00-2-2h-2a2 2 0 00-2 2v2a2 2 0 002 2zM6 20h2a2 2 0 002-2v-2a2 2 0 00-2-2H6a2 2 0 00-2 2v2a2 2 0 002 2z"></path>
                    </svg>
                </div>
                <div class="featured_info">
                    <a class="form-recovery" href="http://localhost:8080/download">
                        <span>Завантажуйте цікаві матеріали</span>
                    <p>
                        Ви можете завантажити цікаві матеріали стосовно захисту вашої інформації!
                    </p>
                    </a>
                </div>
            </div>

            <div class="grid-col-item">
                <div class="icon">
                    <svg
                            fill="none"
                            viewBox="0 0 24 24"
                            stroke="currentColor"
                    >
                        <path
                                stroke-linecap="round"
                                stroke-linejoin="round"
                                stroke-width="2"
                                d="M10 20l4-16m4 4l4 4-4 4M6 16l-4-4 4-4"></path>
                    </svg>
                </div>
                <div class="featured_info">
                    <a class="form-recovery" href="http://localhost:8080/ideas">
                        <span>Допоможіть нам в розробці</span>
                    <p>
                       Нам дуже цікаві ваші ідеї ваші пропозиції що до вдосконалення нашого проєкту. напишіть нам за цим посилання!</p></a>

                </div>
            </div>
        </div>
    </div>
</section>

</body>
</html>