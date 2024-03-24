package org.benchmark.decoration;

public final class LoudAnimal extends WrappedAnimal {
    public LoudAnimal(Animal animal) {
        super(animal);
    }

    @Override
    public String sound(String suffix) {
        raiseVolume();
        return animal.sound(suffix);
    }

    private void raiseVolume() {
        return;
    }
}
