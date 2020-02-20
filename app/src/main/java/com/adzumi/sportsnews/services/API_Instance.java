package com.adzumi.sportsnews.services;

import com.adzumi.sportsnews.models.LeagueTeams;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface API_Instance {
    @GET("lookup_all_teams.php")
    Call<LeagueTeams> lookUpAllTeamsInLeague(@Query("id") int leagueId);
}
