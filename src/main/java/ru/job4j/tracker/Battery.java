package ru.job4j.tracker;

public class Battery {
    private int value;
    private int x;

    public Battery(int charge) {
        this.value = charge;
    }
    public void pour(Battery another) {
        another.value += this.value;
        this.value = 0;
    }
    public static void main(String[] args) {
        Battery first = new Battery(2);
        Battery second = new Battery(3);
        System.out.println("first : " + first.value + ". second : " + second.value);
        first.pour(second);
        System.out.println("first : " + first.value + ". second : " + second.value);

    }
}