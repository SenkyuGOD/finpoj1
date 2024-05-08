package edu.training.web.newsproject.service.impl;

import edu.training.web.newsproject.beans.News;
import edu.training.web.newsproject.service.InfoService;

import java.util.ArrayList;
import java.util.List;

public class InfoServiceImpl implements InfoService {
    @Override
    public List<News> lastNews() {
        List<News> news = new ArrayList<>();
        news.add(new News(1,
                "Объявлена официальная дата релиза S.T.A.L.K.E.R. 2",
                "В 30-секундном трейлере сообщается, что игра выйдет 5 сентября 2024 года и уже доступна к предзаказу. Новая часть \\\"Сталкера\\\" называется \\\"Сердце Чернобыля\\\", как сообщает разработчик в своем аккаунте в X (бывший Twitter), больше релиз переноситься не будет.",
                "img/stalker.jpg"));
        news.add(new News(2,
                "6 июня Assassin’s Creed Mirage пропишется на iPhone 15 Pro и iPad",
                " Assassin’s Creed Mirage устремится на девайсы от Apple чуть позже запланированного — 6 июня. Как подчеркнули в Ubisoft, приключение Басима станет первой игрой в серии, портированной с консолей на мобильные устройства.\n" +
                        "\n" +
                        "Переносом экшена занималась Ubisoft Sofia, которая обеспечила удобное управление касанием, а также предусмотрела поддержку контроллеров, кросс-сохранения и кросс-покупку (но только между iPhone и iPad). Проект оснастят 90-минутным пробным периодом.\n" +
                        "\n" +
                        "«Мираж» поселится на iPhone 15 Pro, iPhone 15 Pro Max, iPad Air и iPad Pro, в основе которых лежит чип M1 или новее. Цена вопроса — 49,99 доллара. Кроме того, в наличии дополнительный контент за отдельную плату. Среди поддерживаемых языков есть русский, но в России игра недоступна.\n" +
                        "\n" +
                        "Напомним, Apple взяла курс на гейминг и активно продвигает свои новейшие устройства как отличную платформу для игр. На «яблочных» девайсах уже вышли ремейк  Resident Evil 4,  Resident Evil Village и  Death Stranding.",
                "img/assassin.jpg"));

        return news;
    }

    @Override
    public List<News> getNews(int id) {
        List<News> lastNews = lastNews();
        List<News> result = new ArrayList<>();
        for (News news : lastNews) {
            if (news.getNewsId() == id) {
                result.add(news);
            }
        }
        return result;
    }
}
