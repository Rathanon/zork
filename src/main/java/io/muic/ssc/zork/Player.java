package io.muic.ssc.zork;

public class Player {

    public int health;
    public int power;


    public Player(int health, int power) {
        this.health = health;
        this.power = power;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
