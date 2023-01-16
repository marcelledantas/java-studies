package Generics.Challenge;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team>  {


    private String name;
    private ArrayList<Team> teams = new ArrayList<>();


    public League(String name) {
        this.name = name;
    }

    public void addTeam(Team<T> team) {
        if (teams.contains(team)) {
            System.out.println(team.getName() + " is already is the league" + getName());
            return;
        }

        teams.add(team);
    }

    public void printTeams() {
        Collections.sort(teams);
        for (Team team : this.teams) {
            System.out.println(team.getName() + ": points = " + team.ranking());
        }
    }

    public String getName() {
        return name;
    }

}
