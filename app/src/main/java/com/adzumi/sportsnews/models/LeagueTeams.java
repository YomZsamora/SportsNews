
package com.adzumi.sportsnews.models;

import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LeagueTeams implements Serializable
{

    @SerializedName("teams")
    @Expose
    private List<Team> teams = null;
    private final static long serialVersionUID = 5282479968241794770L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LeagueTeams() {
    }

    /**
     * 
     * @param teams
     */
    public LeagueTeams(List<Team> teams) {
        super();
        this.teams = teams;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

}
