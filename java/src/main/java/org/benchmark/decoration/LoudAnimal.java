package org.benchmark.decoration;

public final class LoudAnimal extends WrappedAnimal {
    public LoudAnimal(Animal animal) {
        super(animal);
    }

    @Override
    public String sound(String suffix) {
        String volume = raiseVolume();
        return animal.sound(suffix + volume);
    }

    private String raiseVolume() {
        return "Volume raised";
    }
}
