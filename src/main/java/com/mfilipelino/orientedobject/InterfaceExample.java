package com.mfilipelino.orientedobject;

import java.util.Random;

interface IntSequence {
    boolean hasNext();
    int next();
}

class SquareSequence implements IntSequence {
    private int i;

    public boolean hasNext(){
        return true;
    }

    public int next(){
        i++;
        return i * i;
    }
}


class RandomSequence implements IntSequence {

    private Random random = new Random();

    public boolean hasNext(){
        return true;
    }

    public int next(){
        return random.nextInt();
    }

    public double getDouble(){
        return random.nextDouble();
    }

}

public class InterfaceExample {

    public static double averange(IntSequence seq, int n){
        int count = 0;
        double sum = 0;
        while (seq.hasNext() && count < n){
            count++;
            sum += seq.next();
        }
        return count == 0 ? 0: sum / count;
    }

    public static void main(String[] args) {
        IntSequence sequence;

        sequence = new SquareSequence();
        double vs = averange(sequence, 5);
        System.out.println(vs);

        sequence = new RandomSequence();
        double vr = averange(sequence, 5);
        System.out.println(vr);
    }
}