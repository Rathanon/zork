package io.muic.ssc.zork;

public class Room {

    private Monster monster;
    private Item item;
    private Weapon weapon;

    public Room(Monster monster, Item item, Weapon weapon) {
        this.monster = monster;
        this.item = item;
        this.weapon = weapon;
    }

    public Monster getMonster() {
        return monster;
    }

    public void setMonster(Monster monster) {
        this.monster = monster;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
