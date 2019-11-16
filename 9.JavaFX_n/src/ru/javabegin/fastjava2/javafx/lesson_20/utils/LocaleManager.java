package ru.javabegin.fastjava2.javafx.lesson_20.utils;


import ru.javabegin.fastjava2.javafx.lesson_20.objects.Lang;

import java.util.Locale;

public class LocaleManager {

    public static final Locale RU_LOCALE = new Locale("ru");
    public static final Locale EN_LOCALE = new Locale("en");

    private static Lang currentLang;

    public static Lang getCurrentLang() {
        return currentLang;
    }

    public static void setCurrentLang(Lang currentLang) {
        LocaleManager.currentLang = currentLang;
    }
}