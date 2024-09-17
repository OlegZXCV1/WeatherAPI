package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    /*
    * Реализовать заглушки и протестировать API сервиса данных о погоде.
Для получения представления о реально работающем сервисе необходимо зарегистрироваться на сайте https://www.weatherapi.com/.Для этого нужно указать адрес электронной почты и получить токен (API Key), который используется для запросов. Бесплатный ключ действует две недели.
Документация по API - https://www.weatherapi.com/docs/.
Используя любой BDD фреймворк, реализовать заглушки на WireMock и протестировать:
Позитивный тест:
• Запросить текущую погоду минимум по четырем городам на свой выбор.
• Распарсить результат, сравнить с ожидаемыми значениями из тестового.
• Вывести расхождения по результату сравнения по каждому значению в лог.
Негативный тест:
• Получить 4 варианта ошибок из списка API Errors (на выбор), сравнить с ожидаемым результатом.
Результат выполнения тестов должен быть в отчете Allure.
*
*  Напоминаем, что итоговые тесты должны эмулироваться с помощью WireMock,
*  а не запрашивать сервис напрямую
    * */

}