package com.adzumi.sportsnews.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.adzumi.sportsnews.Constants;
import com.adzumi.sportsnews.R;
import com.adzumi.sportsnews.adapters.LeagueTeamsAdapter;
import com.adzumi.sportsnews.models.LeagueTeams;
import com.adzumi.sportsnews.models.Team;
import com.adzumi.sportsnews.services.API_Instance;
import com.adzumi.sportsnews.services.RetrofitClient;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.List;

import butterknife.ButterKnife;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    private DatabaseReference mSearchedTeamReference;
    private ValueEventListener mSearchedTeamReferenceListener;

    private RecyclerView recyclerView;
    private LeagueTeamsAdapter leagueTeamsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSearchedTeamReference = FirebaseDatabase
                .getInstance()
                .getReference()
                .child(Constants.FIREBASE_CHILD_SEARCHED_TEAM);

        mSearchedTeamReference.addValueEventListener(new ValueEventListener() { //attach listener

            @Override
            public void onDataChange(DataSnapshot dataSnapshot) { //something changed!
                for (DataSnapshot teamSnapshot : dataSnapshot.getChildren()) {
                    String team = teamSnapshot.getValue().toString();
                    Log.d("Teams updated", "Team: " + team); //log
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) { //update UI here if error occurred.

            }
        });

//        saveTeamToFirebase("Arsenal");

        getAllTeamsInLeaague();
    }

    public void getAllTeamsInLeaague() {
        API_Instance service = RetrofitClient.getClient().create(API_Instance.class);
        Call<LeagueTeams> call = service.lookUpAllTeamsInLeague(4328);
        Log.v("MY URL", String.valueOf(call.request().url()));

        call.enqueue(new Callback<LeagueTeams>() {
            @Override
            public void onResponse(Call<LeagueTeams> call, Response<LeagueTeams> response) {
                List<Team> teams = response.body().getTeams();
                lookUpAllTeamsInLeague(teams);
                for (Team e : teams) {
                    Log.v("MyResponse", e.getStrTeam());
                }
            }

            @Override
            public void onFailure(Call<LeagueTeams> call, Throwable t) {
                Toast.makeText(MainActivity.this, "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void lookUpAllTeamsInLeague(List<Team> teams) {
        recyclerView = findViewById(R.id.leagueTeamsRecyclerView);
        leagueTeamsAdapter = new LeagueTeamsAdapter(this,teams);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(leagueTeamsAdapter);
    }

    public void saveTeamToFirebase(String team) {
        mSearchedTeamReference.push().setValue(team);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mSearchedTeamReference.removeEventListener(mSearchedTeamReferenceListener);
    }
}
