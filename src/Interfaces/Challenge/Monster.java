package Interfaces.Challenge;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> writeValues = new ArrayList<>();
        writeValues.add(0, this.name);
        writeValues.add(1, String.valueOf(hitPoints));
        writeValues.add(2, String.valueOf(strength));

        return writeValues;
    }

    @Override
    public void read(List<String> savedValues) {
        if(!savedValues.isEmpty()){
            setName(savedValues.get(0));
            setHitPoints(Integer.parseInt(savedValues.get(1)));
            setStrength(Integer.parseInt(savedValues.get(2)));
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }
}
