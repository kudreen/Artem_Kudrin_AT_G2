package com.company;

public class Bottle {
    int volume = 1;
    SparklingWater w = new SparklingWater();

    public void open() {
        //тут проверил состояние бутылки, кажется это не ок, её нужно принудительно открыть?
        if (w.isOpened = false) {
            w.isOpened = !w.isOpened;
        }
    }
}


