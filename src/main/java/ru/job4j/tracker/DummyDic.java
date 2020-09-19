package ru.job4j.tracker;

public class DummyDic {

    public static String engToRus(String eng) {
        String word = "Неизвестное слово " + eng;
        return word;
    }

    public static void main(String[] args) {
        String dog = "dog";
        String say = engToRus(dog);
        System.out.println(say);
    }
}