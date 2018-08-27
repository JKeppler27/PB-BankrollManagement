package com.floodline.android.pokerbuddy_bankrollmanagement.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.floodline.android.pokerbuddy_bankrollmanagement.R;
import com.floodline.android.pokerbuddy_bankrollmanagement.models.SessionsCore;

import java.util.List;

/**
 * Created by Wraith on 1/23/2018.
 */

public class SessionsCoreAdapter extends RecyclerView.Adapter<SessionsCoreAdapter.MyViewHolder>{
    private List<SessionsCore> sessionsCoreList;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView coreID;
        public TextView entryDate;

        public MyViewHolder(View view){
            super(view);
            coreID = (TextView) view.findViewById(R.id.coreID);
            entryDate = (TextView) view.findViewById(R.id.entryDate);
        }
    }

    public SessionsCoreAdapter(List<SessionsCore> sessionsCoreList){
        this.sessionsCoreList = sessionsCoreList;
    }

    @Override
    public SessionsCoreAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.sessionscore_list_row, parent, false);
        return new SessionsCoreAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(SessionsCoreAdapter.MyViewHolder holder, int position){
        SessionsCore sessionsCore = sessionsCoreList.get(position);
        holder.coreID.setText("Session ID: " + Integer.toString(sessionsCore.getCoreID()));
        holder.entryDate.setText("Entry Date: " + sessionsCore.getEntryDate());
    }

    @Override
    public int getItemCount(){
        return sessionsCoreList.size();
    }
}
