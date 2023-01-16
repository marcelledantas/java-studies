package Generics.Final;

import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team>{
    private String name;
    private ArrayList<T> league = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean add(T team){
        if(league.contains(team)){
            return false;
        }
        league.add(team);
        return true;
    }

    public void showLeagueTable(){
        Collections.sort(this.league);
        for(T team : this.league){
            System.out.println(team.getName() + ": " + team.ranking());
        }
    }
}
