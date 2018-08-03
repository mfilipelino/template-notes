package com.mfilipelino.app;

class Bicycle {
    public Bicycle() {
        System.out.printf("Bicycle");
    }
}

class RoadBike extends Bicycle {
    public RoadBike() {
        System.out.printf("-> RoadBike");
    }
}

class MountainBike extends Bicycle {
    public MountainBike() {
        System.out.println("-> MountainBike");
    }
}

class TandemBike extends Bicycle {
    public TandemBike() {
        System.out.println("-> TandemBike");
    }
}

public class App {

    public static void main(String[] args) {
        new Bicycle();
        System.out.println();
        new RoadBike();
        System.out.println();
        new MountainBike();
        System.out.println();
    }
}


