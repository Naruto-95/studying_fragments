package com.example.studying_fragments;

public interface PublisherGetter {
     Publisher getPublisher();
}
    //Обработчик подписок умеет подписывать наблюдателей, отписывать их и оповещать. Этот
     //   интерфейс нам нужен исключительно для того чтобы MainFragment смог получить Publisher из  MainActivity
