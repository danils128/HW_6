package Lesson7;

import java.util.Random;

public class Cat {
    Random random = new Random();
    private String name;
    private int max_satiety = 20;
    private int satiety;


    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        if (satiety < max_satiety) {
            satiety += random.nextInt(4) + 3;
            plate.decreaseFood(satiety);
        }

    }
}