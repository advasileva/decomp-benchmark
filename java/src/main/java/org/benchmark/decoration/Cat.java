package org.benchmark.decoration;

public final class Cat implements Animal {
    public String sound(String suffix) {
        return "Meow" + suffix;
    }
}
