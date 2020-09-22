package ru.job4j.tracker;

public class Cat {

    private String food;
    private String nick;

    public void show() {
        System.out.println(this.nick + " съел "+this.food);
    }
    public void eat(String meat) {
        this.food = meat;
    }

    public void nick(String nick) {
        this.nick =  nick;
    }

    public static void main(String[] args) {
        Cat gav = new Cat();
        gav.eat("котлету");
        gav.nick = "Гав";
        gav.show();
        Cat black = new Cat();
        black.eat("рыбу");
        black.nick = "Чёрный";
        black.show();
    }
}
