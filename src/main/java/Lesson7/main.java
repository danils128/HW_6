package Lesson7;

import java.beans.IntrospectionException;

public class main {

    public static void main(String[] args) throws InterruptedException {
        Cat cat1 = new Cat("Буся");
        Cat cat2 = new Cat("Шелдон");
        Cat cat3 = new Cat("Вася");

        Plate plate = new Plate(15);

        plate.printInfo();

        cat1.eat(plate);

        plate.printInfo();

        while (plate.getFoodCount() > 0) {
            cat1.eat(plate);
            if (plate.getFoodCount() <= 0) {

            } else {
                plate.printInfo();
                Thread.sleep(2000);
            }
        }
    }
}


