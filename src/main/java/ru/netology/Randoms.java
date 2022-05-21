package ru.netology;

import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    int min;
    int max;

    public Randoms(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public int getRandomNumber() {
        return random.nextInt(((max - min) + 1)) + min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                return getRandomNumber();
            }
        };
    }

}
