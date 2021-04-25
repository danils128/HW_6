package Lesson6;

public class Cat extends Animal {
    String name;
    final int Max_run = 200;

    public Cat(String name) {
        super();
        this.name = name;

    }

    @Override
    public void run(int length_run) {
        if (length_run == 0) {
            System.out.println("Котик " + name + " прилег и лежит ");
        } else if (length_run <= Max_run ){
            System.out.println("Котик " + name + " пробежал " + length_run);
        }
        else{
            System.out.println("Котик столько не пробежит, ему лень");

        }
    }


    @Override
    public void swim(int length_swim) {
        System.out.println("Котик не сабака, он не поплывет, ему лень");
    }

}
