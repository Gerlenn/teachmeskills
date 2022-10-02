package com.example.lesson4;
public class MainRun{
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon();
        Crow crow = new Crow();
        pigeon.fly();
        crow.fly();
    }
}

class Pigeon extends Bird{
    @Override
    void fly() {
        System.out.println("Голубь летает");
    }
}
class Crow extends Bird{
    @Override
    void fly() {
        System.out.println("Ворона летает");
    }
}
abstract class Bird {
    abstract void fly();
}


