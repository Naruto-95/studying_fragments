package com.example.studying_fragments;

import java.util.ArrayList;
import java.util.List;

//Обработкчик подписок
public class Publisher {
    private final List<Observer> observers;// Все подписчики (Fragment1, Fragment2)


    public Publisher() {
        observers = new ArrayList<>();
    }

    // Подписать кого-то на событие, то есть сохранить в список с подписчиками
    public void clin(Observer observer) {
        observers.add(observer);
    }

    public void remove(Observer observer) {//отписать
        observers.remove(observer);
    }

    public void notifu(String text) {
        for (Observer observer : observers) {
            observer.updateText(text);
        }
    }
}
