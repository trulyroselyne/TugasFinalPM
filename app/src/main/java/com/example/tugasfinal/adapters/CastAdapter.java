package com.example.tugasfinal.adapters;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tugasfinal.R;
import com.example.tugasfinal.models.Casts;
import com.example.tugasfinal.network.Const;
import com.example.tugasfinal.utils.OnItemClick;

import java.util.List;


public class CastAdapter extends RecyclerView.Adapter<CastAdapter.ViewHolder> {

    private List<Casts> casts;


    public CastAdapter(List<Casts> casts){
        this.casts = casts;

    }

    @NonNull
    @Override
    public CastAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_view_cast, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull   CastAdapter.ViewHolder holder, int position) {
        Glide.with(holder.itemView.getContext())
                .load(Const.IMG_URL_200 + casts.get(position)
                        .getProfilePicture())
                .into(holder.civProfile);
        holder.tvActorName.setText(casts.get(position).getName());
        holder.tvCharacterName.setText(casts.get(position).getCharacter());
    }

    @Override
    public int getItemCount() {
        return casts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView civProfile;
        TextView tvActorName, tvCharacterName;

        public ViewHolder(@NonNull  View itemView) {
            super(itemView);
            civProfile = itemView.findViewById(R.id.civ_profile_picture);
            tvActorName = itemView.findViewById(R.id.tv_actor_name);
            tvCharacterName = itemView.findViewById(R.id.tv_character_name);
        }
    }
}
