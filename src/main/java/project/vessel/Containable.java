package com.company.vessel;

import com.company.stuff.Transformable;

public interface Containable {
    void addStuff(Transformable stuff);

    Transformable removeStuff();

    boolean isEmpty();

    void open();

    public void warm(int temperature);
//в новом ТЗ нет упоминания

    int getFreeSpace();

    void close();
}

