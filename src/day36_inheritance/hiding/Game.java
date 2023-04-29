package day36_inheritance.hiding;

import day36_inheritance.final_example.Main;

public class Game {
    public static void main(String[] args) {
        Soccer obj1 = new Soccer();
//        obj1.cheer;

        Soccer.cheer();
    }
}
