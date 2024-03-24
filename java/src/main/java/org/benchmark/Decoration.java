package org.benchmark;

import org.benchmark.decoration.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode(Mode.AverageTime)
@Fork(5)
@Warmup(iterations = 3)
@Measurement(iterations = 10)
public class Decoration {
    private static long numberOfIterations = 10000000L;

    @Benchmark
    public void measure1WithoutDecorators(Blackhole bh) {
        Animal cat = new Cat();

        for (long i = 0; i < this.numberOfIterations; i++) {
            bh.consume(cat.sound(Long.toString(i)));
        }
    }

    @Benchmark
    public void measure2WithOneDecorator(Blackhole bh) {
        Animal cat = new Cat();

        int numberOfDecorators = 1;
        for (int i = 0; i < numberOfDecorators; i++) {
            cat = new LoudAnimal(cat);
        }

        for (long i = 0; i < this.numberOfIterations; i++) {
            bh.consume(cat.sound(Long.toString(i)));
        }
    }

    @Benchmark
    public void measure3WithTwoDecorators(Blackhole bh) {
        Animal cat = new Cat();

        int numberOfDecorators = 2;
        for (int i = 0; i < numberOfDecorators; i++) {
            cat = new LoudAnimal(cat);
        }

        for (long i = 0; i < this.numberOfIterations; i++) {
            bh.consume(cat.sound(Long.toString(i)));
        }
    }

    @Benchmark
    public void measure4WithFiveDecorators(Blackhole bh) {
        Animal cat = new Cat();

        int numberOfDecorators = 5;
        for (int i = 0; i < numberOfDecorators; i++) {
            cat = new LoudAnimal(cat);
        }

        for (long i = 0; i < this.numberOfIterations; i++) {
            bh.consume(cat.sound(Long.toString(i)));
        }
    }

    @Benchmark
    public void measure5WithTenDecorators(Blackhole bh) {
        Animal cat = new Cat();

        int numberOfDecorators = 10;
        for (int i = 0; i < numberOfDecorators; i++) {
            cat = new LoudAnimal(cat);
        }

        for (long i = 0; i < this.numberOfIterations; i++) {
            bh.consume(cat.sound(Long.toString(i)));
        }
    }
}
