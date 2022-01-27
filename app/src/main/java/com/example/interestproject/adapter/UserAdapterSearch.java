package com.example.interestproject.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.interestproject.R;
import com.example.interestproject.model.User;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class UserAdapterSearch extends RecyclerView.Adapter<UserAdapterSearch.ViewHolder> {

    private Context mContext;
    private List<User> mUsers;
    private boolean isChat;

    public UserAdapterSearch(Context mContext, List<User> mUsers, boolean isChat){
        this.mContext = mContext;
        this.mUsers = mUsers;
        this.isChat = isChat;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.user_item_search, parent, false);
        return new UserAdapterSearch.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        User user = mUsers.get(position);
        holder.username.setText(user.getUsername());
        if(user.getImageURL().equals("default")){
            Glide.with(mContext)
                    .load("https://t4.ftcdn.net/jpg/00/64/67/63/360_F_64676383_LdbmhiNM6Ypzb3FM4PPuFP9rHe7ri8Ju.jpg")
                    .into(holder.profilePictureMessage);
        }
        else {
            Glide.with(mContext)
                    .load(user.getImageURL())
                    .into(holder.profilePictureMessage);
        }
        if(isChat){
            if(user.getStatus().equals("online")){
                holder.img_on.setVisibility(View.VISIBLE);
                holder.img_off.setVisibility(View.GONE);
            }else{
                holder.img_on.setVisibility(View.GONE);
                holder.img_off.setVisibility(View.VISIBLE);
            }
        } else {
            holder.img_on.setVisibility(View.GONE);
            holder.img_off.setVisibility(View.GONE);
        }
    }


    public User getItem(int position) {
        return mUsers.get(position);
    }

    @Override
    public int getItemCount() {
        return mUsers.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener, View.OnLongClickListener{

        public TextView username;
        public CircleImageView profilePictureMessage;

        public CircleImageView img_on;
        public CircleImageView img_off;

        public ViewHolder(View itemView){
            super(itemView);
            username = itemView.findViewById(R.id.user_item_search_username);
            profilePictureMessage = itemView.findViewById(R.id.user_item_search_profil_picture);

            img_on = itemView.findViewById(R.id.online_circle);
            img_off = itemView.findViewById(R.id.offline_circle);
            itemView.setOnClickListener(this);

        }

        @Override
        public void onClick(View v) {

        }

        @Override
        public boolean onLongClick(View v) {
            return false;
        }
    }
}
