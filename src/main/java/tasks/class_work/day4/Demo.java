package com.company;

public class Demo {
    public static void Main(String[] args) {
        OuterClass.InnerClass oic = new OuterClass().new InnerClass();
        OuterClass.InnerStaticClass oisc = new OuterClass.InnerStaticClass()

        new OuterClass().new InnerClass().doInnerClass();
        new OuterClass.InnerStaticClass().doInnerStaticClass();
    }
}
