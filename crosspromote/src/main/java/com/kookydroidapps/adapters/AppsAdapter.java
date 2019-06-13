package com.kookydroidapps.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.chip.Chip;
import com.kookydroidapps.crosspromote.R;
import com.kookydroidapps.modelclasses.App;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AppsAdapter extends RecyclerView.Adapter<AppsAdapter.ViewHolder> {
    private List<App> apps;
    Context context;
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public TextView nameTextView;
        public TextView descriptionTextView;
        public ImageView iconImageView;
        public Chip appChip;
        public ViewHolder(View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.appNameTV);
            descriptionTextView = itemView.findViewById(R.id.appDescriptionTV);
            iconImageView = itemView.findViewById(R.id.appIcon);
            appChip = itemView.findViewById(R.id.appChip);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public AppsAdapter(List<App> appsList, Context context1) {
        apps = appsList;
        context = context1;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public AppsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_app, parent, false);
        // set the view's size, margins, paddings and layout parameters
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        // - get element from your dataset at this position
        // - replace the contents of the view with that element
        holder.nameTextView.setText(apps.get(position).getName());
        holder.descriptionTextView.setText(apps.get(position).getDescription());

        Picasso.get().load(apps.get(position).getIconUrl()).placeholder(R.drawable.default_icon).into(holder.iconImageView);

        if (apps.get(position).getIsFree())
        {
            holder.appChip.setText("Download Free");
        }
        else
        {
            holder.appChip.setText("Buy");
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                context.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(apps.get(position).getDownloadUrl())));
            }
        });

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return apps.size();
    }
}