package Lesson6;

public class main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Буся");
        Cat cat2 = new Cat("Пирожок");
        Cat cat3 = new Cat("Астрид");
        Cat cat4 = new Cat("Шелдон");
        Dog dog1 = new Dog("Микки");
        Dog dog2 = new Dog("Псина");


        cat1.run(120);
        cat2.run(0);
        cat3.run(12);
        cat4.run(228);

        cat1.swim(22);

        dog1.run(22);
        dog2.run(560);

        dog1.swim(21);
        dog2.swim(5);

        System.out.println("Всего " + Animal.count + " животных");
    }
}