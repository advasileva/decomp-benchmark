package org.benchmark.decoration;

public class WrappedAnimal implements Animal {
    protected Animal animal;

    public WrappedAnimal(Animal animal) {
        this.animal = animal;
    }

    public String sound(String suffix) {
        return animal.sound(suffix);
    }
}