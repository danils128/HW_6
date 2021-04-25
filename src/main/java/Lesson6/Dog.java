package Lesson6;

public class Dog extends Animal {
    final int Max_run = 500;
    final int Max_swim = 10;

    public Dog(String name) {
        super();
        this.name = name;

    }

       @Override
    public void run(int length_run) {
        if (length_run == 0) {
            System.out.println("Пес " + name + " прилег и лежит ");
        } else if (length_run <= Max_run ){
            System.out.println("Пес " + name + " пробежал " + length_run);
        }
        else{
            System.out.println("Пес столько не пробежит, ему лень");

        }
    }

    @Override
    public void swim(int length_swim){
        if (length_swim == 0) {
            System.out.println("Пес " + name + " прилег и лежит ");
        } else if (length_swim <= Max_swim ){
            System.out.println("Пес " + name + " пробежал " + length_swim);
        }
        else{
            System.out.println("Пес столько не пробежит, ему лень");

        }
    }
}

