package com.san;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<String> list = new ArrayList();
        list.add("Яблоко");
        list.add("Груша");
        list.add("Слива");
        list.add("Яблоко");
        list.add("Груша");
        list.add("Слива");
        list.add("Вишня");
        list.add("Малина");
        list.add("Айва");
        list.add("Яблоко");
        list.add("Груша");
        list.add("Слива");
        list.add("Вишня");
        list.add("Малина");
        list.add("Айва");
        list.add("Манго");
        list.add("Арбуз");
        list.add("Дыня");
        list.add("Черешня");
        list.add("Лимон");
        list.add("Виноград");
        list.add("Манго");
        list.add("Арбуз");
        list.add("Дыня");
        list.add("Черешня");
        list.add("Лимон");
        list.add("Виноград");
        list.add("Лайм");
        list.add("Папая");
        list.add("Морошка");


        int count;

        for (String s : list) {
            count = Collections.frequency(list, s);
            System.out.println(s+" = "+count);

        }

        Set<String> set = new HashSet<>(list);
        System.out.println(set);

        Book book = new Book("Петров", "1-2-3");

        System.out.println("Имя: " + book.getName());
        System.out.println("Телефон: " + book.getNumber());

        book.setName("Иванов");
        book.setNumber("3-2-1");

        System.out.println("Имя: " + book.getName());
        System.out.println("Телефон: " + book.getNumber());

    }
}
