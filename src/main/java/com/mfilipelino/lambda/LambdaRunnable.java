package com.mfilipelino.lambda;

public class LambdaRunnable {
    public static void main(String[] args) {
        Runnable task = () -> { for(int i = 0; i < 10; i++) System.out.println(i); };
        task.run();
    }
}
