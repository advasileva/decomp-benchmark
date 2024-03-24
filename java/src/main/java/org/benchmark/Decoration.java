package org.benchmark;

import org.benchmark.decoration.*;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

@BenchmarkMode(Mode.AverageTime)
@Fork(1)
// @Fork(10)
@Warmup(iterations = 0)
@Measurement(iterations = 2)
public class Decoration {
    @Benchmark
    public void measureWithoutDecorators(Blackhole bh) {
        Animal cat = new Cat();
        for (long i = 0; i < 10000000000L; i++) {
            bh.consume(cat.sound(Long.toString(i)));
        }
    }

    @Benchmark
    public void measureWithOneDecorator(Blackhole bh) {
        Animal cat = new LoudAnimal(new Cat());
        for (long i = 0; i < 10000000000L; i++) {
            bh.consume(cat.sound(Long.toString(i)));
        }
    }

        @Benchmark
    public void measureWithTwoDecorators(Blackhole bh) {
        Animal cat = new LoudAnimal(new LoudAnimal(new Cat()));
        for (long i = 0; i < 10000000000L; i++) {
            bh.consume(cat.sound(Long.toString(i)));
        }
    }
}
