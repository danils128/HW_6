package Lesson6;

public class Animal {
    String name;
    public static int count;
    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
        super();
        this.count++;
    }

    public void info() {
        System.out.println("Животное по кличке " + name);
    }

    public void run(int length_run) {

    }

    public void swim(int length_swim) {

    }

}
