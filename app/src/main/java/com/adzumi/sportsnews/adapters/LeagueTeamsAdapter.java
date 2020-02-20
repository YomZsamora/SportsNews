package com.adzumi.sportsnews.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.adzumi.sportsnews.R;
import com.adzumi.sportsnews.models.Team;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LeagueTeamsAdapter extends RecyclerView.Adapter<LeagueTeamsAdapter.CustomViewHolder> {

    private List<Team> mTeam;
    private Context context;

    public LeagueTeamsAdapter(Context context,List<Team> mTeam){
        this.context = context;
        this.mTeam = mTeam;
    }

    class CustomViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public final View mView;

        @BindView(R.id.teamNameTextView) TextView mTeamNameTextView;
        @BindView(R.id.stadiumTextView) TextView mStadiumTextView;
        @BindView(R.id.ratingTextView) TextView mRatingTextView;
        @BindView(R.id.textView2) TextView mTextView2;
        @BindView(R.id.locationTextView) TextView mLocationTextView;

        CustomViewHolder(View itemView) {
            super(itemView);
            mView = itemView;
            ButterKnife.bind(this, mView);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int itemPosition = getAdapterPosition();
        }
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.league_team_details_item, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder holder, int position) {
        holder.mTeamNameTextView.setText(mTeam.get(position).getStrTeam());
        holder.mTextView2.setText(mTeam.get(position).getStrDescriptionEN());
        holder.mRatingTextView.setText(mTeam.get(position).getStrWebsite());
        holder.mStadiumTextView.setText(mTeam.get(position).getStrStadium());
        holder.mLocationTextView.setText(mTeam.get(position).getStrStadiumLocation());
    }

    @Override
    public int getItemCount() {
        return mTeam.size();
    }
}
