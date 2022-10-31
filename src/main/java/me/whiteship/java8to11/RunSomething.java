package me.whiteship.java8to11;

@FunctionalInterface
public interface RunSomething {

    abstract void doIt();

    static void printName() {
        System.out.println("Youngjin");
    }

    default void printAge() {
        System.out.println("27");
    }

}
