<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Responsive Landing Page using HTML, CSS & Javascript</title>

    <!-- ==== STYLE.CSS ==== -->
    <link rel="stylesheet" href="css/accountStyle.css" />

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
                    <a class="form-recovery" href="http://localhost:8080/account.jsp">Ваш акаунт</a>
                </li>
                <li class="nav_menu_item">
                    <a href="#" class="form-recovery" >О нас</a>
                </li>
                <li class="nav_menu_item">
                    <a href="#" class="form-recovery" >Наші послуги</a>
                </li>
                <li class="nav_menu_item">
                    <a href="#" class="form-recovery" >Контакти</a>
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
                    Ваша персональна <span> сторінка.</span>
                    <br />
                    Вася Пупкин.
                </h1>
                <p class="info-text">
                    Цей сайт створений для персональних клієнтів. Тут Ви можете побачити основну інформацію яка вам потрибна.
                </p>

                <div class="btn_wrapper">
                    <button class="btn view_more_btn">
                        Показати новий код <i class="ri-arrow-right-line"></i>
                    </button>

                    <button class="btn documentation_btn">завантажити сертіфікат з QR</button>
                </div>
            </div>
            <div class="grid-item-2">
                <div class="team_img_wrapper">
                    <img src="./img/9c7.jpg" alt="team-img" />
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
                                d="M9.75 17L9 20l-1 1h8l-1-1-.75-3M3 13h18M5 17h14a2 2 0 002-2V5a2 2 0 00-2-2H5a2 2 0 00-2 2v10a2 2 0 002 2z"
                        />
                    </svg>
                </div>
                <div class="featured_info">
                    <span>Створено для особистих клієнтів </span>
                    <p>
                        Ми створені для того щоб ви могли спілкватися та не турбуватися за свою інформацію. Ви є цінним для нас тому ми надаємо такі послуги щоб ви не турбувалися.
                    </p>
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
                                d="M17 14v6m-3-3h6M6 10h2a2 2 0 002-2V6a2 2 0 00-2-2H6a2 2 0 00-2 2v2a2 2 0 002 2zm10 0h2a2 2 0 002-2V6a2 2 0 00-2-2h-2a2 2 0 00-2 2v2a2 2 0 002 2zM6 20h2a2 2 0 002-2v-2a2 2 0 00-2-2H6a2 2 0 00-2 2v2a2 2 0 002 2z"
                        />
                    </svg>
                </div>
                <div class="featured_info">
                    <span>Створено, щоб бути сучасним</span>
                    <p>
                        тут буде якась інформація Бла бла бла бла бла. тут если пили !
                    </p>
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
                                d="M10 20l4-16m4 4l4 4-4 4M6 16l-4-4 4-4"
                        />
                    </svg>
                </div>
                <div class="featured_info">
                    <span>Документи для чогось</span>
                    <p>
                        Будет якась інформацію про шось поки шо не знаю про шос але тут буде шось що будет потрібно для людей!
                    </p>
                </div>
            </div>
        </div>
    </div>
</section>

</body>
</html>
