package Interfaces.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable{

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;


    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    @Override
    public List<String> write() {
       List<String> writeValues = new ArrayList<>();

        writeValues.add(this.name);
        writeValues.add(this.weapon);

        writeValues.add("" + this.getHitPoints()); // Another way to cast an int to String
        writeValues.add("" + this.strength);

       return writeValues;
    }

    @Override
    public void read(List<String> list) {
        if(list.isEmpty()){
            System.out.println("Player: list is empty");
            return;
        }
        setName(list.get(0));
        setWeapon(list.get(1));
        setHitPoints(Integer.parseInt(list.get(2)));
        setStrength(Integer.parseInt(list.get(3)));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name=" + name + ", " +
                "weapon =" + weapon + ", " +
                "hitPoints = " + hitPoints +
                "strength =" +  strength +
                "}";
    }
}
