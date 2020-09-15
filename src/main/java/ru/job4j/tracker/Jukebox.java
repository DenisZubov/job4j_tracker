package ru.job4j.tracker;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Пусть бегут неуклюже");
        }
            if (position == 2) {
                System.out.println("Спят усталые игрушки, книжки спят");
            }
        else {
            System.out.println("Песня не найдена");
        }
            }
    public static void main(String[] args) {
        Jukebox petya = new Jukebox();
        petya.music(1);
        petya.music(2);
        petya.music(3);
    }

}


